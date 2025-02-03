package com.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {


	ZonedDateTime   zDate =		ZonedDateTime.now();
		
				System.out.println("India "+zDate);
				
	ZonedDateTime  europeDate =	 ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
				
				System.out.println("Sydney "+europeDate);
	}

}
