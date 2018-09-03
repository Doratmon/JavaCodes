//参数值传递之基本数据类型
public class ParameterDemo1 
{
	public static void main(String[] args) 
	{
		int x = 4;
		System.out.println("main函数之前x = " + x);
		swap(x);
		System.out.println("main函数之后x = " + x);
	}
	static void swap(int x)
	{
		System.out.println("change函数之前x = " + x);
		x = 34;
		System.out.println("change函数之后x = " + x);
	}
}
