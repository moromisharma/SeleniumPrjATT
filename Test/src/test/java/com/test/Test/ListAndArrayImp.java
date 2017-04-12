package com.test.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class ListAndArrayImp {

	
	public static void listImp(){
		
		ArrayList<String> arr1 = new ArrayList<>();
		
		arr1.add("Hello");
		arr1.add("Hello1");
		arr1.add("Hello2");
		arr1.add("Hello3");
		arr1.add("Hello3");
		System.out.println(arr1);
		
		//Iterator i = new arr1
		Iterator i = arr1.iterator();
		
	while(i.hasNext()){
		
		System.out.println(i.next());
	}
				
		//for(Iterator i :arr1.iterator()){
			
	//	}
	}
	
	public void arrayImp(){
		
	}
	
	public static void main(String [] args){
		
		System.out.println("main");
		listImp();
	}
}
