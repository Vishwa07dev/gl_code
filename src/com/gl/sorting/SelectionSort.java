package com.gl.sorting;

public class SelectionSort {

  public static void selectionSort(int arr[])
  {
    int n = arr.length ;

    for (int i = 0; i <n-1 ; i++) {
      int min = i;
      for (int j = i+1; j < n ; j++) {
        if(arr[j] < arr[min]){
          min=j;
        }
      }
      //swap i with  min
      int temp = arr[i];
      arr[i]=arr[min];
      arr[min]=temp;
    }
  }

  public static void main(String[] args) {
    int arr[] = {64,-25,12,-22,11};
    selectionSort(arr);
    System.out.println("Sorted array");
    for (int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i] + " ");
    }
  }
}
