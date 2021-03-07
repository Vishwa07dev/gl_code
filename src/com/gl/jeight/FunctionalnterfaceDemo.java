package com.gl.jeight;

public class FunctionalnterfaceDemo {

  public static void main(String[] args) {


    CovidImmunable covidImmunable = () -> System.out.println("Getting the vaccine");


    covidImmunable.getCovidVaccine();
  }


}

/**
 * Functional interface has only 1 method. It can be used in the Lambda expression
 *
 */

@FunctionalInterface
interface CovidImmunable{

  public void getCovidVaccine();



}
