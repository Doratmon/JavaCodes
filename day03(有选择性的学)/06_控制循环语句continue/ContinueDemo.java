public class ContinueDemo 
{
	public static void main(String[] args) 
	{
		//continue��䣬��������˼��skip��������ǰѭ����ִ����һ��ѭ��
		//���100��300���ܱ�3��������
		for(int i = 100; i <= 300; i++)
		{
			if(i % 3 != 0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
