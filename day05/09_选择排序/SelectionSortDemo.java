public class SelectionSortDemo 
{
	static void selectionSort(int[] arr)
	{
		/*int temp;
		//第一轮比较5次
		for(int i = 1; i <= arr.length - 1; i ++)
			if(arr[0] > arr[i])
			{
				temp = arr[0];
				arr[0] = arr[i];
				arr[i] = temp;
			}
		//第二轮比较4次
		for(int i = 2; i <= arr.length - 1; i ++)
			if(arr[1] > arr[i])
			{
				temp = arr[1];
				arr[1] = arr[i];
				arr[i] = temp;
			}
		//第三轮比较3次
		for(int i = 3; i <= arr.length - 1; i ++)
			if(arr[2] > arr[i])
			{
				temp = arr[1];
				arr[2] = arr[i];
				arr[i] = temp;
			}
		*/
		
		//真正的选择排序
		int temp,minIndex;
		for(int times = 1; times <= arr.length - 1; times ++)
		{
			temp = arr[times-1];
			minIndex = times - 1;
			for(int i = times; i <= arr.length - 1; i ++)
			{
				if(temp > arr[i])
				{
					temp = arr[i];
					minIndex = i;
				}
					
			}
			arr[minIndex] = arr[times-1];
			arr[times - 1] = temp;

		}
			



	}
	public static void main(String[] args) 
	{
		int[] arr = {4, 5, 1, 3, 9, 2};
		pArray(arr);
		selectionSort(arr);
		pArray(arr);

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
}
