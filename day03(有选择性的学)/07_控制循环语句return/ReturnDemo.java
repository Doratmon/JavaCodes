public class ReturnDemo 
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
		System.out.println("Hello");//Hello���Ա����
		System.out.println("-------------------------------");
		//return��䣬����ѭ�����ڵķ����������������ˣ�ѭ��Ҳ�ͽ�����
		//���������100����ǰ6���ܱ�3��������
		int count1 = 0;//countΪ������
		for(int i = 1; i <= 100; i++){

			if(i % 3 == 0)
			{
				count1++;
				System.out.print(i + " ");
			}

			if(count1 == 6)
				return;
		}
		System.out.println("Hello");//Hello���ܱ����
	}
}
