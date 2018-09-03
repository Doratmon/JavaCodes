public class DefineMethodDemo 
{
	//无参无返回
	static void p()
	{
		System.out.println("Hello!");
	}
	//有参无返回
	static void pAge(int age)
	{
		System.out.println("Age ="+age);
	}
	//无参有返回
	static int Return()
	{
		return 14;
	}
	static int getSum(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args) 
	{
		DefineMethodDemo.p();
		DefineMethodDemo.pAge(13);
		DefineMethodDemo.Return();
		DefineMethodDemo.getSum(12,13);

	}
}
