package Programmings;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTimePrinter {
  public static void main(String[] args) {
	  
    Date now = new Date();

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    String formattedDate = dateFormat.format(now);

    System.out.println("Current date and time: " + formattedDate);
  }
}
