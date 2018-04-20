//参数值传递之引用类型
public class ParameterDemo2 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{23, 45};
		pArray(arr);
		swap(arr);
		pArray(arr);


	}
	static void pArray(int[] str)//按格式打印数组
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

	static void swap(int[] arr)//交换数组的第一个和最后一个值
	{
		int temp;
		temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
	}
}
