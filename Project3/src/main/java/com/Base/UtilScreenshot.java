package com.Base;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;



//public String ScreenName = null;

public  class UtilScreenshot extends UtilBrowser  {
	public   WebDriver driver;
	
//	public UtilScreenshot(){
//		
//	}
	//Constructor
	public UtilScreenshot(WebDriver driver) {
		this.driver = driver;
		//UtilScreenshot.driver = driver ;
		// TODO Auto-generated constructor stub
	}

//Screenshot classes
public  String screens(String ErrorName){
	 String SName = null;
		
	try
	{
	//Create reference of TakesScreenshot. We are casting the ==ts is the Takesscreenshot interface object
	
		TakesScreenshot  ts = (TakesScreenshot)driver; // creating an object for  takescreenshot interface using the driver object by typecastig
	
	
	
	//Call method to capture screenshot
	File source = ts.getScreenshotAs(OutputType.FILE); // This ts object gets the screenshot on File Type output hence we need to pass it to a File type object
	
	// Copy files to specific location here it will save all screenshot in our project home directory and
	// result.getName() will return name of test case so that screenshot name will be same
	
	FileUtils.copyFile(source, new File("./Screenshots/"+ErrorName +".png")); ///Fileutil is a class under org.apache.commons.io.
	
	System.out.println("Screenshot Taken");
	}
	
	catch (Exception e)
	{
		Logger logger = Logger.getLogger(UtilScreenshot.class);
		logger.getClass();
		e.printStackTrace();
		System.out.println("Exception");
	}
	
	finally
	{
		//driver.quit();
	}
	return SName;

}
}
