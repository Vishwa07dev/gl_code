package com.gl.selection;

public class FindSecondLargest {

  /**
   * It should print second largest element in the given array
   * @param arr
   * @param n
   *
   * TC = O(n)
   */
  public static void printSecondLargest(int[] arr , int n){
      int i, first, second;
      if(n<2){
        System.out.println("Invalid input");
        return ;
      }
      first = second = Integer.MIN_VALUE;

      for(i =0 ;i<n;i++){
        if(arr[i] >first){
          second = first ;
          first = arr[i];
        }else if(arr[i]>second && arr[i]!=first){
          second=arr[i];
        }
      }

    System.out.println("Second largest number is : "+ second);
  }

  public static void main(String[] args) {
    int[] arr = {11,19};

    printSecondLargest(arr,arr.length);
  }


}


