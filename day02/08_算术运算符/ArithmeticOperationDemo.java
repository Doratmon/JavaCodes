//���������
public class ArithmeticOperationDemo 
{
	public static void main(String[] args) 
	{
		System.out.println('A' + 'B');

		System.out.println("AB" + "CD");

		System.out.println(10 / 3);//���Ϊ3

		//System.out.println(10 / 0);//ArithmeticException: / by zero �����쳣

		System.out.println(10.0 / 0);//Infinity--�������

		System.out.println(-10.0 / 0);//-Infinity--�������

		System.out.println(0.0 / 0.0);//NaN--����һ������Not a Number


		double d = 0.0 / 0.0;
		System.out.println(d == d);//���Ϊfalse������һ�������Լ��������Լ�

	}
}
