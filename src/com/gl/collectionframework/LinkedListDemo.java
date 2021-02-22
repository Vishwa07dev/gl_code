package com.gl.collectionframework;

import java.util.LinkedList;


public class LinkedListDemo {

  public static void main(String[] args) {
    LinkedList<Integer> list  = new LinkedList<>();
    System.out.println("list : "+ list);

    //System.out.println(list.getFirst()) ;

    System.out.println(list.peek());

    list.add(1);
    list.add(2);

    System.out.println("list : "+ list);

    list.add(0,3);
    System.out.println("list : "+ list);

    list.add(1,7);
    list.addFirst(0);
    System.out.println("list : "+ list);

    System.out.println(list.offer(8));

    System.out.println("list : "+ list);

    System.out.println("Polled element : "+ list.poll());



  }
}
