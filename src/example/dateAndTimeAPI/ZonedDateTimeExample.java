package org.example.dateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/*
* Represents the Date and time along with a time zone
* */
public class ZonedDateTimeExample {
  public static void main ( String[] args ) {
    ZonedDateTime asiaTime = ZonedDateTime.now(); // creating an instance of ZonedDateTime which stores the current
    // date time and time zone along with the UTC
    System.out.println("Asia australiaTime: " + asiaTime); // Asia australiaTime: 2024-06-29T23:48:56.607202400+05:30[Asia/Calcutta]

    Set< String > zoneId = ZoneId.getAvailableZoneIds(); // getting all the available zones with the help of ZoneId
//    System.out.println(zoneId);

    ZonedDateTime australiaTime = ZonedDateTime.now(ZoneId.of("Australia/Darwin")); // getting the ZonedDateTime of Australia/Darwin
    System.out.println("Australia/Darwin zone time: " + australiaTime); // Australia/Darwin zone time: 2024-06-30T03:48:56.609201400+09:30[Australia/Darwin]

    ZonedDateTime tokyoTime = ZonedDateTime.of(2002, 12, 27,
        18, 30, 50, 100,
        ZoneId.of("Asia/Tokyo")); // creating Tokyo ZonedDateTime using of()
    System.out.println("Tokyo zone time: " + tokyoTime); // Tokyo zone time: 2002-12-27T18:30:50.000000100+09:00[Asia/Tokyo]

    ZonedDateTime parsedTime = ZonedDateTime.parse("2002-06-29T23:47:59.948979700+05:30[Asia/Calcutta]"); // creating a parsed ZonedDateTime
    System.out.println("Parsed zoned time: " + parsedTime); // Parsed zoned time: 2002-06-29T23:47:59.948979700+05:30[Asia/Calcutta]
  }
}
/*
* Output:
* Asia australiaTime: 2024-06-29T23:48:56.607202400+05:30[Asia/Calcutta]
* Australia/Darwin zone time: 2024-06-30T03:48:56.609201400+09:30[Australia/Darwin]
* Tokyo zone time: 2002-12-27T18:30:50.000000100+09:00[Asia/Tokyo]
* Parsed zoned time: 2002-06-29T23:47:59.948979700+05:30[Asia/Calcutta]
* */