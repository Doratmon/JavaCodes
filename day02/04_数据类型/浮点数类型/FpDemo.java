//浮点数
public class FpDemo
{
	public static void main(String[] args) 
	{
		//单精度float类型后需要加上f或者F
		float a = 2.3f;
		System.out.println(a);


		//双精度double类型后可省略d或D
		double b = 3.45;
		System.out.println(b);

		//精确到一定程度时即使double也会丧失精度
		double c = 2.00000000000000003;
		double d = 3.39999999999000000;
		System.out.println(c + d);
	}
}
