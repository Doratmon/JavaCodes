class ArrayUtil 
{
	static int getMax(int[] nums)//求数组最大值
	{
		int max = nums[0];
		for(int i = 1; i < nums.length; i++)
		{
			if(nums[i] > max)
				max = nums[i];
		}
		return max;
	}

	static int getMin(int[] nums)//求数组最小值
	{
		int min = nums[0];
		for(int i = 1; i < nums.length; i++)
		{
			if(nums[i] < min)
				min = nums[i];
		}
		return min;
	}
	
	
	static void pArray(int[] str)//按格式打印：[A, B, C, D]
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

	
	static int[] reverse(int[] oldStr)//逆序打印
	{
		int[] newStr = new int[oldStr.length];
		/*oldStr    newStr
			2			0
			1			1
			0			2
		*/
		for(int index = oldStr.length - 1; index >= 0; index --)
		{
			newStr[oldStr.length - index -1] = oldStr[index];
		}
		return newStr;

	}
	static void bubbleSort(int[] arr)//冒泡排序
	{
		
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
	static int binarySearch(int[] arr,int key)//二分查找
	{
		
		int low = 0;
		int high = arr.length - 1;
		int mid;
		while(low <= high)
		{
			System.out.println(low + " ------------- " + high);
			mid = (low + high) >> 1;//相当于(low+high)/2
			if(arr[mid] > key)
			{
				high = mid - 1;
			}
			if(arr[mid] < key)
			{
				low = mid + 1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}
