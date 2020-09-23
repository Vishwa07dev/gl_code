package com.gl.hashtable;

import java.util.Hashtable;


public class Problems {
  /**
   * This method takes an array as the input,
   * it tries to remove the duplicates and print the given array.
   * @param arr
   *
   * Time complexity = O(n)
   *
   * Space complexity = O(n)
   */
   public static void removeDuplicates(char[] arr){

     Hashtable<Character,Integer> hashtable = new Hashtable<>(); // Space complexity of O(n)

     int index = 0 ; // this the index of the elements in the array, uptill which only distinct elements exist

     for(int i=0;i<arr.length;i++){    // TC : O(n)
       if(hashtable.containsKey(arr[i])){
         continue;
       }
       hashtable.put(arr[i],1); // This inserts the character in the hashtable
       arr[index++] =arr[i]; // This line will be used to remove the duplicates.
     }

     for(int i=0;i<index ;i++){
       System.out.print(arr[i]+" ");
     }

   }


  public static void main(String[] args) {

     char[] arr = {'a','b','a','c','d','c','e'};
    removeDuplicates(arr);
  }
}
