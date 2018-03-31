public class Table99Demo 
{
	public static void main(String[] args) 
	{
		for(int line = 1; line <= 9; line ++){

			for(int i = 1; i <= line; i ++){
				System.out.print(i + " * " + line + " = " + i * line + "\t");//i * line可以不加括号，不过结果为字符串

			}
			System.out.println();
		}

	}
}
