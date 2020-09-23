package com.gl.searchalgorithms;

public class ElementsMaxTimes {

  /**
   * it returns the element with the maximum frequency
   * @param arr
   * @return
   *
   * TC = O(n*n)
   */
   public static int maxFrequencyElement(int[] arr){
     int maxRepeatingElement = arr[0];
     int maxCount = 1 ;

     for(int i=0;i< arr.length;i++){
       int count=1;
       for (int j = i+1; j <arr.length ; j++) {
         if(arr[i]==arr[j]){
           count++;
         }

         if(count >maxCount){
           maxCount=count ;
           maxRepeatingElement = arr[i];
         }

       }
     }
     return maxRepeatingElement ;
   }


  public static void main(String[] args) {
    int arr[] = {1, 3, 2, 1, 4, 1,3} ;

    System.out.println(maxFrequencyElement(arr));
  }
}
