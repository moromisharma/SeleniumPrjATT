package com.Business.flow;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Base.UtilBrowser;
import com.Base.UtilScreenshot;
import com.Base.dateFormat;
import com.Base.UtilAccount;




public class US1VerfiyBillGen extends  UtilBrowser{

	public static String HomePageTitle ="AT&T® Official - Entertainment, TV, Wireless & Internet";
	public static String LoginPageTitle ="myAT&T Login - Pay Bills Online & Manage Your AT&T Account";	
	public static String LoginTitleText = "Log in to manage your account";
	public static String welcome_text ="Welcome , Moromi";
	//public static String welcome_text ="Welcome back, Moromi";
	public static String currentURL ="https://www.att.com/olam/viewInterstitialPromo.myworld";
	
	public US1VerfiyBillGen(){
	}
	
	
	public US1VerfiyBillGen(WebDriver driver) {
		
		UtilBrowser.driver = driver;
		//super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 * Verification points
	 */

	
	//@SuppressWarnings({ "unused", "unused" })
	@Test (priority = 1)
	public static void VerifyBillGeneration(){
		System.out.println("test");
		US1VerfiyBillGen logObj = new US1VerfiyBillGen(driver);
		System.out.println("start test");
		logObj.launchBrowser("firefox"); //Launch Browser
		logObj.launchURL(); //Login to the application
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String LP = "LandingPage";
		UtilScreenshot s = new UtilScreenshot(driver);
		s.screens(LP);
		System.out.println("screenshot done");
		/*
		 * Check if the title matches
		 */
		
	
		try{				
		
		if (HomePageTitle.equals(title))
		{
			System.out.println("Title_matches");
		}
		
		else
		{
			System.out.println("Go back to the Page ");
		}
		}
		
		catch(Exception e){
			System.out.println("Exception Login Page Validation");
		}
		
		
		
		UtilBrowser l1 = new UtilBrowser(driver);  //creating object to access return from login()
		
		String texttitle = l1.login();
		
		System.out.println(texttitle);
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		
		/*
		 * Check if the title matches
		 */
		
	
		try{				
		
		if (LoginPageTitle.equals(title1) && LoginTitleText.equals(texttitle))
		{
			System.out.println("Title_matches in login Page - You are at the right page");
		}
		
		else
		{
			System.out.println("Go back to the Page ");
		}
		}
		
		catch(Exception e){
			System.out.println("Exception Login Page Validation");
		}
		
	}
	
	@Test (priority = 2 )
	public   void loginCredentials(){
		US1VerfiyBillGen logObj1 = new US1VerfiyBillGen(driver);
		//UtilBrowser w1 = new UtilBrowser(driver);
		UtilAccount  A1 = new UtilAccount(driver);
		dateFormat C1 = new dateFormat();
		UtilScreenshot ts = new UtilScreenshot(driver);
		WebElement e =null;
		
		logObj1.userName("moromi.s@gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // implicit wait use explicit wait.
		logObj1.password("Moroini08");
		logObj1.loginButton();
		
		/*
		 * @Verification - point1 - Check if redirecting to promo URL
		 * 
		 * */
		
		//Check if it is navigating to promo url- Click 
		String cURL = driver.getCurrentUrl();
		
		try{
		
			if (cURL.equals(currentURL))
		{
			logObj1.NoThanksOnPromo();
		}
			
			else{
				System.out.println("No Promos - redirection");
			}
		
		}
		catch (Exception ex){
			System.out.println("Exception at PromoURL");
		}
		//Check if welcome back is displayed
		//w1.WelComeback()
		String welcometext = logObj1.WelComeback();
		System.out.println(welcometext);
		
		/*
		 * @Verification - point1 - Check Welcome text
		 * 
		 * */
		
		try{
		if (welcometext.equals(welcome_text)){
			System.out.println("I can see the Welcome text = Welcome Back, Moromi");
		}
		else {
			String wc = "Welcome";
			
			
			
			ts.screens(wc);
			System.out.println();
		}
		}
		catch(Exception ex){
			System.out.println("Exception At Welcome text check point");
		}
		
		
		
		/*
		 * @Verification - check if its  zero or non zero amount on the balance
		 * 
		 * */
		
		e = A1.setBalance();
		String bAmount = e.getText();
		System.out.println(bAmount);
		//int A = Integer.parseInt(bAmount);
		//double B = 0.00;
		String B1 ="$0.00";
		try
		{
		
		if ( bAmount==B1){
			String Amount = "Amount";
			System.out.println(" bill has been paid for thie month");
			ts.screens(Amount);
		}
		
//		else if (A  > 0 )
//		{
//			System.out.println(" bill balance pending -check you bill");
//		}
//		else if (A < 0)
//		{
//			System.out.println("-ATT owes you");
//		}
		
		}
		
		catch (NumberFormatException ex){
		System.out.println("Check at account details page");
		
		}
		
	
	/*
	 * @Verification - Check the date  on the balance 
	 * 
	 * */
	try{
	 e =A1.setCurrentDate();
	 String cDate= (e.getText()); 
	 String cDatefromclass =(C1.currentdate());
	 System.out.println(cDate);	
	 System.out.println(cDatefromclass);
	 

		 
	 
	 if (cDatefromclass.equals(cDate)){
		 
		 System.out.println("The Date is the current Date");
	 }
	}
	 
	 catch (Exception ex){
		 System.out.println("Check your code");
	 }
	
	}
	
	 
	  
	 
	 
 
	}
	
	

	

