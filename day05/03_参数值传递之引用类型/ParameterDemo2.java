//����ֵ����֮��������
public class ParameterDemo2 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{23, 45};
		pArray(arr);
		swap(arr);
		pArray(arr);


	}
	static void pArray(int[] str)//����ʽ��ӡ����
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

	static void swap(int[] arr)//��������ĵ�һ�������һ��ֵ
	{
		int temp;
		temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
	}
}
