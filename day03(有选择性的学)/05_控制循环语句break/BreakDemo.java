public class BreakDemo 
{
	public static void main(String[] args) 
	{
		//break语句（stop），终止当前所在循环，因为break后的语句执行不了，所以不能编写
		//案例：输出100以内前6个能被3整除的数
		int count = 0;//count为计数器
		for(int i = 1; i <= 100; i++){

			if(i % 3 == 0)
			{
				count++;
				System.out.print(i + " ");
			}

			if(count == 6)
				break;
		}
	}
}
