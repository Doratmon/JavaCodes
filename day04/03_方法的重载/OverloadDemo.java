//����������
public class OverloadDemo
{
	//����������֮��
	static int getSum(int a, int b)
	{
		return a + b;
	}
	//������С��֮��
	static double getSum(double a, double b)
	{
		return a + b;
	}
	//��ӡ�ַ���
	static void pString(String str)
	{
		System.out.println(str);
	}
	//��ӡboolean
	static void pBoolean(Boolean b)
	{
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		System.out.println(OverloadDemo.getSum(3 , 3));
		System.out.println(OverloadDemo.getSum(3.4 , 4.5));
		OverloadDemo.pString("Hello");
		OverloadDemo.pBoolean(true);

	}
}
