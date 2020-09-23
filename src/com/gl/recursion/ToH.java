package com.gl.recursion;

public class ToH {

  public static int minSteps(int n, char s, char d, char a) {
       //Base condition
    if(n==0 || n==1){
      return n ;
    }
    //First move n-1 coins from source to auxiliary
    int move1 = minSteps(n-1, s, a, d);

    //move 1 biggest coin from source to destination
    int move2 = 1 ;

    //Lastly move that n-1 coins from auxiliary to destination
    int move3 = minSteps(n-1,a,d,s);

    return move1 + move2 + move3 ;
  }

  public static void main(String[] args) {
    System.out.println(minSteps(4,'s','d','a'));
  }
}
