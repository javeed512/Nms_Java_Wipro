package com.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatParsing {

	public static void main(String[] args) {


	DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy-dd");
		
//	LocalDate date =		LocalDate.now();
		
		String str = "11-2020-06";
		
		LocalDate mydate =		LocalDate.parse(str, formatter);
		
			
		//String  mydate =	d1.format(formatter);
	
			System.out.println(mydate.format(formatter1));
	}

}
