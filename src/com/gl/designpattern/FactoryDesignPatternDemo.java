package com.gl.designpattern;

public class FactoryDesignPatternDemo {

  public static void main(String[] args) {

    System.out.println(IPhoneFactory.getIphone(IphoneType.TWELVE));
  }


}
/**
 *
 * Iphone
 *
 * Iphone11 , Iphone12  .....
 *
 */

interface IPhone{
  public String getRAM();
  public String getMemory();
  public String getScreenSize();
}


class IPhone11 implements IPhone{


  private String ram ;
  private String memory  ;
  private String screenSize ;

  public IPhone11(String ram, String memory, String screenSize) {
    this.ram = ram;
    this.memory = memory;
    this.screenSize = screenSize;
  }

  @Override
  public String getRAM() {
    return this.ram;
  }

  @Override
  public String getMemory() {
    return this.memory;
  }

  @Override
  public String getScreenSize() {
    return this.screenSize;
  }

  @Override
  public String toString() {
    return "IPhone11{" + "ram='" + ram + '\'' + ", memory='" + memory + '\'' + ", screenSize='" + screenSize + '\''
        + '}';
  }
}


class IPhone12 implements IPhone{


  private String ram ;
  private String memory ;
  private String screenSize ;

  public IPhone12(String ram, String memory, String screenSize) {
    this.ram = ram;
    this.memory = memory;
    this.screenSize = screenSize;
  }

  @Override
  public String getRAM() {
    return this.ram;
  }

  @Override
  public String getMemory() {
    return this.memory;
  }

  @Override
  public String getScreenSize() {
    return this.screenSize;
  }

  @Override
  public String toString() {
    return "IPhone12{" + "ram='" + ram + '\'' + ", memory='" + memory + '\'' + ", screenSize='" + screenSize + '\''
        + '}';
  }
}

/**
 * Creating a separate factory class
 */

class IPhoneFactory {

  public static IPhone getIphone(IphoneType iphoneType){
    if(iphoneType.equals(IphoneType.ELEVEN)){

      return new IPhone11("4GB","256GB","5.5");
    }else if(iphoneType.equals(IphoneType.TWELVE)){
      return new IPhone12("8GB", "512GB", "6");

      /**
       * Any future release can be supported here
       */
    }else{
      return null;
    }

  }
}
