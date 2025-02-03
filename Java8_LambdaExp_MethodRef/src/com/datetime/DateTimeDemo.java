package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {

	public static void main(String[] args) {
		
    LocalDate  date =		LocalDate.now();
    
    	System.out.println(date);
    	
    LocalDate  indpendent =           LocalDate.of(1947, 8, 15);
    
    		System.out.println(indpendent);
    		
    		  System.out.println("Day of year "+date.getDayOfYear());
    		  System.out.println("Get month name "+date.getMonth());
    		
    		  System.out.println(date.plusMonths(1));
    		  System.out.println(date.minusMonths(1));
    		  
    		  System.out.println(date.isEqual(indpendent));
    		  
    		  System.out.println(date.minusYears(1).isLeapYear());
    		  
    		  System.out.println(date.isBefore(indpendent));
    		  
    		  System.out.println(date.withDayOfYear(177));
    		  System.out.println(date.withDayOfMonth(21).getDayOfWeek());
    		  
    		  LocalDateTime  mydate = LocalDateTime.now();
    		  
    		  	System.out.println(mydate);
    		  	
    		  	System.out.println(mydate.getDayOfYear() +" day   "+mydate.getHour()+" hour");
    		  
    		  
    		  	Period period = indpendent.until(date);
    		  	
    		  	System.out.println("No. of years "+period.get(ChronoUnit.YEARS));
    		  	System.out.println("No. of months "+period.get(ChronoUnit.MONTHS));
    		  	System.out.println("No. of days "+period.get(ChronoUnit.DAYS));
    		  	
	}

}
