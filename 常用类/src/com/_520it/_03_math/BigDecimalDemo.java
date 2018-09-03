package com._520it._03_math;

import java.math.BigDecimal;

public class BigDecimalDemo {
	//使用double结果不精确
	public static void main(String[] args){
		System.out.println("0.09 + 0.01 = " + (0.09 + 0.01));
		
		//使用BigDecimal BigDecimal(double val)-->构造器 double类型不精确
		BigDecimal num1 = new BigDecimal(0.09);
		BigDecimal num2 = new BigDecimal(0.01);
		System.out.println(num1.add(num2));//0.09999999999999999687749774324174723005853593349456787109375
		
		//使用BigDecimal BigDecimal(String val)-->String类型构造器
		num1 = new BigDecimal("0.09");
		num2 = new BigDecimal("0.01");
		System.out.println(num1.add(num2));
	}
}
