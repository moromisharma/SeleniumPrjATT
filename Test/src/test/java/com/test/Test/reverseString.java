package com.test.Test;

import java.io.CharArrayReader;

public class reverseString {

	
	public void  reverse(String s){
		String charToString = "";
		//get the length of the word to traverse
		int l=s.length();
		System.out.println(l);
		
		//int j=0;
		for (int i=l-1; i>-1;i--){
			charToString+= s.charAt(i);
			}
		System.out.println(charToString);
		
			
	}
	
	
	public void  reverse1(String s){
		StringBuilder charToString = null;
		//get the length of the word to traverse
//		int l=s.length();
//		System.out.println(l);
		StringBuilder dest = new StringBuilder(s);
		dest.reverse();
		System.out.println(dest);
	//	dest = dest.insert(2, s);
		//System.out.println(dest);
//		for (int i=l-1; i<-1;i--){
//			dest.append(s.charAt(i));			
//		System.out.println(dest);
//		}
		//return dest;
		
		String dest1 = new StringBuilder(s).reverse().toString();
		System.out.println(dest1);
		
			
	}
	
	public void  reverse2(String s){
		//String string="whatever";
		StringBuffer reverse = new StringBuffer(s).reverse();
		System.out.println(reverse);
		reverse.setCharAt(2,'a');
		System.out.println(reverse);
		
	//	return reverse;
			
	}
	public static void main(String [] args){
		
		reverseString p = new reverseString();
		System.out.println("main");
		p.reverse("apple");
		p.reverse1("this");
		p.reverse2("whatever");
		
	}
}
