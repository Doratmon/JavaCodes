package com._520it._05_random;

import java.util.Random;

//Random类用于产生一个伪随机数（通过相同的种子产生同样的随机数）
public class RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();//使用默认种子，以当前系统时间作为种子
		int i = rd.nextInt(100);//产生一个[0,100)的随机数
		System.out.println(i);
		System.out.println("-------------------");
		Random rd2 = new Random(10);
		System.out.println(rd2.nextBoolean());//true
		System.out.println(rd2.nextDouble());//0.4456342944175421
		System.out.println(rd2.nextInt());//1773446580
		System.out.println(rd2.nextInt(10));
	}

}
