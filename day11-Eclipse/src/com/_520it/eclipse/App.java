package com._520it.eclipse;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		System.out.println("begin.........");
		int[] arr = {1,2,3,4,5,6};
		int index = Arrays.binarySearch(arr, 3);
		System.out.println(index);
		System.out.println("ending........");
	}

}
