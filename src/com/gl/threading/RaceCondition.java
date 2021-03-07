package com.gl.threading;

public class RaceCondition {


  public synchronized void printNumber(int num){

    for(int i =1;i< 50 ; i++){
      System.out.println(num*i);

    }

  }

  public static void main(String[] args) {


    RaceCondition raceCondition = new RaceCondition();

    Thread t1 = new FirstThread(raceCondition);

    Thread t2 = new SecondThread(raceCondition);

    Thread t3 = new SecondThread(raceCondition);

    Thread t4 = new SecondThread(raceCondition);

    Thread t5 = new SecondThread(raceCondition);

    Thread t6 = new SecondThread(raceCondition);

    t1.start();

    t2.start();

    t3.start();
    t4.start();
    t5.start();
    t6.start();
  }
}

class FirstThread extends Thread{
  RaceCondition _raceCondition ;

  public FirstThread(RaceCondition raceCondition){
    this._raceCondition = raceCondition;
  }

  public void run(){
    _raceCondition.printNumber(1);
  }
}


class SecondThread extends Thread{
  RaceCondition _raceCondition ;

  public SecondThread(RaceCondition raceCondition){
    this._raceCondition = raceCondition;
  }

  public void run(){
    _raceCondition.printNumber(2);
  }
}


class ThirdThread extends Thread{
  RaceCondition _raceCondition ;

  public ThirdThread(RaceCondition raceCondition){
    this._raceCondition = raceCondition;
  }

  public void run(){
    _raceCondition.printNumber(3);
  }
}


class FourthThread extends Thread{
  RaceCondition _raceCondition ;

  public FourthThread(RaceCondition raceCondition){
    this._raceCondition = raceCondition;
  }

  public void run(){
    _raceCondition.printNumber(4);
  }
}

class FifthThread extends Thread{
  RaceCondition _raceCondition ;

  public FifthThread(RaceCondition raceCondition){
    this._raceCondition = raceCondition;
  }

  public void run(){
    _raceCondition.printNumber(5);
  }
}
class SixthThread extends Thread{
  RaceCondition _raceCondition ;

  public SixthThread(RaceCondition raceCondition){
    this._raceCondition = raceCondition;
  }

  public void run(){
    _raceCondition.printNumber(6);
  }
}

