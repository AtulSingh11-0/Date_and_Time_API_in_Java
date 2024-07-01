import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
* Formats and parses dates and times
* */
public class DateTimeFormatterExample {
  public static void main ( String[] args ) {
    LocalDateTime now = LocalDateTime.now(); // storing the current LocalDateTime
    System.out.println("Unformatted date and time: " + now); // Unformatted date and time: 2024-06-30T00:53:11.315737900

    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"); // formatting the display pattern
    String formattedDateAndTime = now.format(pattern); // storing the formatted LocalDateTime

    System.out.println("Formatted date and time: " + formattedDateAndTime); // Formatted date and time: 30.06.2024 00:53:11

    String zonedDateTime = "2004-10-14 12:31:59+05:00"; // example ZonedDateTime
    DateTimeFormatter zonedDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX"); // formatting it
    ZonedDateTime parsedDateTime = ZonedDateTime.parse(zonedDateTime, zonedDateTimeFormatter); // storing the parsed ZonedDateTime
    System.out.println("Formatted and Parsed zoned date time: " + parsedDateTime); // Formatted and Parsed zoned date time: 2004-10-14T12:31:59+05:00
  }
}
/*
* Output:
* Unformatted date and time: 2024-06-30T00:53:11.315737900
* Formatted date and time: 30.06.2024 00:53:11
* Formatted and Parsed zoned date time: 2004-10-14T12:31:59+05:00
* */
