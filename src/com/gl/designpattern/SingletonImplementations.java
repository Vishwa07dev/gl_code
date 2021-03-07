package com.gl.designpattern;

public class SingletonImplementations {
}

/**
 *
 * Eagerly initialized singleton
 */

class SingletonType1{

  private static final SingletonType1 INSTANCE = new SingletonType1(); // Eagerly initialized

  //private constructor
  private SingletonType1(){}

  /**
   * This method will be used to expose the singleton instance of this class
   * @return
   */
  public static SingletonType1 getInstance(){
    return INSTANCE;
  }
}

/**
 * Using static block
 */
class SingletonType2{

  /**
   * No one will be able to call the constructor of this class
   */
  private SingletonType2(){

  }

  private static SingletonType2 instance ;

  /**
   * Static block
   */
  static{
    instance = new SingletonType2();
  }

  public static SingletonType2 getSingletonInstance(){
    return instance;
  }

}

/**
 *
 * Lazy initialization --> Create the object only when it's  needed
 *
 */

class SingletonType3{

  private SingletonType3(){

  }

  private static SingletonType3 singletonInstance ;

  /**
   * Thread T1
   *
   * Thread T2
   * @return
   */
  public static SingletonType3 getSingletonInstance(){
    //Load the instance lazily
    if(singletonInstance == null){
      singletonInstance = new SingletonType3();
    }
    return singletonInstance;

  }


}

/**
 *
 * Creating a Thread Safe Singleton Class
 */

class SingletonType4 {


  private SingletonType4(){

  }

  private static SingletonType4 singletonInstance ;

  /**
   * This method is now Thread safe
   * @return
   *
   * Challenge : It get's slow
   */
//  public static synchronized SingletonType4 getSingletonInstance(){
////      if(singletonInstance==null){
////        singletonInstance = new SingletonType4();
////      }
////
////      return singletonInstance;
////  }

  /**
   * Double checked locking
   */

  public static SingletonType4 getSingletonInstance(){

    if(singletonInstance ==null){
      synchronized (SingletonType4.class){
        if(singletonInstance==null){
          singletonInstance=new SingletonType4();
        }
      }
    }
    return singletonInstance;
  }


}

/**
 *
 * Inner static class ---> Bill Pugh Singleton Implementation
 */

class SingletonType5{
  //private constructor
  private SingletonType5(){

  }

  /**
   * This inner class will be used to create the singleton instance
   */
  private static class SingletonCreator{
    private static final SingletonType5 SINGLETON_INSTANCE = new SingletonType5();
  }

  /**
   * Thread safe and lazy loaded.
   * @return
   */
  public static SingletonType5 getSingletonInstance(){
    return SingletonCreator.SINGLETON_INSTANCE;
  }

}

/**
 * Creating singleton using Enums
 */
enum SingletonType6{
  SINGLETON_INSTANCE ;
}







