package com.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeDemo {

	public static void main(String[] args) {

		 LocalTime  time = LocalTime.now();
		 
		 System.out.println(time.getHour() +" : "+time.getMinute());
			
		 System.out.println(time.withHour(1));
		 
		
		
	}

}
