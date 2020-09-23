package com.gl.sorting;

public class QuickSort {

  public static void quickSort(int[] arr, int start, int end) {

    //Base condition
    if(start>=end){
      return;
    }

    int pivotIndex =pivot(arr,start, end);
    quickSort(arr,start, pivotIndex-1);
    quickSort(arr,pivotIndex+1,end);

  }

  private static int pivot(int[] arr, int start, int end) {
    int pivot = arr[end];
    int i = start-1;

    for(int j=start;j<end;j++){
      if(arr[j] <= pivot){
        i++;
        int swapTemp  = arr[i];
        arr[i]=arr[j];
        arr[j]=swapTemp;
      }
    }

    int swapTemp = arr[i+1];
    arr[i+1]= arr[end];
    arr[end]= swapTemp;

    return i+1;

  }

  public static void main(String[] args) {
    int arr[] = {1, -4, 0, -3, 2};

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    quickSort(arr,0,arr.length-1);

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }

  }

}
