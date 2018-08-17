package com._520it._04_charsequence;

//StringBuilder中的常用方法
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();//和new StringBuilder(16)一样
		//append方法拼接字符 返回对象本身
		sb1.append("A").append("B");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("ABCDEFG");
		StringBuilder NewSb = new StringBuilder(sb2.deleteCharAt(sb2.length() - 1).toString());//删除最后一个字符
		System.out.println(NewSb);
		
		
	}

}
