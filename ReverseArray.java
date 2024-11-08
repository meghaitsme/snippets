package com.collections.framework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {  //Reverse Array  

	public static void main(String[] args) {

		int a[] = {65,43,3873,3725,-93}; // i/p 
	
		int left = 0;  // index = 0 
		int right = a.length-1;  // n-1 
		
		while(left < right) {  //0 < n-1 
			int temp = a[left]; // 0 =65;=> 65  43  3873 3725
			a[left] = a[right];//-93  3725  3873 43 65
			a[right] = temp;//65   43  3873 3725  -93
		
		left++;
		right--;
		}
		System.out.println(Arrays.toString(a));
		
	//[-93, 3725, 3873, 43, 65] o/p
		
	}
	
	
}
