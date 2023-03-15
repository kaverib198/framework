package basicdemos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		
		LocalDate localdate=LocalDate.now();
		System.out.println("today"+localdate);//get current date
		LocalDate tomorow=localdate.plusDays(1);
		LocalDate yesterday=localdate.minusDays(1);
		System.out.println("tomorow"+tomorow);
		System.out.println("yesterday"+yesterday);
	
		LocalDateTime localdatetime=LocalDateTime.now();
	System.out.println(localdatetime);//get curent date n time
	
	LocalTime localtime=LocalTime.now();
	System.out.println(localtime);//current time
	}

}
