public class DefineMethodDemo 
{
	//�޲��޷���
	static void p()
	{
		System.out.println("Hello!");
	}
	//�в��޷���
	static void pAge(int age)
	{
		System.out.println("Age ="+age);
	}
	//�޲��з���
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
