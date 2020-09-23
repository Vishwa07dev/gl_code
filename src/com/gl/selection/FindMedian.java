package com.gl.selection;

public class FindMedian {

  /**
   * Return the median of the combined array
   * code should be executed in O(logn) time complexity only
   * @param arr1
   * @param arr2
   * @param n
   * @return
   *
   * TC = O(logn)
   */
  public static int median(int[] arr1, int[] arr2 , int n){

    int i=0;
    int j=0;
    int med1=-1; // median for the first array
    int med2 = -1; // median for the second array

    for(int count=0;count<=n;count++){
      if(i==n){
        med1=med2;
        med2=arr2[0];
        break;
      }
      else if(j==n){
        med1=med2;
        med2=arr1[0];
        break;
      }

      if(arr1[i] <= arr2[j]){
        med1=med2;
        med2=arr1[i];
        i++;
      }else{
        med1=med2;
        med2=arr2[j];
        j++;
      }
    }

    return (med1+med2)/2 ;
  }




  public static void main(String[] args) {
    int arr1[] = {1, 12, 15, 26, 38};
    int arr2[] = {2, 13, 17, 30, 45};

    System.out.println("Median is " + median(arr1, arr2, arr1.length));
  }
}
