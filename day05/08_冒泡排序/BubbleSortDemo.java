public class BubbleSortDemo 
{
	static void bubbleSort(int[] arr)
	{
		/*
		һ��һ����һ�㷽��
		int temp;
		//��һ�ֱȽ�4��
		for(int i = 1; i <= 4; i++)
		{
			if(arr[i-1] > arr[i])
			{
				temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}

		}
		//�ڶ��ֱȽ�3��
		for(int i = 1; i <= 3; i++)
		{
			if(arr[i-1] > arr[i])
			{
				temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}

		}
		//�����ֱȽ�2��
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
		//�Ż��㷨 ð������
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
	//����ʽ��ӡ��[A, B, C, D]
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
