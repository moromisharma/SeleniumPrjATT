package com.Business.flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	
	public WebElement loginButton= null;
	public WebElement login=null;
	public WebElement userName=null;
	public WebElement password =null;
	public static void main(String args[])
	{
		System.setProperty("webdriver.firefox.bin","C:\\Users\\morsharm\\Desktop\\Projects\\Selenium\\Browser\\firefox-46.0.win64.sdk\\firefox-sdk\\bin\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.att.com/");
		
		
		By login = By.id("ge5p_z2-user-auth");
		By userName = By.id("userName");
		By password = By.id("password1");
		By loginButton =By.id("loginButton");
		
		driver.findElement(login).click();
		driver.findElement(userName).clear();
		
		driver.findElement(userName).sendKeys("moromi.s@gmail.com");
		driver.findElement(password).sendKeys("Moroini08");
		
		
		
	}
	
}
