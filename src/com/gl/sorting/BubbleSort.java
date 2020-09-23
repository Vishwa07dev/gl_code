package com.gl.sorting;

public class BubbleSort {

  public static void bubbleSort(int[] arr) {

       for(int i= arr.length-1 ; i>0;i-- ){

         for(int j=0 ;j<i ;j++){
            if(arr[j] > arr[j+1]){
              int temp = arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
            }
         }
       }

  }



  public static void main(String[] args) {
    int arr[] = {1, -4, 10, -3, 21};

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    bubbleSort(arr);

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }

  }
}
