package com.gl.sorting;

import java.util.ArrayList;
import java.util.Collections;


class BucketSort {

  private static void buckSort(float arr[], int n) {

    //Boundary
    if(n<=1){
      return ;
    }

    //we will create array of buckets -> list
    ArrayList<Float>[] buckets = new ArrayList[n];

    //We need to initialize the buckets
    for(int i =0 ;i < n;i++){
      buckets[i] = new ArrayList<Float>();
    }
    //Pushing the elements of the array in the correct bucket
    for (int i = 0; i < n ; i++) {
      int idx = (int)arr[i]*n ;
      buckets[idx].add(arr[i]);
    }

    //Sort the elements of each bucket
    for (int i = 0; i < n; i++) {
      Collections.sort(buckets[i]);

    }

    //concatenate all the elements

    int index = 0;
    for(int i =0 ;i<n ; i++){
      for (int j = 0; j < buckets[i].size() ; j++) {
        arr[index++] = buckets[i].get(j);
      }
    }

  }

  // Driver code
  public static void main(String args[]) {
    float arr[] = {0.197f, 0.665f, 0.856f, 0.2334f, 0.665f, 0.3134f};

    int n = arr.length;
    buckSort(arr, n);

    System.out.println("Sorted array is ");
    for (float entry : arr) {
      System.out.print(entry + " ");
    }
  }
}


