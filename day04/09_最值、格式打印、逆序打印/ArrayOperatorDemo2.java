public class ArrayOperatorDemo2 
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
	
	//按格式打印：[A, B, C, D]
	static void pArray(String[] str)
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

	//逆序打印
	static String[] reverse(String[] oldStr)
	{
		String[] newStr = new String[oldStr.length];
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
	public static void main(String[] args) 
	{
		int[] nums = new int[]{1, 3, 5, 7};
		int max = ArrayMaxMinDemo.getMax(nums);
		System.out.println(max);
		int min = ArrayMaxMinDemo.getMin(nums);
		System.out.println(min);

		String[] str = new String[]{"A", "B", "C", "D"};
		//按格式打印数组
		ArrayOperatorDemo2.pArray(str);

		String[] newStr = ArrayOperatorDemo2.reverse(str);//数组逆序
		
		ArrayOperatorDemo2.pArray(newStr);//按格式打印逆序后的数组



	}
}
