//����Ķ�̬��ʼ��:�������趨����ĳ��ȣ��ж��ٸ�Ԫ�أ�����ʼֵ��ϵͳ��JVM������
public class ArrayInitDemo2 
{
	public static void main(String[] args) 
	{
		int[] nums = new int[4];
		System.out.println(nums.length);

		nums = new int[5];
		System.out.println(nums.length);

		nums = null;
		System.out.println(nums);
	}
}
