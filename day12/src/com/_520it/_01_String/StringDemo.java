package com._520it._01_String;

public class StringDemo {
	public static void main(String[] args) {
		String str = "ABC";
		String str1 = "ABC";
		System.out.println(str == str1);//比较内存地址值
		System.out.println(str.equals(str1));//比较内容
	}

}
