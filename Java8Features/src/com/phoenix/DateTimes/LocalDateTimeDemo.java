package com.phoenix.DateTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld=LocalDate.now();
		System.out.println("Current Date: "+ld);
		
		LocalDate yesterday=LocalDate.of(2017, 7, 15);
		System.out.println("Date :"+yesterday);

		LocalTime lt=LocalTime.now();
		System.out.println("Current time: "+lt);
		
		lt=LocalTime.of(10,20,30);
		System.out.println("Time: "+lt);
		
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("CurrentDateTime: "+ldt);
		
		
		ldt=LocalDateTime.of(yesterday, lt);
		System.out.println(ldt);
		
		
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println("Current Zone Date Time: "+zdt);
		
		ZoneId zd=ZoneId.systemDefault();
		System.out.println(zd);
		
		Set<String>zones=ZoneId.getAvailableZoneIds();
		zones.stream().sorted()
		.filter(z->z.startsWith("I")||z.startsWith("A")).forEach(System.out::println);
		
		ZoneId zn=ZoneId.of("US/Hawaii");
		ZonedDateTime zdt1=ZonedDateTime.of(ldt, zn);
		System.out.println(zdt1);
		
		
		
		
		
	}

}
