package com.gl.generics;
import java.util.ArrayList;
import java.util.List ;
public class GenericsDemonstations {

  public static void main(String[] args) {
//      MyFirstGenClass<String> obj1 = new MyFirstGenClass<>();
////
////      obj1.setMyObject("Vishwa");
////      System.out.println(obj1.getMyObject());
////
////
////      MyFirstGenClass<Integer> obj2 = new MyFirstGenClass<>();
////
////      obj2.setMyObject(1234567);
////    System.out.println(obj2.getMyObject());
//    GenericMethod genericMethod = new GenericMethod();
//
//
//    Integer[] arrI = {1,2,3,4,5} ;
//
//    String[] arrS = {"Vishwa" , "Mohan"};
//
//    genericMethod.printElements(arrI);
//
//    genericMethod.printElements(arrS);


//    List<Polygon> polygons = new ArrayList<>();
//    polygons.add(new Polygon());
//
//
//    List<Circle> circles = new ArrayList<>();
//    circles.add(new Circle());
//    circles.add(new Circle());
//
//    DiagramPlotter diagramPlotter = new DiagramPlotter();
//
//    diagramPlotter.plotDiagrams(polygons);
//
//    diagramPlotter.plotDiagrams(circles);

//    MyUnboundedWildCard myUnboundedWildCard = new MyUnboundedWildCard();
//    List<Integer> list1 = new ArrayList<>();
//    list1.add(1);
//    list1.add(3);
//    list1.add(5);
//    myUnboundedWildCard.printTheList(list1);
//
//    List<String> list2 = new ArrayList<>();
//    list2.add("Vishwa");
//    list2.add("Roshan");
//    list2.add("Radhika");
//    myUnboundedWildCard.printTheList(list2);

    MyCalculator myCalculator = new MyCalculator();

    List<Integer> list1 = new ArrayList<>();

    list1.add(12);
    list1.add(21);
    list1.add(90);

    myCalculator.sum(list1);

    List<Number> list2 = new ArrayList<>();

    list2.add(123L);
    list2.add(9999L);

    myCalculator.sum(list2);




  }

}

/**
 *
 * Wildcards in Java Generics
 *
 * ? ( question mark ) --> Wildcard element -> Any type
 *
 * < ? extends People>
 *
 *
 *   UpperBound Wildcards
 *   < ? extends People> -- It restricts the unknown types to be  a specific type only
 *
 *
 *   Unbounded WildCards
 *
 *   List<?>  --> Un bounded : This represents the list of unknown types
 *
 *
 *   Lower bounded Wildcards
 *
 *   < ? super Integer >
 *
 */


class MyCalculator{

  public void  sum(List<? super Integer> list){

    for(Object obj : list){
      System.out.println(obj);
    }
  }
}

class MyUnboundedWildCard{

  public void printTheList(List<?> myList){

    for(Object obj : myList){
      System.out.println(obj);
    }
  }
}

interface  MyDrawings {
  void draw();
}

class Circle implements MyDrawings{

  @Override
  public void draw() {
    System.out.println("Plotting circle");
  }

}

class Polygon implements  MyDrawings{

  @Override
  public void draw() {
    System.out.println("Drawing Polygon");
  }
}



class DiagramPlotter{
  public void plotDiagrams(List<? extends MyDrawings> diagrams){
    for(MyDrawings myDrawings : diagrams){
      myDrawings.draw();
    }
  }
}

/***
 * Type Parameter :
 *
 * 1. T -> Type
 * 2. E -> Element
 * 3. K -> Key
 * 4. N -> Number
 * 5. V -> Value
 *
 *
 *
 */

/**
 * Generic classes
 */
class MyFirstGenClass<T>{

  private T myObject ;

  public T getMyObject() {
    return myObject;
  }

  public void setMyObject(T myObject) {
    this.myObject = myObject;
  }
}

/**
 * Generic Methods
 */

class GenericMethod{

  public <E> void printElements(E[] elements){
    for(int i=0 ;i<elements.length;i++){
      System.out.println(elements[i]);
    }
  }
}
