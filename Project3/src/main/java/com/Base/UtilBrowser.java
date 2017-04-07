package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UtilBrowser {
	
	public static  WebDriver driver =null;
	public WebElement loginButton1= null;
	public WebElement login1=null;
	public WebElement userName1=null;
	public WebElement password1 =null;
	public WebElement LoginTitle =null;
	public String  URL1 =null;
	public String URL ="https://www.att.com/";
	public WebElement Locate1;
	public WebElement Locate;
	
	
	//System.setProperty("webdriver.firefox.bin","C:\\Users\\morsharm\\Desktop\\Projects\\Selenium\\Selenium Webdrivers\\geckodriver.exe");
	
	public UtilBrowser()
	{
		
	}
	public UtilBrowser(WebDriver driver){
		UtilBrowser.driver =driver;
	}
	
	
	
	//Element Locators
			By login = By.id("ge5p_z2-user-auth");
			By userName = By.id("userName");
			By password = By.id("password");
			By loginButton =By.id("loginButton");
			By loginTitle = By.id("loginTitle");
			By WelcomeBack = By.xpath("//*[@id=\"UserName\"]/h1");// use \  before " since " is a special character
			By NoThanksPromo =By.partialLinkText("No,Thanks");
			
			
	public  WebDriver launchBrowser( String Browsername ) {
		if (Browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.bin","C:\\Users\\morsharm\\Desktop\\Projects\\Selenium\\Browser\\firefox-46.0.win64.sdk\\firefox-sdk\\bin\\firefox.exe");
			driver = new FirefoxDriver(); 
		}
		else if (Browsername.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.firefox.bin","C:\\Users\\morsharm\\Desktop\\Projects\\Selenium\\Browser\\firefox-46.0.win64.sdk\\firefox-sdk\\bin\\firefox.exe");
			driver = new ChromeDriver(); 
		}
		
		else if (Browsername.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.firefox.bin","C:\\Users\\morsharm\\Desktop\\Projects\\Selenium\\Browser\\firefox-46.0.win64.sdk\\firefox-sdk\\bin\\firefox.exe");
			driver = new InternetExplorerDriver(); 
		}
	 driver.manage().window().maximize();
	 return driver;
	}
	
	
	public String launchURL(){

		driver.get("https://www.att.com/");
		return  URL1;
	}
	
	
	/*
	 * click on the Login Button home Page
	 */
	//@Test (priority = 3)
	public String  login(){
		
		
		
		driver.findElement(login).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String title = null;
		
			title = driver.findElement(loginTitle).getText();
			//String title = wait.until(ExpectedConditions.visibilityOfElementLocated(driver.findElement(loginTitle).getText());
		
		return title;
		}
	
	//@Test (priority = 4 )
	public WebElement userName(String UID){
		
		driver.findElement(userName).sendKeys(UID);
		return userName1;
	}
	
	//@Test (priority = 5 )
	public WebElement password(String PWD){
		
		driver.findElement(password).sendKeys(PWD);
		return password1;
	}
	/*
	 * click on the Login Button  after entering credentials home Page
	 */
	
	public void loginButton(){
		driver.findElement(loginButton).click();
		//return login1;
	}
	
	public String WelComeback(){
		
		String  welcomeText =driver.findElement(WelcomeBack).getText();
		
		return welcomeText;
	}
	
	public void NoThanksOnPromo(){
		
		driver.findElement(NoThanksPromo).click();
		
	}
	

	}


