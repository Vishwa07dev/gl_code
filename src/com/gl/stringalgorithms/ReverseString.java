package com.gl.stringalgorithms;

public class ReverseString {

  public static String reverse(String str){
    if(str ==null || str.length() <=1){
      return str ;
    }

    char[] charArr = str.toCharArray();

    int i=0 ; // first index
    int j= charArr.length -1 ; //last index

    while(i<j){
      char temp = charArr[i];
      charArr[i]=charArr[j];
      charArr[j]=temp;
      i++;
      j--;
    }

    return new String(charArr);
  }







  public static void main(String[] args) {
    String myName = "Vishwa Mohan";
    System.out.println(reverse(myName));
  }
}
