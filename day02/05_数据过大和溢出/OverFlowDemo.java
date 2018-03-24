//数据过大和溢出
public class OverFlowDemo
{
	public static void main(String[] args) 
	{
		//int类型数据的最大值
		int intMax = 2147483647;
		System.out.println(intMax);

		intMax = intMax + 1;
		System.out.println(intMax);
		
		//int数据类型的最小值
		int intMin = -2147483648;
		System.out.println(intMin);

		intMin = intMin - 1;
		System.out.println(intMin);
	}
}
