package com.gl.sorting;

public class MergeSort {

  public static void mergeSort(int[] arr , int start , int end) {

    //Base condition, termination condition
    if(start>=end){
      return ;
    }

    int mid = start + (end-start)/2 ;

    mergeSort(arr, start,mid);
    mergeSort(arr, mid+1,end);

    merge(arr,start,mid+1,end);

  }

  public static void merge(int[] arr , int start, int mid , int end) {

    //Base condition/Termination condition
    if(start >=end){
      return ;
    }

    int left = start ;
    int right = mid ;

    int[] temp = new int[arr.length];
    int index = left ;

    while(left <=mid && right <=end){
      if(arr[left] <= arr[right]){
        temp[index++]=arr[left++];
      }else{
        temp[index++]= arr[right++];
      }
    }
    while(left <mid){
      temp[index++]= arr[left++];
    }

    while(right<=end){
      temp[index++] = arr[right++];
    }

    for(int i=start;i <=end;i++){
      arr[i]=temp[i];
    }

  }

  public static void main(String[] args) {
    int arr[] = {1, 4, 0, 3, 2};

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    mergeSort(arr,0,arr.length-1);

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }

  }

}
