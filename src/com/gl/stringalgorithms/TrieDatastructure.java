
package com.gl.stringalgorithms;

public class TrieDatastructure {
   static final int ALPHABET_LIMIT = 26;

   static class TrieNode {
     TrieNode[] children = new TrieNode[ALPHABET_LIMIT];
     boolean isLastChar;

     TrieNode() {
       isLastChar = false;
       for (int i = 0; i < ALPHABET_LIMIT; i++) {
         children[i] = null;
       }
     }
   }
     static TrieNode root ;

     public static void insertWord(String word){
       int level ;
       int len = word.length();
       int index ;

       TrieNode current = root;

       for (level = 0; level <len ; level++) {
         index = word.charAt(level) -'a';
         if(current.children[index] == null){
           current.children[index] = new TrieNode();
         }
         current = current.children[index];
       }
       current.isLastChar = true ;

     }

     public static boolean searchWord(String word){
       int level ;
       int len = word.length();
       int index ;
       TrieNode current = root ;

       for(level =0 ;level <len ;level++){
         index = word.charAt(level)-'a';

         if(current.children[index] ==null){
           return false ;
         }
         current = current.children[index];
       }
       return (current !=null && current.isLastChar);
     }


    public static void main(String args[]) {
      String keys[] = {"the", "a", "there", "answer", "any",
          "by", "bye", "their"};



      root = new TrieNode();

      // Construct trie
      int i;
      for (i = 0; i < keys.length ; i++)
        insertWord(keys[i]);

      System.out.println(searchWord("the"));
      System.out.println(searchWord("there"));
      System.out.println(searchWord("vishwa"));



    }
  }


