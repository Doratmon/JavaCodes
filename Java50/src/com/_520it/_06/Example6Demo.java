package com._520it._06;
class Prime{
	public static boolean isPrime(int num){//判断是否为质数
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
}
public class Example6Demo {
	public static void main(String[] args) {
		int num1 = 7,num2 = 5;
		if(Prime.isPrime(num1) == true && Prime.isPrime(num2) == true){
			//如果两个都为质数
			System.out.println("最大公约数为 1，" + "最小公倍数为 " + num1*num2);
		}
		
	}

}
