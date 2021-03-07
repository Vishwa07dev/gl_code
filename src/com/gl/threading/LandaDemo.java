package com.gl.threading;

import java.util.ArrayList;
import java.util.List ;


public class LandaDemo {

  public static void main(String[] args) {

    /**
     * Before Lambda
     */

    List<Integer> numbers  = new ArrayList<>();

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    for( int i : numbers){
      System.out.println(i);
      //More lines of code to do more processing
    }

    numbers.forEach( n -> System.out.println(n));




  }
}
