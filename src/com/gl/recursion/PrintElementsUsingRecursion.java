package com.gl.recursion;

public class PrintElementsUsingRecursion {

     public static void printNumbers(int[] arr , int startIndex){

             //Base condition

             if(startIndex >=arr.length){
               return ;
             }

             //Logic
       System.out.println(arr[startIndex]);

             //recursively
       printNumbers(arr,startIndex+1);


     }


  public static void printNumbersRev(int[] arr , int startIndex){

       //Base condition
    if(startIndex >=arr.length){
      return ;
    }

    printNumbersRev(arr, startIndex+1);

    System.out.println(arr[startIndex]);

  }


     public static void main (String args[] ){

       int[] arr = {-7,8,1,2,7,5};
       printNumbersRev(arr,0);
     }

}
