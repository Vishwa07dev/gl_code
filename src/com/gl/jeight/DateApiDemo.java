package com.gl.jeight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class DateApiDemo {

  public static void main(String[] args) {

//    //Current time
//
//    LocalDateTime currentTime  = LocalDateTime.now();
//
//    System.out.println(currentTime);
//
//    System.out.println(currentTime.getMonth());
//
//    /**
//     * Add few days in this current date
//     */
//    LocalDateTime futureTime  = currentTime.plusDays(300);
//
//    System.out.println(futureTime);
//    System.out.println(futureTime.getMonth());
//
//    /**
//     * Find the local date time for some past date/ random date
//     */
//
//    LocalDateTime randomTime = LocalDateTime.of(1987, 12,07, 07,07 );
//
//    System.out.println(randomTime);

    ZonedDateTime  currentTime = ZonedDateTime.now();

    System.out.println(currentTime);

    LocalDateTime randomTime = LocalDateTime.of(1987,12,07,07,07);

    ZoneId zoneId = ZoneId.of("Europe/Paris");

    ZonedDateTime zonedDateTime = ZonedDateTime.of(randomTime,zoneId);

    System.out.println(zonedDateTime);


  }



}
