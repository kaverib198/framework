package com.kavya.utilities;

import java.time.LocalDate;

public interface DateTimeUtility {
	
	
	public static String getcurrentDateYearMonth() {
		LocalDate localdate=LocalDate.now();
		String CurrentYearMonthDate=localdate.toString();
		return CurrentYearMonthDate;
	}
	
public static int getCurrentdate() {
	String CurrentYearMonthDate =getcurrentDateYearMonth();//2023-03-12
	                                                       //0    1  2
	String[] str= CurrentYearMonthDate.split("-");
	String date =str[str.length-1];
	int currentdate=Integer.parseInt(date);
	System.out.println(currentdate);
	return currentdate;
	
}
public static int getCurrentmonth() {
	String CurrentYearMonthDate =getcurrentDateYearMonth();//2023-03-12
	                                                       //0    1  2
	String[] str= CurrentYearMonthDate.split("-");
	String month =str[1];
	int currentmonth=Integer.parseInt(month);
	System.out.println(currentmonth);
	return currentmonth;
	
}
public static int getCurrentYear() {
	String CurrentYearMonthDate =getcurrentDateYearMonth();//2023-03-12
	                                                       //0    1  2
	String[] str= CurrentYearMonthDate.split("-");
	String year =str[0];
	int currentyear=Integer.parseInt(year);
	System.out.println(currentyear);
	return currentyear;
	
}
	
public static String getPastdays(int minusdays) {
	LocalDate localdate=	LocalDate.now();
	LocalDate pastdays=localdate.minusDays(minusdays);
	return pastdays.toString();
	
	
}

public static String getFuturedays(int plusdays) {
	LocalDate localdate=	LocalDate.now();
	LocalDate futuredays=localdate.minusDays(plusdays);
	return futuredays.toString();
	
	
}

}
