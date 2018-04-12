public class ArrayMaxMinDemo 
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

	public static void main(String[] args) 
	{
		int[] nums = new int[]{1, 3, 5, 7};
		int max = ArrayMaxMinDemo.getMax(nums);
		System.out.println(max);
		int min = ArrayMaxMinDemo.getMin(nums);
		System.out.println(min);

	}
}
