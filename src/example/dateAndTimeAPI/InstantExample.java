package org.example.dateAndTimeAPI;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
* Represents the instantaneous time since January 1, 1970, midnight UTC
* */
public class InstantExample {
  public static void main ( String[] args ) {
    Instant now = Instant.now(); // creating an instance of Instant which stores the current instant
    System.out.println("Current instantaneous time: " + now); // Current instantaneous time: 2024-06-29T18:35:08.362425700Z

    long epochSecond = now.getEpochSecond(); // getting current epochSecond
    System.out.println(epochSecond); // 1719686108

    ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Asia/Tokyo")); // Instant time of Tokyo
    System.out.println(zonedDateTime); // 2024-06-30T03:35:08.362425700+09:00[Asia/Tokyo]
  }
}
/*
* Output:
* Current instantaneous time: 2024-06-29T18:35:08.362425700Z
* 1719686108
* 2024-06-30T03:35:08.362425700+09:00[Asia/Tokyo]
* */