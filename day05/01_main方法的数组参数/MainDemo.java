//只做了解，应在Dos环境中运行
public class MainDemo 
{
	//字符串类型的数组args
	public static void main(String[] args) 
	{
		System.out.println(args.length);//求数组args的长度
		for(int index = 0; index < args.length; index ++)//打印数组args中的元素
		{
			System.out.println(args[index]);
		}
	}
}
