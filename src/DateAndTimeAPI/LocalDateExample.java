import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/*
* LocalDate represents a date without any time zone
* */
public class LocalDateExample {
  public static void main ( String[] args ) {
    LocalDate now = LocalDate.now(); // creating an instance of LocalDate which store the current date
    System.out.println("Current Date: " + now); // Current Date: 2024-06-29

    int year = now.getYear(); // getting the current year
    System.out.println("Year: " + year); // Year: 2024

    int dayOfMonth = now.getDayOfMonth(); // getting day of the month
    System.out.println("Day of Month: " + dayOfMonth); // Day of Month: 29

    DayOfWeek dayOfWeek = now.getDayOfWeek(); // getting day of the week
    System.out.println("Day of Week: " + dayOfWeek); // Day of Week: SATURDAY

    int dayOfYear = now.getDayOfYear(); // getting day of the year
    System.out.println("Day of Year: " + dayOfYear); // Day of Year: 181

    Month month = now.getMonth(); // getting the month enum
    System.out.println("Month: " + month); // Month: JUNE

    int monthValue = now.getMonthValue(); // getting the value of the month enum
    System.out.println("Month value: " + monthValue); // Month value: 6


    LocalDate userDate = LocalDate.of(2004, 10, 14); // creating custom LocalDate using the of() method
    System.out.println("User date: " + userDate); // User date: 2004-10-14

    // will print true if custom user date is after today and false if otherwise
    System.out.println(userDate.isAfter(now)); // false
  }
}
/*
 * Output:
 * Current Date: 2024-06-29
 * Year: 2024
 * Day of Month: 29
 * Day of Week: SATURDAY
 * Day of Year: 181
 * Month: JUNE
 * Month value: 6
 * User date: 2004-10-14
 * false
*/