//表达式类型转换
public class TypeConvertDemo 
{
	public static void main(String[] args) 
	{
		//int型，float型，long型，double型最终转换为double型
		double d = 123 + 1.1f + 12L + 3.12;
		System.out.println(d);


		byte b = 23;
		b = (byte)(b + 23);//错误: 可能损失精度,23默认是int类型，转换为byte类型应用强制类型转换
		System.out.println(b);
	}
}
