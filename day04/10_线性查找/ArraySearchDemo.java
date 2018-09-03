public class ArraySearchDemo 
{
	/*
	  寻找元素elem
	  在数组中第一次出现的位置
	*/
	static int indexOf(int[] a, int elem)
	{
		for(int i = 0; i < a.length; i ++)
		{
			if(a[i] == elem)
				return i + 1;
		}
		return -1;//未找到则返回-1
	}

	/*
	  寻找元素elem
	  在数组中最后一次出现的位置
	*/
	static int indexOf2(int[] a, int elem)
	{
		for(int i = a.length - 1; i >= 0; i ++)
		{
			if(a[i] == elem)
				return i + 1;
		}
		return -1;//未找到则返回-1
	}
	public static void main(String[] args) 
	{
		int[] a = {2, 3, 4, 2, 5, 6, 2};
		System.out.println("元素2第一次出现的位置：" + ArraySearchDemo.indexOf(a, 2));
		System.out.println("元素2最后一次出现的位置：" + ArraySearchDemo.indexOf2(a, 2));

	}
}
