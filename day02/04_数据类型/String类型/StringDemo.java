//字符串
public class StringDemo 
{
	public static void main(String[] args) 
	{
		//String的常量
		System.out.println("Hello World!");
		//String的变量
		String name = "李华";
		System.out.println("name =" +name);
		//输出"Hello"
		System.out.println("\"Hello\"");

		name="我是"+"jack";
		System.out.println("name =" +name);
		System.out.println("----------------------");
		System.out.println(7+8+"Hello World!");//输出15Hello World!
		System.out.println("Hello World!"+7+8);//输出Hello World!78
		System.out.println(7+"Hello World!"+8);//输出7Hello World!8

		String str = 17+"abc";
		System.out.println(str);
		//str = (String)17+"abc";//编译错误：不可转换的类型

	}
}
