//数组的静态初始化：由我们为每一个数组元素设定初始值，数组长度由系统(JVM)决定
public class ArrayInitDemo1 
{
	public static void main(String[] args) 
	{
		//数组的一般初始化,数组的定义与初始化可以不一同进行
		int[] nums = new int[] {1,2,3,4};
		System.out.println(nums.length);//测量数组nums的长度
		int[] nums1 = {4,5,6,7};//数组的简单初始化,定义与初始化必须一同进行
		System.out.println(nums1.length);
	}
}
