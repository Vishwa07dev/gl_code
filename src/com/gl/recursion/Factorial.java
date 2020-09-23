package com.gl.recursion;

public class Factorial {

  public static int fact(int num){

    //Base condition
    if(num <0){
      //factorial of negative numbers can't be calculated
      return -1 ;
    }

    if(num ==0 || num ==1 ){
      return 1 ;
    }
    //logic + recursion together
    return num*fact(num-1);
  }

  public static void main(String[] args) {
    System.out.println(fact(5));
  }
}


