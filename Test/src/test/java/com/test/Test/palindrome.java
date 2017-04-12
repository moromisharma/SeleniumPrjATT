package com.test.Test;

public class palindrome {

	
	public boolean isPalindrome(String s) throws InterruptedException{
	
		//get the length of the word to traverse
		int l=s.length();
		System.out.println(l);
		
		for (int i =0;i<1000 ;i++){
			System.out.println("Hello");
			Thread.sleep(20000);
		}
		
		for (int i=0; i==l/2;i++){
			Thread.sleep(20000);
			if (s.charAt(i) != (s.charAt(l-i-1)))
			{
				System.out.println("not palindrom");
				return false;
			}
			
	}
		System.out.println("palindrome");
		return true;
	}
	public static void main(String [] args) throws InterruptedException{
		
		palindrome p = new palindrome();
		System.out.println("main");
		p.isPalindrome("noon");
		
	}
	
}
	

