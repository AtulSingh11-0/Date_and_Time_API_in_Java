package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

/*
* Represents period between two dates
* */
public class PeriodExample {
  public static void main ( String[] args ) {
    LocalDate now = LocalDate.now(); // storing the current date in a LocalDate instance
    LocalDate then = LocalDate.of(2004, 10, 14); // storing a custom date in a LocalDate instance
    Period period = Period.between(now, then); // calculating the Time Period between them
    System.out.println("Period between then and now: " + period); // Period between then and now: P-19Y-8M-16D

    Period ofDays = Period.ofDays(5); // creating a Period instance of 5 days
    System.out.println("Period of: " + ofDays); // Period of: P5D
  }
}
/*
* Output:
* Period between then and now: P-19Y-8M-16D
* Period of: P5D
* */
