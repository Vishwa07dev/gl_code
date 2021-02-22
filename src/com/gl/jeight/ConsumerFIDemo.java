package com.gl.jeight;

import java.util.Objects;
import java.util.function.Consumer;


public class ConsumerFIDemo {

  public static void main(String[] args) {

    Consumer<Person> consumer = person -> System.out.println(person);

    consumer.accept(new Person("Vishwa", 99, "Male"));
  }
}

class Person {
  private String name ;
  private int age ;
  private String gendre ;

  public Person(String name, int age, String gendre) {
    this.name = name;
    this.age = age;
    this.gendre = gendre;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGendre() {
    return gendre;
  }

  public void setGendre(String gendre) {
    this.gendre = gendre;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + ", gendre='" + gendre + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return age == person.age && name.equals(person.name) && gendre.equals(person.gendre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, gendre);
  }
}
