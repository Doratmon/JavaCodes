<<<<<<< HEAD:Java基础编程/RabbitsDemo.java
//���⣺쳲�������������
public class RabbitsDemo
{
	private static int countRabbits(int months)
	{
		if(months > 2)
		{
			return countRabbits(months - 1) + countRabbits(months - 2);//�ݹ�
		}
		else 
		return 1;
	}
	public static void main(String[] args) 
	{
			int months = 10;
			int sum = RabbitsDemo.countRabbits(months);
			System.out.println(sum);
	}
}
=======
package com._520it._01_Rabbit;

//问题：斐波拉契数列问题
public class RabbitsDemo {
	private static int countRabbits(int months)
	{
		if(months > 2)
		{
			return countRabbits(months - 1) + countRabbits(months - 2);//递归
		}
		else 
		return 1;
	}
	public static void main(String[] args) 
	{
			int months = 10;
			int sum = RabbitsDemo.countRabbits(months);
			System.out.println(sum);
	}

}
>>>>>>> 09766ffab1e499a165e28f039822fcfbb3e741bb:Java50/src/com/_520it/_01_Rabbit/RabbitsDemo.java
