package com.gl.designpattern;

public class DecoratorDesignPatternDemo {

  public static void main(String[] args) {

    Computer computer = new GamingComputer(new BasicComputer());
    computer.assembleComputer();

    System.out.println(" -------------------------- ");

    Computer performingComputer = new HighPerformanceComputer(new GamingComputer(new BasicComputer()));

    performingComputer.assembleComputer();
  }


}

/**
 *
 *  Computer
 *     --- Basic version
 *         -- High end configurations -- may for gaming purposes
 *                                       may be for graphic designs
 *                                       may be for heavy computations
 *
 */

/**
 * Create an interface
 */
interface Computer {

  public void assembleComputer() ;
}

/**
 *
 * We first need to create a very basic version of Computer
 */
class BasicComputer implements Computer{

  @Override
  public void assembleComputer() {
    System.out.println("Basic computer assembled");
  }
}

/**
 *
 * Time for defining the decorators
 **/
class ComputerDecorator implements Computer{

  protected Computer computer ;

  public ComputerDecorator(Computer computer) {
    this.computer = computer;
  }

  @Override
  public void assembleComputer() {
    this.computer.assembleComputer();
  }
}


class GamingComputer extends ComputerDecorator{

  public GamingComputer(Computer computer) {
    super(computer);
  }

  @Override
  public void assembleComputer(){
    super.assembleComputer();
    System.out.println("Adding the features of Gaming computer");
  }
}

class HighPerformanceComputer extends ComputerDecorator{

  public HighPerformanceComputer(Computer computer) {
    super(computer);
  }

  @Override
  public void assembleComputer(){
    super.assembleComputer();
    System.out.println("Adding the features of High Performance computer");
  }
}