package com._20it._02_handle;

public class MultiCatchDemo {
	public static void main(String[] args) {
		String sNum1 = "20";
		String sNum2 = "l";

		try {
			int num1 = Integer.valueOf(sNum1);
			int num2 = Integer.valueOf(sNum2);
			System.out.println(" the result is:" + num1 / num2);

		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("数字格式转换异常");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("除零异常");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("其他异常");
			e.printStackTrace();
		}
	}

}
