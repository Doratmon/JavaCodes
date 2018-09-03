public class ContinueDemo 
{
	public static void main(String[] args) 
	{
		//continue语句，继续的意思，skip，跳过当前循环，执行下一次循环
		//输出100到300不能被3整除的数
		for(int i = 100; i <= 300; i++)
		{
			if(i % 3 != 0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
