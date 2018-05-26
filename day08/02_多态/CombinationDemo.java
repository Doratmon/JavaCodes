
//以下为继承关系
/*public class CombinationDemo extends ArrayUtil
{
	public  void test()
	{
		int[] arr = {2,3,-3,6,1,0};
		int max = getMax(arr);
		System.out.println(1);
	}
	public static void main(String[] args)
	{
		new CombinationDemo().test();
	}
}*/
//以下为组合关系
public class CombinationDemo
{
	private ArrayUtil a = new ArrayUtil();
	public void test()
	{
		int[] arr = {2,3,-3,6,1,0};
		int max = a.getMax(arr);
		System.out.println(1);
	}
	public static void main(String[] args)
	{
		new CombinationDemo().test();
	}
}


