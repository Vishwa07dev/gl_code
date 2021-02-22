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


  public static int getMedian(
      int[] a, int[] b, int sA,
      int sB, int eA, int eB)
  {
    if (eA - sA == 1) {
      return (
          Math.max(a[sA],
              b[sB])
              + Math.min(a[eA], b[eB]))
          / 2;
    }
        /* get the median of
    the first array */
    int m1 = median(a, sA, eA);

        /* get the median of
    the second array */
    int m2 = median(b, sB, eB);

        /* If medians are equal then
    return either m1 or m2 */
    if (m1 == m2) {
      return m1;
    }

        /* if m1 < m2 then median must
    exist in ar1[m1....] and
                ar2[....m2] */
    else if (m1 < m2) {
      return getMedian(
          a, b, (eA + sA + 1) / 2,
          sB, eA,
          (eB + sB + 1) / 2);
    }

        /* if m1 > m2 then median must
    exist in ar1[....m1] and
    ar2[m2...] */
    else {
      return getMedian(
          a, b, sA,
          (eB + sB + 1) / 2,
          (eA + sA + 1) / 2, eB);
    }
  }

  /* Function to get median
  of a sorted array */
  static int median(
      int[] arr, int start, int end)
  {
    int n = end - start + 1;
    if (n % 2 == 0) {
      return (
          arr[start + (n / 2)]
              + arr[start + (n / 2 - 1)])
          / 2;
    }
    else {
      return arr[start + n / 2];
    }
  }




}
