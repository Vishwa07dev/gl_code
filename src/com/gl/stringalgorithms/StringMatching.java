package com.gl.stringalgorithms;

public class StringMatching {


  public static boolean bruteForceStringMatching(String str1 , int m , String str2 , int n){

    for(int i=0;i<=m-n;i++){

      int j=0;
      while(j<n && str1.charAt(i+j)==str2.charAt(j)){
        j++;
      }
      if(j==n){
        return true ;
      }
    }
    return false ;
  }

  public static void main(String[] args) {
    System.out.println(bruteForceStringMatching("abcdedfrg", 9 , "edarg",5));
  }

}
