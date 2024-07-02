package DateAndTimeAPI.DataAndTimeAPI;

import java.time.LocalTime;

/*
* LocalTime represents the time without any time zone
* */
public class LocalTimeExample {
  public static void main ( String[] args ) {
    LocalTime now = LocalTime.now(); // creating an instance of LocalTime which store the current time
    System.out.println("Current time: " + now); // Current time: 21:16:26.942963800

    int hour = now.getHour(); // getting the current hour
    System.out.println("Hour: " + hour); // Hour: 21

    int minute = now.getMinute(); // getting the current minute
    System.out.println("Minute: " + minute); // Minute: 16

    int second = now.getSecond(); // getting the current second
    System.out.println("Second: " + second); // Second: 26

    int nano = now.getNano(); // getting the current nanosecond
    System.out.println("Nanosecond: " + nano); // Nanosecond: 942963800


    LocalTime userTime = LocalTime.of(8, 14 ); // creating a custom LocalTime instance
    System.out.println("User time: " + userTime); // User time: 08:14

    LocalTime parsedTime = LocalTime.parse("08:39"); // parsing a String/char sequence into a LocalTime instance
    System.out.println("Parsed time: " + parsedTime); // Parsed time: 08:39

    System.out.println(parsedTime.isAfter(userTime)); // true
  }
}
/*
* Output:
* Current time: 21:16:26.942963800
* Hour: 21
* Minute: 16
* Second: 26
* Nanosecond: 942963800
* User time: 08:14
* Parsed time: 08:39
* true
* */