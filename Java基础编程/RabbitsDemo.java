//���⣺쳲�������������
public class RabbitsDemo
{
	private static int countRabbits(int months)
	{
		if(months > 2)
		{
			return countRabbits(months - 1) + countRabbits(months - 2);//�ݹ�
		}
		else 
		return 1;
	}
	public static void main(String[] args) 
	{
			int months = 10;
			int sum = RabbitsDemo.countRabbits(months);
			System.out.println(sum);
	}
}
