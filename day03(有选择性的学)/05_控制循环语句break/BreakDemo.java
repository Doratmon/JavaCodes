public class BreakDemo 
{
	public static void main(String[] args) 
	{
		//break��䣨stop������ֹ��ǰ����ѭ������Ϊbreak������ִ�в��ˣ����Բ��ܱ�д
		//���������100����ǰ6���ܱ�3��������
		int count = 0;//countΪ������
		for(int i = 1; i <= 100; i++){

			if(i % 3 == 0)
			{
				count++;
				System.out.print(i + " ");
			}

			if(count == 6)
				break;
		}
	}
}
