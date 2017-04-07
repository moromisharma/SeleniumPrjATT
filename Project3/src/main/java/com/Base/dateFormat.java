package com.Base;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class dateFormat {
	
	public String currentdate(){
		DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("EEE, MMM d");
		LocalDate localDate = LocalDate.now();
		//System.out.println(localDate);
		System.out.println(dtf1.format(localDate));
	//	System.out.println(d);
		return dtf1.format(localDate);
	}

}
