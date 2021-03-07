package com.gl.designpattern;

public class BuilderDesignPatternDemo {

  public static void main(String[] args) {

    Car car = new Car.CarBuilder("MRF Tyre", "Digital Steering ",
        "Powerful Engine", "Comfortable seat").
        setAC(true).setSpeakers("boss speakers").build();

    System.out.println(car);
  }

}

/**
 * Car
 *   -- Tyre
 *   -- Steering
 *   -- Engine
 *   -- Seat
 *
 *  Optional
 *   -- Speakers
 *   -- AC
 *   -- Seat Covers
 */
class Car {

  //Mandatory attributes
  private String tyre ;
  private String steering ;
  private String engine ;
  private String seat ;


  // Optional attributes
  private String speakers;
  private boolean hasAc ;
  private boolean hasSeatCover ;

  /**
   * Creating car using the CarBuilder
   * @param carBuilder
   */
  public Car(CarBuilder carBuilder) {

    this.tyre= carBuilder.tyre;
    this.steering= carBuilder.steering;
    this.engine = carBuilder.engine;
    this.seat= carBuilder.seat;

    this.hasAc = carBuilder.hasAc;
    this.hasSeatCover =carBuilder.hasSeatCover;
    this.speakers= carBuilder.speakers;
  }

  /**
   * Define the builder for this car class
   *
   * this builder class should be a static class
   * @return
   */
  public static class CarBuilder{
    //Mandatory attributes
    private String tyre ;
    private String steering ;
    private String engine ;
    private String seat ;


    // Optional attributes
    private String speakers;
    private boolean hasAc ;
    private boolean hasSeatCover ;

    //constructor for builder
    public CarBuilder(String tyre, String steering, String engine, String seat){
      this.tyre = tyre;
      this.steering = steering;
      this.engine = engine;
      this.seat = seat;
    }

    /**
     * Main focus point in the case of the builder design pattern
     * @param speakers
     * @return
     */
    public CarBuilder setSpeakers(String speakers){
      this.speakers = speakers;
      return this;
    }

    public CarBuilder setAC(boolean hasAc){
      this.hasAc = hasAc;
      return this ;
    }

    public CarBuilder setSeatCover(boolean hasSeatCover){
      this.hasSeatCover = hasSeatCover;
      return  this ;
    }

    /**
     * Define and provide a build method
     */
    public Car build(){
      return new Car(this);
    }

  }





  public String getTyre() {
    return tyre;
  }

  public void setTyre(String tyre) {
    this.tyre = tyre;
  }

  public String getSteering() {
    return steering;
  }

  public void setSteering(String steering) {
    this.steering = steering;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getSeat() {
    return seat;
  }

  public void setSeat(String seat) {
    this.seat = seat;
  }

  public String getSpeakers() {
    return speakers;
  }

  public void setSpeakers(String speakers) {
    this.speakers = speakers;
  }

  public boolean isHasAc() {
    return hasAc;
  }

  public void setHasAc(boolean hasAc) {
    this.hasAc = hasAc;
  }

  public boolean isHasSeatCover() {
    return hasSeatCover;
  }

  public void setHasSeatCover(boolean hasSeatCover) {
    this.hasSeatCover = hasSeatCover;
  }

  @Override
  public String toString() {
    return "Car{" + "tyre='" + tyre + '\'' + ", steering='" + steering + '\'' + ", engine='" + engine + '\''
        + ", seat='" + seat + '\'' + ", speakers='" + speakers + '\'' + ", hasAc=" + hasAc + ", hasSeatCover="
        + hasSeatCover + '}';
  }
}