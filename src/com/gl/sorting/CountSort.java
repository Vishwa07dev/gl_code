package com.gl.sorting;

// Java implementation of Counting Sort
public class CountSort {

  public static void countSort(int arr[] , int k) {
    int n  = arr.length;

    int[] result = new int[n];

    //Count array
    int[] count = new int[k+1];

    for(int i=0;i<n;i++){
      ++count[arr[i]];
    }

    for(int i=1;i<=k;i++){
      count[i]+=count[i-1];
    }

    for(int i=n-1;i>=0;i--){
      result[count[arr[i]] -1] = arr[i];
      --count[arr[i]];
    }

    for (int i = 0; i < n; i++) {
      arr[i]=result[i];
    }
  }

  // Driver method
  public static void main(String args[]) {
    int[] arr = {25,10,4,0,1,18,3,6};

    countSort(arr, 25);

    System.out.print("Sorted  array is ");
    for (int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i] + " ");
    }
  }
}


