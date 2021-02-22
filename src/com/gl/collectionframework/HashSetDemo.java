package com.gl.collectionframework;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {
  public static void main(String[] args) {

    HashSet<String> hashSet = new HashSet<>();

    System.out.println(hashSet);

    hashSet.add("Vishwa");
    hashSet.add("Mohan");

    System.out.println(hashSet);

    hashSet.add("Shivani");
    hashSet.add("Mohan");

    System.out.println(hashSet);

    Iterator<String> itr  = hashSet.iterator();

    while(itr.hasNext()){
      System.out.print(itr.next() +" ");
    }
    System.out.println();
  }

}
