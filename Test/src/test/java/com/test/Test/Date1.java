package com.test.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class Date1 {

public void currentdate(){
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("EEE, MMM d");
	LocalDate localDate = LocalDate.now();
	Date d = new Date();
	System.out.println(dtf.format(localDate)); //2016/11/16
	System.out.println(localDate);
	System.out.println(dtf1.format(localDate));
	System.out.println(d);
}

public static void main (String [] args)
{
	Date1  CD = new Date1();
	System.out.println("Main");
	
	CD.currentdate();
}

}
