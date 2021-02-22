package com.gl.hcl.session2;

public class AnnotationsExamples {
}



class Animal {

   public void eat(String foodName){

     System.out.println("Animal is eating : "+foodName);
   }
}

class Dog extends Animal{

  @Override
  public void eat(String foodName) {
    System.out.println("Dog is eating" + foodName);
  }

}
