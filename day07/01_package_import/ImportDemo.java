import java.util.*;//��������ImportDemo��ʹ�õ�����
public class ImportDemo
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{4,1,8,2,1,5,7};
		//String ret = Arrays.toString(arr);//��int[]���͵�����ת��Ϊ�ַ���
		//System.out.println(ret);
		Arrays.sort(arr);//������arr������������
		String ret = Arrays.toString(arr);
		System.out.println(ret);

		
	}
}
