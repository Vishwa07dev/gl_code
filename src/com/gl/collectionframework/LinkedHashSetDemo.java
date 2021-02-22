package com.gl.collectionframework;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {

  public static void main(String[] args) {

    LinkedHashSet<String> set  = new LinkedHashSet<>();

    System.out.println(set);


    set.add("Vishwa");

    set.add("Mohan");

    System.out.println(set);

    set.add("Shivani");

    set.add("Vishwa");

    System.out.println(set);

    Iterator<String> itr = set.iterator();

    while(itr.hasNext()){
      System.out.print(itr.next() +" ");
    }

    System.out.println();
  }


}
