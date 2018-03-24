//显示类型转换
public class ConvertDemo02 
{
	public static void main(String[] args) 
	{
		int i = 2222;
		long l = (long)i;
		System.out.println(l);

		//23默认是int类型
		//把一个int类型常量直接赋给byte类型
		//编译器发现23在byte的范围之内，在底层偷偷转换了
		byte b = 23;
	}
}
