package com.gl.hashtable;

/**
 * This class contains the code for using the hashtable for different
 * operations like :
 *
 * search
 * insert
 * delete
 * rehash
 */
public class HashTableOperations {

  private final static int LOADFACTOR = 20 ;

  //Creating the hashtable itself
  public static HashTable createHashTable(int size){
    HashTable hashTable = new HashTable();

    //set the size of the hash table
    hashTable.settSize(size/LOADFACTOR);

    //This for loop will set the first node on each bucket as null, as no element is present yet
    for(int i=0;i<hashTable.gettSize();i++){
      hashTable.getTable()[i].setStartNode(null);
    }

    return hashTable;
  }

  /**
   * If we are able to confirm that data is present, then it will return 1
   *
   * if it's not present, this method will return 0
   * @param hashTable
   * @param data
   * @return
   */
  public static int search(HashTable hashTable , int data){
      //We need to find bucket index or HashTableNode index

      // 1. Find the hash of the data , and then % with the size of the hashTable

      ListNode temp = hashTable.getTable()[findTheIndexofHashTableNode(data, hashTable)]
          .getStartNode();

      while(temp!=null){
        if(temp.getData()==data){
          return 1 ;
        }
        temp = temp.getNext();
      }

      return 0; //data is not present in the hash table
  }

  /**
   * Insert a data in the hash table
   */
  public static void insert(HashTable hashTable , int data){

    int index ;
    ListNode temp , newNode ;
    if(search(hashTable,data)==1){
      return ; //data is already present
    }

    index = findTheIndexofHashTableNode(data,hashTable);

    temp = hashTable.getTable()[index].getStartNode();

    newNode = new ListNode();

    if(newNode ==null){
      System.out.println("Memory is full");
      return ;
    }

    newNode.setKey(index);
    newNode.setData(data);
    newNode.setNext(temp);

    hashTable.getTable()[index].setStartNode(newNode);

    hashTable.getTable()[index].
        setBucketCount(hashTable.getTable()[index].getBucketCount()+1);
    hashTable.setCount(hashTable.getCount()+1);
    //We need to check if it's condition to do the re hashing
    if(hashTable.getCount()/hashTable.gettSize() >LOADFACTOR){
      System.out.println("Hash table size needs to be increased. We need re-hashing");
    }
  }

  /**
   * deleting the data from the hash table
   */

  public static boolean delete(HashTable hashTable , int data){

    if(search(hashTable,data)!=1){
      return false ;
    }

    ListNode temp=null , prev = null ;
    int index  = findTheIndexofHashTableNode(data, hashTable);
    temp =  hashTable.getTable()[index].getStartNode();
    if(temp.getData() == data){
      temp = temp.getNext();
      hashTable.getTable()[index].setStartNode(temp);
      return true ;
    }
    while(temp!=null && temp.getData()!=data){
      prev = temp ;
      temp = temp.getNext();
    }
    //temp will be the node that contains the data, prev will be the one before it.

    prev.setNext(temp.getNext()); // this step will delete the
    return true ;
  }

  /**
   * This function will return hash integer value
   * @param data
   * @return
   */
  private static int hashFunction(int data){

    return (data*data + data*data*data + 456)*3 ;
  }

  /**
   * This will return me the index of the hashTableNode
   * @param data
   * @param hashTable
   * @return
   */
  private static int findTheIndexofHashTableNode(int data , HashTable hashTable){
    return hashFunction(data)%hashTable.gettSize();
  }


}
