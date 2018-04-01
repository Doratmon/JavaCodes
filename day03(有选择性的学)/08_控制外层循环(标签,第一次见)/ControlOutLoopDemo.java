//控制外层循环，初次见到这种用法，注意
public class ControlOutLoopDemo 
{
	public static void main(String[] args) 
	{
		//常规的99乘法表
		/*for(int line = 1; line <= 9; line++)
		{
			for(int i = 1; i <= line; i++)
				System.out.print(line + " * " + i + " = " + i * line + "\t");
			System.out.println();
		}
		*/

		//99乘法表只输出前五行
		/*out:for(int line = 1; line <= 9; line++)
		{
			for(int i = 1; i <= line; i++)
				System.out.print(line + " * " + i + " = " + i * line + "\t");
				System.out.println();
			if(line == 5)
				break out;//当输出完前五行后，跳出外层循环
		}*/
		
		//程序报错:未定义的标签: out  使用标签时，break或continue应在被使用的循环之内
		/*for(int line = 1; line <= 9; line++)
		{
			out:for(int i = 1; i <= line; i++)
			{
				System.out.print(line + " * " + i + " = " + i * line + "\t");
			}				
				System.out.println();
			if(line == 5)
				continue out;//当输出完前五行后，跳出外层循环
		}
		*/
	}
}
