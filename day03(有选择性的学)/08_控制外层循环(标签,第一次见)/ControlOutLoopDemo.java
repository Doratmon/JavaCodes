//�������ѭ�������μ��������÷���ע��
public class ControlOutLoopDemo 
{
	public static void main(String[] args) 
	{
		//�����99�˷���
		/*for(int line = 1; line <= 9; line++)
		{
			for(int i = 1; i <= line; i++)
				System.out.print(line + " * " + i + " = " + i * line + "\t");
			System.out.println();
		}
		*/

		//99�˷���ֻ���ǰ����
		/*out:for(int line = 1; line <= 9; line++)
		{
			for(int i = 1; i <= line; i++)
				System.out.print(line + " * " + i + " = " + i * line + "\t");
				System.out.println();
			if(line == 5)
				break out;//�������ǰ���к��������ѭ��
		}*/
		
		//���򱨴�:δ����ı�ǩ: out  ʹ�ñ�ǩʱ��break��continueӦ�ڱ�ʹ�õ�ѭ��֮��
		/*for(int line = 1; line <= 9; line++)
		{
			out:for(int i = 1; i <= line; i++)
			{
				System.out.print(line + " * " + i + " = " + i * line + "\t");
			}				
				System.out.println();
			if(line == 5)
				continue out;//�������ǰ���к��������ѭ��
		}
		*/
	}
}
