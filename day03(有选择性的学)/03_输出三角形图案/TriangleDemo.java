public class TriangleDemo 
{
	public static void main(String[] args) 
	{
		/*
		��������Σ�
		*
		**
		***
		****
		*****
		*/
		for(int line = 1; line <= 5; line ++)
		{
			for(int i = 1; i <= line; i ++)
				System.out.print("*");
			System.out.println();//��ӡ��һ�������κ���
		}
	}
}
