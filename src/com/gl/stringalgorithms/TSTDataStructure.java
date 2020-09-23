package com.gl.stringalgorithms;

import java.util.ArrayList;

class TSTNode {
  char data ;
  boolean isLastChar ;
  TSTNode left ;
  TSTNode right ;
  TSTNode middle ;

  public TSTNode(char data){
    this.data = data ;
    isLastChar = false ;
    left= null;
    right = null;
    middle = null;
  }
}

public class TSTDataStructure {

  private static TSTNode root ;

  public TSTDataStructure(){
    root = null ;
  }

  public static TSTNode insertWord(TSTNode root , char[] word , int index){
    if(root == null){
      root = new TSTNode(word[index]);
    }

    if(word[index] <root.data){
      root.left = insertWord(root.left , word, index);
    }else if (word[index] >root.data ){
      root.right = insertWord(root.right, word, index);
    }else{
      if(index+1 < word.length){
        root.middle = insertWord(root.middle, word, index+1);
      }else{
        root.isLastChar = true ;
      }
    }
    return root ;
  }


  public static void deleteWord(TSTNode root , char[] word ,int index){
    if(root==null){
      return ;
    }

    if(word[index] <root.data){
      deleteWord(root.left,word, index);
    }else if(word[index] > root.data){
      deleteWord(root.right,word, index);
    }else{
      if(root.isLastChar && index == word.length-1){
        root.isLastChar = false;
      }else if( index +1 < word.length){
        deleteWord(root.middle, word, index+1);
      }
    }
  }


  public static boolean searchWord(TSTNode root , char[] word , int ptr){
    if(root == null){
      return false ;
    }

    if(word[ptr] <root.data){
      return searchWord(root.left, word, ptr);
    }else if(word[ptr] > root.data){
      return searchWord(root.right, word, ptr);
    }else{
      if(root.isLastChar && ptr== word.length-1){
        return true;
      }else if(ptr == word.length-1){
        return false ;
      }else{
        return searchWord(root.middle,word, ptr+1);
      }
    }
  }


  public static void traverseTST(TSTNode root ,String str){
    if(root ==null){
      return;
    }

    traverseTST(root.left,str);
    str = str + root.data;
    if(root.isLastChar){
      System.out.println(str);
    }
    traverseTST(root.middle, str);

    str = str.substring(0,str.length()-1);

    traverseTST(root.right, str);
  }



  public static void main(String[] args) {

    String keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};


    int i;
    TSTNode tstNode = null;
    for (i = 0; i < keys.length; i++) {
      tstNode = insertWord(tstNode, keys[i].toCharArray(), 0);
    }

    traverseTST(tstNode, "");

    System.out.println(searchWord(tstNode, "answer".toCharArray(), 0));

    deleteWord(tstNode, "answer".toCharArray(), 0);

    System.out.println(searchWord(tstNode, "answer".toCharArray(), 0));



  }
}


