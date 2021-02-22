package com.gl.jeight;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamOperationsDemo {

  /**
   * Stream Intermediate Operations :
   *
   *    Distinct
   *    Map
   *    Filter
   *    Sorted
   *    Limit
   *
   * Stream Terminal Operations :
   *
   *   Count
   *   Collect
   *   forEach
   */

  /**
   * Distinct
   */

  public static void main(String[] args) {
//    List<String> names  = new ArrayList<>();
//
//    names.add("Vishwa");
//    names.add("Mohan");
//    names.add("Rahul");
//    names.add("Shilpi");
//    names.add("Rahul");
//
//    System.out.println(names);
//
//    Stream<String> namesStream = names.stream();
//
//    System.out.println(namesStream);
//
//    //Termination operation
//    //namesStream.forEach( name -> System.out.print(name +" "));
//
//    System.out.println();
//
//    Stream<String> distinctNames = namesStream.distinct();
//
//    distinctNames.forEach( name -> System.out.print(name +" "));
//
//    System.out.println();

    /**
     * Map
     */

//    Stream<Integer> numbers = Stream.of(1,2,3,4,5);
//
//    Stream<Integer> squaredNumbers = numbers.map(num -> num*num);
//
//    squaredNumbers.forEach(num -> System.out.println(num));

//    /**
//     * Filter
//     */
//    Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,8,9);
//
//    Stream<Integer> evenNumbers = numbers.filter(num -> num%2==0);
//
//    evenNumbers.forEach(num -> System.out.println(num));

    /**
     * Sorted
     */
//
//    List<String> names = new ArrayList<>();
//
//    names.add("Vishwa");
//    names.add("Mohan");
//    names.add("Rahul");
//    names.add("Shilpi");
//    names.add("Rahul");
//
//    System.out.println(names);
//
//    Stream<String> namesStream = names.stream();
//
//    Stream<String> sortedNames = namesStream.sorted();
//
//    sortedNames.forEach(name -> System.out.println(name));

    /**
     * Limit
     */
//
//    Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,8,9);
//
//    Stream<Integer> truncatedNumbers = numbers.limit(5);
//
//    truncatedNumbers.forEach(num -> System.out.println(num));

//    /**
//     * count
//     */
//    Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,8,9);
//
//    System.out.println(numbers.count());
//
//

    /**
     * Collect
     */

    Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,8,9) ;
    /**
     * covert the above stream of numbers into the list of number
     */

    List<Integer> numberList = numbers.collect(Collectors.toList());

    System.out.println(numberList);

  }
}
