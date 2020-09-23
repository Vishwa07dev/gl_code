package com.gl.searchalgorithms;

public class LinearSearch {

  /**
   * If the num is found, return the valid index
   * If not found, return -1
   * @param arr
   * @param num
   * @return
   *
   * TC : O(n)
   */
  public static int search(int[] arr , int num){
    for(int i=0 ; i<arr.length ;i++){
      if(arr[i] == num){
        return i ;
      }
    }
    return -1 ; // the number was not found, so returning -1
  }





  public static void main(String[] args) {
    int[] arr = { 5,12,1,7,8,4,9};

    System.out.println(search(arr,99));
  }
}
