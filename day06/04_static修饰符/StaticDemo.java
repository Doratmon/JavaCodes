//��Java��static���η������ڷ����� ����������ֶζ��ܷ��� �����ڵײ㻹������������ �಻�ܷ��ʷǾ�̬����
class Person
{
	String name;
	int age;
	static int total = 6;//��̬��Ա��������ʾ��������
	
	Person(String n, int a)
	{
		name = n;
		age = a;
		total ++;
	}
	void die()
	{
		total --;
		System.out.println("ȥ��....");
	}

	static void destroy()
	{
		total = 0;
		System.out.println("�������");
	}

}

public class StaticDemo 
{
	public static void main(String[] args) 
	{
		System.out.println(Person.total);

		Person p1 = new Person("Tom",19);
		System.out.println(Person.total);
		System.out.println(p1.total);//�ڵײ㻹������������

		p1.die();
		System.out.println(Person.total);
		
		Person.destroy();
		System.out.println(Person.total);



	}
}
