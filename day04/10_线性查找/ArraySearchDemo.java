public class ArraySearchDemo 
{
	/*
	  Ѱ��Ԫ��elem
	  �������е�һ�γ��ֵ�λ��
	*/
	static int indexOf(int[] a, int elem)
	{
		for(int i = 0; i < a.length; i ++)
		{
			if(a[i] == elem)
				return i + 1;
		}
		return -1;//δ�ҵ��򷵻�-1
	}

	/*
	  Ѱ��Ԫ��elem
	  �����������һ�γ��ֵ�λ��
	*/
	static int indexOf2(int[] a, int elem)
	{
		for(int i = a.length - 1; i >= 0; i ++)
		{
			if(a[i] == elem)
				return i + 1;
		}
		return -1;//δ�ҵ��򷵻�-1
	}
	public static void main(String[] args) 
	{
		int[] a = {2, 3, 4, 2, 5, 6, 2};
		System.out.println("Ԫ��2��һ�γ��ֵ�λ�ã�" + ArraySearchDemo.indexOf(a, 2));
		System.out.println("Ԫ��2���һ�γ��ֵ�λ�ã�" + ArraySearchDemo.indexOf2(a, 2));

	}
}
