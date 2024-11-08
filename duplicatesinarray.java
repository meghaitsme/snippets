package com.collections.framework;

import java.util.ArrayList;

public class duplicatesinarray {

	public ArrayList<Integer> removedupl(int[] a) {
		ArrayList<Integer> ar = new ArrayList<>();
		for (int arr : a) {
			if (!ar.contains(arr)) {
				ar.add(arr);
			}
		}
		return ar;
	}

	public static void main(String[] args) {

		int[] a = { 23, 4, 22, 4, 22, 3, 64 };
		duplicatesinarray obj = new duplicatesinarray();
		ArrayList<Integer> removedupvalue = obj.removedupl(a);

		System.out.println(removedupvalue); // [23, 4, 22, 3, 64]
		/*
		 * [23] [23, 4] [23, 4, 22] [23, 4, 22] [23, 4, 22] [23, 4, 22, 3] [23, 4, 22,
		 * 3, 64]
		 */

	}
}