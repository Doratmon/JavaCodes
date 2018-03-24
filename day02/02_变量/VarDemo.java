//需求：变量实验
public class VarDemo
{
	public static void main(String[] args)
	{
		//未初始化a，直接打印a的结果与intellij不同，不会自动初始化
		/*
		int a;
		System.out.println(a);
		*/
		int a=2;
		int b=3;
		//比较好的编译风格：a后有空格
		System.out.println(a + b);
	}
}