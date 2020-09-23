package com.gl.sorting;

import java.util.Arrays;


/**
 * Created by Vishwa Mohan
 */
public class Radix {

  static int findMax(int [] arr , int n){
    int max = arr[0];
    for(int i=1 ;i <n ;i++){
      if(arr[i] >max){
        max = arr[i];
      }
    }
    return max ;
  }


  static void countingSort(int[] arr, int n, int exp){
    int [] output = new int[n];
    int i ;
    int[] count = new int[10];
    Arrays.fill(count,0);

    for( i=0 ; i<n ;i++){
      count[(arr[i]/exp)%10]++;
    }

    for(i=1;i<10;i++){
      count[i] += count[i-1];
    }

    for(i=n-1;i>=0;i--){
      output[count[(arr[i]/exp)%10] -1 ] = arr[i];
      count[(arr[i]/exp)%10]--;
    }

    for(i=0;i<n;i++){
      arr[i]=output[i];
    }
  }

  public static void radixSort(int[] arr, int n){
    int m = findMax(arr, n);

    for(int i=1 ;m/i >0 ;i*=10){
      countingSort(arr,n,i);
    }
  }

  static void printArray(int[] arr , int n){
    for(int i=0;i<n;i++){
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {250, 205, 555,170};
    int n = arr.length;
    radixSort(arr, n);
    printArray(arr, n);
  }

}
