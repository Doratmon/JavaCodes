public class ArrayInArrayDemo
{
	public static void main(String[] args) 
	{
		//����ľ�̬���� java��ÿ��һά����Ԫ�ظ������Բ�һ��
		int[][] arr = {
			{1,2,3},
			{4,5},
			{6}
		};
		System.out.println(arr.length);
		for(int row = 0; row < arr.length; row ++)//arr.lengthΪ��λ����Ԫ�ظ���������Ԫ��Ϊһλ�������
		{
			System.out.println(arr[row]);//ÿ��Ԫ�صĹ�ϣ���룬��ÿ������Ԫ��Ϊ��Ӧһά����Ԫ�ص�����
			for(int index = 0; index < arr[row].length; index ++)//arr[row].lengthΪÿ��һά����ĳ���
			{
				System.out.println(arr[row][index]);//��ӡÿ������Ԫ��ֵ

			}

		}
			
	} 
}
