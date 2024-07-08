package org.DataAndTimeAPI;

import java.time.Duration;
import java.time.Instant;

/*
* Represents the duration between two point of time
* */
public class DurationExample {
  public static void main ( String[] args ) {
    Duration duration = Duration.ofDays(4); // creating an instance of Duration which returns the time period of 4 days
    System.out.println("Duration of 4 days: " + duration); // Duration of 4 days: PT96H

    Instant start = Instant.now(); // storing the start time in an Instant instance

    Duration parsedDuration = Duration.parse("PT6H"); // parsing a Duration
    System.out.println("Parsed duration: " + parsedDuration); // Parsed duration: PT6H

    Instant end = Instant.now(); // storing the end time in an Instant instance

    Duration between = Duration.between(start, end); // finding the difference between start and end
    System.out.println("Difference of durations: " + between); // Difference of durations: PT0.0019994S
  }
}
/*
* Output:
* Duration of 4 days: PT96H
* Parsed duration: PT6H
* Difference of durations: PT0.0019994S
* */