public class TypeConvertDemo 
{
	public static void main(String[] args) 
	{
		//int�ͣ�float�ͣ�long�ͣ�double������ת��Ϊdouble��
		double d = 123 + 1.1f + 12L + 3.12;
		System.out.println(d);


		byte b = 23;
		b = (byte)(b + 23);//����: ������ʧ����,23Ĭ����int���ͣ�ת��Ϊbyte����Ӧ��ǿ������ת��
		System.out.println(b);
	}
}
