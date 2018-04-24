//方法的可变参数
public class VarParDemo 
{
	public static void main(String[] args) 
	{
		double[] arr = new double[]{10.0, 11.0, 12.0, 13.0, 14.0};
		double sum1 = getSum1(arr);
		System.out.println(sum1);

		double sum2 = getSum2(1.0,1.2,1.3,1.4,1.5);
		System.out.println(sum2);

	}
	static  double getSum1(double[] arr)
	{
		double sum = 0.0;
		for(int index = 0; index < arr.length; index ++)
		{
			sum += arr[index];
		}
		return sum;
	}
	static  double getSum2(double ... arr)//打三个点...代表可变参数
	{
		double sum = 0.0;
		for(int index = 0; index < arr.length; index ++)
		{
			sum += arr[index];
		}
		return sum;
	}
}
