package com.gl.searchalgorithms;

import java.util.Arrays;


public class FindTriplet {

  /**
   * TC = O(n*n)
   * @param arr
   * @param num
   */
   public static void printThreeElementsIndex(int[] arr, int num){
     Arrays.sort(arr); //TC = O(nlogn )

     for(int i=0;i<arr.length;i++){  // n times
       int j=i+1;
       int k = arr.length-1;

       while(j <k){  // approximately runs for n times
         if(arr[i]+arr[j]+arr[k] == num){
           System.out.println(arr[i]+","+arr[j]+","+arr[k]);
           return ;
         }
         else if(arr[i]+arr[j]+arr[k]>num){
           k--;
         }else{
           j++ ;
         }
       }
     }

     System.out.println("Triplets can't be found");
   }




  public static void main(String[] args) {
    int[] arr = { 5,1,3,9,4,2 } ;

    printThreeElementsIndex(arr, 5);
  }
}
