//���ݹ�������
public class OverFlowDemo
{
	public static void main(String[] args) 
	{
		//int�������ݵ����ֵ
		int intMax = 2147483647;
		System.out.println(intMax);

		intMax = intMax + 1;
		System.out.println(intMax);
		
		//int�������͵���Сֵ
		int intMin = -2147483648;
		System.out.println(intMin);

		intMin = intMin - 1;
		System.out.println(intMin);
	}
}
