package com.gl.hashtable;

/**
 * This will store the elements in the key value format.
 *
 * On an average case, it guarantees :
 * Insertion -- O(1)
 * Search -- O(1)
 * Deletion -- O(1)
 */
public class HashTable {

  private int tSize ; //size of the given Hash table / number of HashTableNodes or buckets

  private int count ;

  private HashTableNode[] table ;

  public HashTable(){

  }
  public HashTable(int tSize){
    this.tSize = tSize ;
    table = new HashTableNode[tSize];
    this.count=0;
  }

  public int gettSize() {
    return tSize;
  }

  public void settSize(int tSize) {
    this.tSize = tSize;
    this.table = new HashTableNode[tSize];
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public HashTableNode[] getTable() {
    return table;
  }

  public void setTable(HashTableNode[] table) {
    this.table = table;
  }
}
