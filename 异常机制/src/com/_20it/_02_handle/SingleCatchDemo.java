package com._20it._02_handle;

public class SingleCatchDemo {
	public static void main(String[] args) {
		System.out.println("begin.....");
		try{
			int ret =10 / 0;
			System.out.println(ret);
		}catch(ArithmeticException e){
			System.out.println("出异常了");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("end......");
		
	}
}
