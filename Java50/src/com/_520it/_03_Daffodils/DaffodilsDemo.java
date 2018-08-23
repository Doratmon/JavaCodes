package com._520it._03_Daffodils;

//打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身
public class DaffodilsDemo
{
	public static boolean countDaffodils(int i)
	{
		int b = i / 100;//百位
		int s = ( i - b*100 )/ 10;//十位
		int g = i - b*100 - s*10;//个位
		if(b*b*b + s*s*s + g*g*g == i)
		{
			return true;
		}
		else
		return false;
			
	}
	public static void main(String[] args) 
	{
		    int num = 0;
			for(int i = 100; i <= 999; i ++)
				if(DaffodilsDemo.countDaffodils(i))
				{
					System.out.print(i + " ");
					num ++;
				}
			System.out.println();
			System.out.println("水仙花数总数：" +  num);
	}
}
