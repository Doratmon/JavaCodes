package com._520it._04_charsequence;

//面试题
public class StringDemo1 {
	//面试题1
	/*String str1 = "ABCD";
		String str2 = new String("ABCD");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));*/
	public static void main(String[] args) {
		//面试题2
		String str1 = "ABCD";
		String str2 = "A"+"B"+"C"+"D";
		String str3 = "AB"+"CD";
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		}

}
