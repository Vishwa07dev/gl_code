package com.gl.dnc;

public class Median {


       static int medianIterative(int[] arr1, int[] arr2 ){
         int len = arr1.length ;
         int i=0 ; // index in the first array
         int j=0 ; // index in the second array

         int[] arr = new int[2*len];
         int temp = 0 ; // index in the final combined array

         while( i<len && j <len){
           if(arr1[i]<arr2[j]){
             arr[temp++] = arr1[i++];
           }else{
             arr[temp++] = arr2[j++];
           }
         }

         while(i<len){
           arr[temp++] = arr[i++];
         }

         while(j<len){
           arr[temp++] = arr[j++];
         }

         // arr - will contain all the elements from arr1 and arr2 and it's
         // also sorted
         return (arr[len-1]+arr[len])/2 ;
       }

    private static int medianDnC(int[] arr1 , int s1, int e1 ,
        int[] arr2, int s2 , int e2){
         //Base condition
       if(e1-s1==1){
         return (Math.max(arr1[s1],arr2[s2]) + Math.min(arr1[e1],arr2[e2]))/2 ;
       }
       int m1  = median(arr1 ,s1,e1);
       int m2 = median(arr2, s2, e2);

       if(m1==m2){
         return m1 ;
       }

      /**
       * if m1 < m2 , median should lie between in arr1[m1 ....] and arr2[....m2]
       */
      else if (m1 <m2){
        return medianDnC(arr1,(s1+e1+1)/2, e1 ,arr2,s2,(s2+e2+1)/2);
       }else{
        return medianDnC(arr1, s1,(s1+e1+1)/2,arr2,(s2+e2+1)/2, e2 );
       }

    }

    private static int median(int[] arr , int start , int end){
         int n = end-start+1;
         if(n%2 ==0){
           return (arr[start +n/2] + arr[start + (n/2 -1)])/2;
         }else{
           return arr[start +n/2];
         }
    }




  public static void main(String[] args) {
    int arr1[] = {1, 12, 15, 26, 38};
    int arr2[] = {2, 13, 17, 30, 45};

    System.out.println(medianDnC(arr1,0,4 , arr2,0,4));

  }
}
