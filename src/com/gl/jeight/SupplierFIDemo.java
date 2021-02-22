package com.gl.jeight;

import java.util.function.Supplier;


public class SupplierFIDemo {

  public static void main(String[] args) {

    Supplier<String> supplier = () -> "Hello Students" ;

    System.out.println(supplier.get());
  }
}
