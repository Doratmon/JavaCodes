public class TriangleDemo 
{
	public static void main(String[] args) 
	{
		/*
		输出三角形：
		*
		**
		***
		****
		*****
		*/
		for(int line = 1; line <= 5; line ++)
		{
			for(int i = 1; i <= line; i ++)
				System.out.print("*");
			System.out.println();//打印完一行三角形后换行
		}
	}
}
