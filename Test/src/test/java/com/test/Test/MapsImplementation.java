package com.test.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MapsImplementation {
	
	
	public void SetImp(){
		
		/* "Set"  is an interface
		 * Methods in set :
		 *   
		 * 1. add() 2. clear() 3.contains()
		 * 
		 * Classes which implements Map :
		 * 1.HashSet - No order of display
		 *
		 * 2.LinkedHashSet - Displays the data in the same sequence as it was added
		 * 3.TreeSet - Displays in alphabetical order
		 * 
		 * 
		 * */

	Set<String> Set1 = new TreeSet();
	
	Set1.add("first");
	Set1.add("second");
	Set1.add("third");
	Set1.add("apple");
	System.out.println(Set1);
	
	 Iterator<String> b = Set1.iterator();
	 
	 System.out.println(b);
	boolean a = Set1.isEmpty();
	System.out.println(a);
	
	if(a!=true){ 
		System.out.println("not empty");
		
	Iterator i = Set1.iterator();
	
	while(i.hasNext()){
		
		System.out.println(i.next());
	for (String s : Set1){
		 System.out.println(s);
	}
	}
	}
	}
	public void MapImp(){
		/* "Map"  is an interface and it has a nested interface called "Entry" which is a set
		 * Methods in map :
		 *  1.Keyset() 2. entryset() 3.get(Object Key) 4.put(Key,value) 5. remove(object key) 
		 * 6 .put()
		 * Classes which implements Map :
		 * 1.HashMap - No order of display
		 * 2.HashTable -Same has hashmap  with small difference
		 * 3.LinkedHashMap - Displays the data in the same sequence as it was added
		 * 4.TreeMap - Displays in alphabetical order
		 * 
		 * 
		 * */

		Map<Integer, String> Hmap = new HashMap<Integer,String>();

		Hmap.put(1,"test");
		Hmap.put(2,"test2");
		Hmap.put(3,"test3");
		Hmap.put(4,"test4");
		Hmap.put(15,"test5");

		System.out.println(Hmap);
		
		Set<Integer> Sets= Hmap.keySet();
		//Hmap.
		
		// First create Map or  any kind of Map objects and access they key value
		for (Integer i : Sets){
			//System.out.println("key = "+ i + " value=" + Hmap.get(i));
			System.out.println(Hmap.get(i));
		}
		// To get the key and value has a single entry data  use "Entry"
		//First create Map or  any kind of Map objects and access both key and containes value
		
		Set<Map.Entry<Integer, String>> Sets1 = Hmap.entrySet();
		for (Map.Entry<Integer,String> S : Sets1){
			//System.out.println("Key="+ S.getKey() + " Value=" + S.getValue());
			System.out.println(S);
		}

	}
	
	public static void main(String [] args){
		
		MapsImplementation MI = new MapsImplementation();
		
		MI.MapImp();
		MI.SetImp();
	}
	
	

}
