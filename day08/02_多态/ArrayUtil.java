class ArrayUtil 
{
	static int getMax(int[] nums)//ÇóÊý×é×î´óÖµ
	{
		int max = nums[0];
		for(int i = 1; i < nums.length; i++)
		{
			if(nums[i] > max)
				max = nums[i];
		}
		return max;
	}
	
}
