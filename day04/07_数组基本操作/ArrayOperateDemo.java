//�����������
public class ArrayOperateDemo 
{
	public static void main(String[] args) 
	{
		//��̬��ʼ������nums1
		int[] nums1 = new int[]{1,3,5,7,9};
		System.out.println("The length of nums1 is " + nums1.length);

		//����ı���
		for(int index = 0; index < nums1.length; index++)
			System.out.println(nums1[index]);

		System.out.println("------------------");

		nums1[3] = 44;//�ı�����ĳ��Ԫ��ֵ

		for(int index = 0; index < nums1.length; index++)
			System.out.println(nums1[index]);

		//����ķ�Χ[0,������.length-1]


	}
}
