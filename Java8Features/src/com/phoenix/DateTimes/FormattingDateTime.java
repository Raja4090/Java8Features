package com.phoenix.DateTimes;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.swing.text.DateFormatter;

public class FormattingDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date=LocalDate.now();
		
		DateTimeFormatter formatter1=DateTimeFormatter
				.ofLocalizedDate(FormatStyle.FULL);
		
		
		  DateTimeFormatter formatter2=DateTimeFormatter
		  .ofLocalizedDate(FormatStyle.LONG);
		 
		
		
		  DateTimeFormatter formatter3=DateTimeFormatter
		  .ofLocalizedDate(FormatStyle.MEDIUM);
		 
		
		DateTimeFormatter formatter4=DateTimeFormatter
				 .ofLocalizedDate(FormatStyle.SHORT);

		String formatterDate1=date.format(formatter1);
		String formatterDate2=date.format(formatter2);
		String formatterDate3=date.format(formatter3);
		String formatterDate4=date.format(formatter4);
		
		System.out.println("Full: "+formatterDate1);
		System.out.println("Long: "+formatterDate2);
		System.out.println("Medium: "+formatterDate3);
		System.out.println("Sort: "+formatterDate4);
		
		
		
		/*
		 * DateTimeFormatter dth = DateTimeFormatter .ofPattern("dd MMMM, yyyy");
		 * System.out.println("dth: "+date.format(dth));
		 */
	
		DateTimeFormatter dth =	DateTimeFormatter .ofPattern("dd/MM/yyyy");
		System.out.println("dth: "+date.format(dth));
		
		LocalTime anyTime=LocalTime.of(5, 23, 56);
		DateTimeFormatter timeFmt=DateTimeFormatter.
				ofLocalizedTime(FormatStyle.SHORT);
		String fmtTime=anyTime.format(timeFmt);		
		System.out.println("Short: "+fmtTime);
		
		
		
	
	
	}

}
