import java.time.LocalDateTime;

/*
* LocalDateTime represents the local date and time without any time zone
* */
public class LocalDateTimeExample {
  public static void main ( String[] args ) {
    LocalDateTime now = LocalDateTime.now(); // creating an instance of LocalDateTime which store the current date
    // and time
    System.out.println("Current date and time: " + now); // Current date and time: 2024-06-29T23:22:22

    LocalDateTime userDateAndTime = LocalDateTime.of(2024, 10, 14, 12, 0); // creating a custom LocalDateTime instance
    System.out.println("Custom date and time: " + userDateAndTime); // Custom date and time: 2024-10-14T12:00

    LocalDateTime parsedDateAndTime = LocalDateTime.parse("2020-10-14T14:12"); // creating a parsed LocalDateTime
    // instance
    System.out.println("Parsed date and time: " + parsedDateAndTime); // Parsed date and time: 2020-10-14T14:12
  }
}
/*
* Output:
* Current date and time: 2024-06-29T23:22:22.407074200
* Custom date and time: 2024-10-14T12:00
* Parsed date and time: 2020-10-14T14:12
* */