package com._520it._03_math;

//Math中的常量和静态方法
public class MathDemo {
	public static void main(String[] args){
		System.out.println(Math.max(10, 99));
		
		//static double	random() 返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
		//[0,1)
		double ran = Math.random();
		System.out.println((int)(ran*100));
	}

}
