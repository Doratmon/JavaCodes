package com._520it._07_regex;

//正则表达式表示表达式正确的规范性
//用途：匹配判断、分割、替换操作
public class RegexDemo {
	private static final boolean OK = true;
	private static final boolean NO_OK = false;
	public static void main(String[] args) {
		String str = "123456";
		//判断一个验证码是否是全数字
		
		//1.常规方法
		/*boolean b = RegexDemo.isNumber(str);
		if(b == true){
			System.out.println("验证码是全数字");
		}else{
			System.out.println("验证码不是全数字");
		}*/
		
		//2.运用正则表达式
		String regex = "\\d+";//\d表示数字 +表示可以出现一次或者多次
		System.out.println(str.matches(regex));
		
		//判断是否为电话号码的正则表达式
		String phoneNum = "1345881478";
		String regex2 = "^1[3|5|7|8|4]\\d{9}$";
		System.out.println(phoneNum.matches(regex2));
	}
	public static boolean isNumber(String str){
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) < '1' || str.charAt(i) > '9'){
				return NO_OK;
			}
		}
		return OK;
	}
}
