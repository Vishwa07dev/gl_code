package com.gl.searchalgorithms;

import java.util.Arrays;


public class DuplicateElements {

  /**
   * Return true if the duplicate element is present
   * @param arr
   * @return
   *
   * TC : O(n2)
   */
  public static boolean isDuplicatePresentLinearSearch(int[] arr){
      for(int i=0 ;i <arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          if(arr[j]==arr[i]){
            return true ;
          }
        }
      }
      return false ;
  }

  /**
   * TC : O(nlogn)
   * @param arr
   * @return
   */
  public static boolean isDuplicatePresentBinarySearch(int[] arr){
    Arrays.sort(arr); // TC : O(nlogn)

    for (int i = 0; i <arr.length ; i++) {
      if(binarySearch(arr,i+1,arr.length-1,arr[i])){
        return true ;
      }
    }

    return false ;
  }

  public static boolean binarySearch(int[] arr , int left , int right, int num){

    if(left>right){
      return false;
    }
    int mid = left + (right-left)/2;

    if(arr[mid] == num){
      return true ;
    }

    else if(arr[mid] > num) {
      return binarySearch(arr, left, mid-1, num);
    }
    else{
      return binarySearch(arr,mid+1,right, num);
    }

  }

  public static void main(String[] args) {
    int[] arr = {1,2,7,4,9,7};

    System.out.println(isDuplicatePresentBinarySearch(arr));

    System.out.println(isDuplicatePresentLinearSearch(arr));
  }



}
