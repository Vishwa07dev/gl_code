package com.gl.stringalgorithms;

public class RemoveAdjacentCharacters {

  /**
   * Input : ABCCBCBA  --> ABBCBA  --> ACBA ( Output )
   *
   * @param str
   * @return
   */
  public static  String removeAdjacentCharacters(String str){

    char[] strArr = str.toCharArray() ;

    int j=0 ; // this will be basically used to track the index of finally trimmed string

    for(int i=1 ;i<strArr.length ;i++){
      while(j>=0 && strArr[i]==strArr[j]){
        i++;
        j--;
      }
      strArr[++j] =  strArr[i];
    }

    return new String(strArr).substring(0,j+1);


  }

  public static void main(String[] args) {
    String input = "ABCCBCBA";

    System.out.println(removeAdjacentCharacters(input));
  }
}
