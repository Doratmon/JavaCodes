//增强for循环
public class ForEachDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{1,2,3,4,5};
		for(int index = 0; index < arr.length; index ++)//一般遍历方式
			System.out.println(arr[index]);
		System.out.println("-------------------------");
		for(int ele : arr)//java5新特性 增强for循环 在底层和一般方式是一样的
			System.out.println(ele);
	}
}
