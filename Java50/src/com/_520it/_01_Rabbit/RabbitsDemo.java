<<<<<<< HEAD:JavaåŸºç¡€ç¼–ç¨‹/RabbitsDemo.java
//ÎÊÌâ£ºì³²¨À­ÆõÊýÁÐÎÊÌâ
public class RabbitsDemo
{
	private static int countRabbits(int months)
	{
		if(months > 2)
		{
			return countRabbits(months - 1) + countRabbits(months - 2);//µÝ¹é
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

//é—®é¢˜ï¼šæ–æ³¢æ‹‰å¥‘æ•°åˆ—é—®é¢˜
public class RabbitsDemo {
	private static int countRabbits(int months)
	{
		if(months > 2)
		{
			return countRabbits(months - 1) + countRabbits(months - 2);//é€’å½’
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
