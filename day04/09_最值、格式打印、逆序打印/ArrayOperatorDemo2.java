public class ArrayOperatorDemo2 
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
	
	//����ʽ��ӡ��[A, B, C, D]
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

	//�����ӡ
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
		//����ʽ��ӡ����
		ArrayOperatorDemo2.pArray(str);

		String[] newStr = ArrayOperatorDemo2.reverse(str);//��������
		
		ArrayOperatorDemo2.pArray(newStr);//����ʽ��ӡ����������



	}
}
