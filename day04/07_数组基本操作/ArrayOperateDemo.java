//数组基本操作
public class ArrayOperateDemo 
{
	public static void main(String[] args) 
	{
		//静态初始化数组nums1
		int[] nums1 = new int[]{1,3,5,7,9};
		System.out.println("The length of nums1 is " + nums1.length);

		//数组的遍历
		for(int index = 0; index < nums1.length; index++)
			System.out.println(nums1[index]);

		System.out.println("------------------");

		nums1[3] = 44;//改变数组某个元素值

		for(int index = 0; index < nums1.length; index++)
			System.out.println(nums1[index]);

		//数组的范围[0,数组名.length-1]


	}
}
