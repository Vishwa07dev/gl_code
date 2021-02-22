package com.gl.annontations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class AnnotationDemonstrations {

  /**
   * Understand few built in annotations
   *
   * 1. Override
   *
   * 2. @SuppressWarning
   */

  /**
   *
   *
   * How to create a User Defined Annotations
   *
   * @interface
   *
   *
   */

  @Retention(RetentionPolicy.SOURCE)
  @Target(ElementType.METHOD)
  @interface MyFirstAnnotation{
    String methodDetails();
  }

  @SuppressWarnings("unchecked")
  public void demoSuppressWarning(){

    List list  = new ArrayList();

    list.add("Vishwa");
    list.add(1);
  }
}

class Animal {

  public void eat(){
    System.out.println("Animal is eating");
  }
}

class Cat extends Animal{

  @Override
  public void eat(){ // Overriden method
    System.out.println("Cat is eating");
  }
}
