public class LoopDemo 
{
	public static void main(String[] args) 
	{
		while(true)//while死循环，while的括号中为boolean类型
		{
			System.out.println(1);
		}
		//do-while死循环类似

		for(;;)//for死循环，for循环中只有boolean表达式的地方不能打印，一共有四个语句
		{
			System.out.println(22);
		}
	}
}
