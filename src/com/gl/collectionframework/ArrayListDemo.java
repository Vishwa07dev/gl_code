package com.gl.collectionframework;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

  public static void main(String[] args) {

    ArrayList<Integer> list1 = new ArrayList<>();

    List<Integer> list2 = new ArrayList<>();

    System.out.println("list 1 : "+ list1 +"\nlist 2 :"+list2);

    list1.add(1);
    list1.add(2);
    System.out.println("list 1 : " + list1);
    list1.add (0, 3);

    System.out.println("list 1 : " + list1);


    list2.add(7);

    list2.add(8);
    list2.addAll(list1);
    System.out.println("list 2 :"+list2);

    list2.set(2,101);
    System.out.println("list 2 :"+list2);

    list2.remove(0);
    System.out.println("list 2 :"+list2);

    System.out.println("Element at 3rd index : "+ list2.get(3));





  }
}
