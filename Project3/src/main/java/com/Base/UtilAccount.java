package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilAccount extends UtilBrowser {

	public static  WebDriver driver =null;
	public  WebElement balance =null;
	public  WebElement recentbill =null;
	public  WebElement lastbill =null;
	public  WebElement currentDate =null;
	public  WebElement autoPayDate =null;
	
	
	public UtilAccount()
	{
		
	}
	public UtilAccount(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	By balance1 = By.xpath("//*[@id=\"new_Account_Overview\"]/div[2]/div/div[2]/div/div[1]/div[1]/div[2]/span");
	By recentbill1 =By.xpath("//*[@id=\"new_Account_Overview\"]/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/ul/li[1]/span");
	By lastbill1 =By.xpath("//*[@id=\"new_Account_Overview\"]/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/ul/li[2]/span");
	By currentDate1 =By.xpath("//*[@id=\"new_Account_Overview\"]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/span");


	public WebElement setBalance() {
		return driver.findElement(balance1);	
	}
		
	public WebElement setRecentbill() {
		return driver.findElement(recentbill1);
	}
	public WebElement setLastbill() {
		return driver.findElement(lastbill1);
	}
	public WebElement setCurrentDate() {
		return driver.findElement(currentDate1);
	}
	public static void setAutoPayDate() {
		
	}
	
	

}
	

