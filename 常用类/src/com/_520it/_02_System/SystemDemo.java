package com._520it._02_System;

import java.util.Arrays;

public class SystemDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		int[] src = {1,2,3,4,5,6,7};
		int[] dest = new int[10];
		System.out.println(Arrays.toString(dest));
		System.arraycopy(src, 2, dest, 0, 5);
		System.out.println(Arrays.toString(dest));
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
		Double d = 2.3;
		System.out.println(d.toString());

	}

}
