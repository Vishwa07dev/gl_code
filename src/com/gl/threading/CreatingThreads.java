package com.gl.threading;

public class CreatingThreads {

  public static void main(String[] args) {

    /**
     * Interface
     */

    Thread t1 = new Thread(new MyThread());

    Thread t2  = new MySecondThread();



  }
}

class MyThread implements  Runnable{

  @Override
  public void run() {
    System.out.println("My Runnable thread");
  }
}


class MySecondThread extends Thread{

  public void run(){
    System.out.println("Creating a thread using Thread class");
  }
}
