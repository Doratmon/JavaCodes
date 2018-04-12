public class ArrayMaxMinDemo 
{
	static int getMax(int[] nums)//���������ֵ
	{
		int max = nums[0];
		for(int i = 1; i < nums.length; i++)
		{
			if(nums[i] > max)
				max = nums[i];
		}
		return max;
	}

	static int getMin(int[] nums)//��������Сֵ
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
