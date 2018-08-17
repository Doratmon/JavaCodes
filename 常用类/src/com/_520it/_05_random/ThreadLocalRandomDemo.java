package com._520it._05_random;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomDemo {
	public static void main(String[] args) {
		ThreadLocalRandom tlr = ThreadLocalRandom.current();//返回当前类对象
		System.out.println(tlr.nextInt(34, 179));//范围[34,179)
		
	}

}
