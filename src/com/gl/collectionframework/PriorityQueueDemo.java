package com.gl.collectionframework;

import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueueDemo {
  public static void main(String[] args) {

    PriorityQueue<String> queue = new PriorityQueue<>();

    System.out.println(queue);

    queue.add("Vishwa Mohan");
    queue.add("Shivani");
    queue.add("Shilpa Rao");
    queue.add("Salman");

    System.out.println(queue);

    System.out.println("Head of the queue : "+ queue.element());
    System.out.println("Head of the queue : "+ queue.peek());


    Iterator itr =  queue.iterator();

    while(itr.hasNext()){
      System.out.print(itr.next()+" ");
    }
    System.out.println();

    queue.remove();
    System.out.println(queue);

    queue.poll();

    System.out.println(queue);


  }

}
