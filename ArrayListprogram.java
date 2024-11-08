package com.collections.framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ArrayListprogram {

	public static void main(String[] args) {
		//1. ArrayList 
		
		ArrayList<String> al = new ArrayList<>();
		al.add("duplicate allowed");
		al.add("null values are allowed");
		al.add("insertion order is preserved");
		al.add("heterogenous objects");
		al.add("duplicate allowed");
		al.add(null);
		
		System.out.println(al);
		//[duplicateallowed, nullvaluesareallowed, insertionorderispreserved, heterogenousobjects, duplicateallowed, null]

		Iterator<String> iterate = al.iterator();
		while(iterate.hasNext()) {
			System.out.println("has next "+ iterate.hasNext()); //true /false 
		}
		
		//==================================================================================
		HashSet<String> hset = new HashSet<>(); 
		hset.add("No duplicate");  
		hset.add("insertion order not preserved");
		hset.add(null);
		hset.add("No duplicate"); // 1 occurance 
		System.out.println(hset);
		//[null, insertion order not preserved, No duplicate]
		//==================================================================================
		HashMap<String,Integer> map = new HashMap<>();
		map.put("orange",30);
		map.put("apple", 20);
		map.put("pineapple", 40);
		map.put("pineapple", 50); // 2nd occurance 
		map.put("apple", 20);
		map.put("mango", 50);
		System.out.println(map);
		//{orange=30, apple=20, pineapple=50, mango=50}
		
		for(Map.Entry<String, Integer>  entry : map.entrySet()) {
			System.out.println("the key value pair "+ entry.getKey() + ":" + entry.getValue());			
		/*
		 * the key value pair orange:30
the key value pair apple:20
the key value pair pineapple:50
the key value pair mango:50*/	
		
		}
			
		
		
		//=======================================================================================
		for(String li : hset) {
			if(al.contains(li)) {
				System.out.println("the values are :"+al +" "+ li);
				//the values are :[duplicate allowed, null values are allowed, 
				//insertion order is preserved, heterogenous objects, duplicate allowed, null] null
			}
		}
		
		
		
		
		

	}

}
