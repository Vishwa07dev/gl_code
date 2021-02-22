package com.gl.jeight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class LambdaDemonstrations {

  public static void main(String[] args) {

//    List<Integer> numbers  = new ArrayList<Integer>();
////    numbers.add(1);
////    numbers.add(2);
////    numbers.add(3);
////    numbers.add(4);
////    numbers.add(5);
////
////    /**
////     * Before Java 1.8 Lambda expression
////     *
////     * Iterating the given list
////     */
////
////    for(int num : numbers){
////      System.out.print(num + " ");
////    }
////
////    System.out.println();
////
////    /**
////     * Achieving the same thing  using Lambda expression
////     */
////    System.out.println("Using Lambda expressions");
////    numbers.forEach( n -> System.out.print(n +" "));

    /**
     * There is no arguments  : () -> { // logic to be executed }
     */

    /**
     * Before Java 8
     */
     MathematicalNumber m = new MathematicalNumber() {
       @Override
       public int getSquare(int num) {
         return num*num;
       }
     };

    System.out.println(m.getSquare(5));



    /**
     * Implementing using Java8
     */
    MathematicalNumber mathematicalNumber = (num) -> num*num ;

    System.out.println(mathematicalNumber.getSquare(5));

  }
}


interface MathematicalNumber{

  public int getSquare(int num);

}
