class Servant//����һ��Ӷ����
{
	String name;
	String age;
	String sex;
	
	void shopping()
	{
		System.out.println("���");

	}
	void cook()
	{
		System.out.println("����");
	}

}
class Coder
{
	void coding()
	{
		System.out.println("д����");
	}
	
}
public class ServantDemo 
{
	public static void main(String[] args) 
	{
		Servant s1 = new Servant();
		s1.shopping();
		s1.cook();
		Coder c1 = new Coder();
		c1.coding();
		System.out.println("��Ӷs1���Ա� " + s1.sex);//��Ա�������Զ���ʼ�����ֲ���������
	}
}
