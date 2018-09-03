//方法的重载
public class OverloadDemo
{
	//求两个整数之和
	static int getSum(int a, int b)
	{
		return a + b;
	}
	//求两个小数之和
	static double getSum(double a, double b)
	{
		return a + b;
	}
	//打印字符串
	static void pString(String str)
	{
		System.out.println(str);
	}
	//打印boolean
	static void pBoolean(Boolean b)
	{
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		System.out.println(OverloadDemo.getSum(3 , 3));
		System.out.println(OverloadDemo.getSum(3.4 , 4.5));
		OverloadDemo.pString("Hello");
		OverloadDemo.pBoolean(true);

	}
}
