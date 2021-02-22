package com.gl.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Demo {

  public static void main(String[] args) {

    ArrayList<String> myList  = new ArrayList<String>();

    myList.add("Vishwa");

    //myList.add(123);

    String name  = myList.get(0); // No need of type casting

    Map<String, Integer> map  = new HashMap<>();

    map.put("Age",12);
    //map.put(1243, "Vishwa");


    int age = map.get("Age");
  }
}
