//��ǿforѭ��
public class ForEachDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{1,2,3,4,5};
		for(int index = 0; index < arr.length; index ++)//һ�������ʽ
			System.out.println(arr[index]);
		System.out.println("-------------------------");
		for(int ele : arr)//java5������ ��ǿforѭ�� �ڵײ��һ�㷽ʽ��һ����
			System.out.println(ele);
	}
}
