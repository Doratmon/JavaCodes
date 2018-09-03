//数组的动态初始化:我们来设定数组的长度（有多少个元素），初始值由系统（JVM）决定
public class ArrayInitDemo2 
{
	public static void main(String[] args) 
	{
		int[] nums = new int[4];
		System.out.println(nums.length);

		nums = new int[5];
		System.out.println(nums.length);

		nums = null;
		System.out.println(nums);
	}
}
