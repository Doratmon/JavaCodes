public class BubbleSortDemo 
{
	static void bubbleSort(int[] arr)
	{
		/*
		一步一步的一般方法
		int temp;
		//第一轮比较4次
		for(int i = 1; i <= 4; i++)
		{
			if(arr[i-1] > arr[i])
			{
				temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}

		}
		//第二轮比较3次
		for(int i = 1; i <= 3; i++)
		{
			if(arr[i-1] > arr[i])
			{
				temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}

		}
		//第三轮比较2次
		for(int i = 1; i <= 2; i++)
		{
			if(arr[i-1] > arr[i])
			{
				temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}

		}
		*/
		//优化算法 冒泡排序
		int temp;
		for(int times = 1; times <=arr.length - 1; times ++)
		for(int i = 1; i <= arr.length - times; i ++)
		{
			if(arr[i-1] > arr[i])
			{
				temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}
		}
			

	}
	//按格式打印：[A, B, C, D]
	static void pArray(int[] str)
	{
		String ret = "[";
		for(int index = 0; index < str.length; index ++)
		{
			ret = ret + str[index]; 
			if(index != str.length-1)
			ret = ret + ", ";
		}
		ret = ret + "]";
        System.out.println(ret);
	}
	public static void main(String[] args) 
	{
		int[] arr = {5, 4, 3, 2, 1};
		pArray(arr);
		bubbleSort(arr);
		pArray(arr);

	}
}
