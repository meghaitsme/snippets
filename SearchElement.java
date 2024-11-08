package com.collections.framework;

public class SearchElement {

	public static void main(String[] args) {
		
		int[] a = {43,4,5,2,5,654,876};
		int target = 65;
		boolean found = false;
		for(int read : a ) {
			if(read == target ) {
				found = true ; 
				break;
			}
		}
		if(found) {
			System.out.println("element found ");//element found  654
		} else {
			System.out.println("element not found "); // element not found  65
		}

	}
}
	