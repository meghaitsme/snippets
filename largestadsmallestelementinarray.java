package com.collections.framework;

public class largestadsmallestelementinarray {

	public static void main(String[] args) {

		int[] a = {2,45,3,25,-7,832,2,3};
		
		int min = a[0];
		int max = a[0];
		
		for(int num :a) {
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}			
		}
		System.out.println("max is " + max); // max is :- 832
		System.out.println("min is " + min); // min is :- -7 
 }
}