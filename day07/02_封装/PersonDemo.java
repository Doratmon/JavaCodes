class Person
{
	private int age;//������age˽�У�ֻ����Person�е����Կ��Է���
	String name;
	void setAge(int a)
	{
		if(a < 0)
		{
			System.out.println("���䲻��Ϊ����");
			return;
		}
		age = a;
	}
	void getAge()
	{
		System.out.println("age:" + age);
	}

}
public class PersonDemo 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.name = "Will";
		p.setAge(15);
		p.setAge(-12);
		System.out.println(p.name);
		p.getAge();
	}
}
