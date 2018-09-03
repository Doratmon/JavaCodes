package com._20it._03_finally;

public class FinallyDemo {
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
		}finally{
			System.out.println("end.....");
		}
		System.out.println("end......");
		
	}
}
