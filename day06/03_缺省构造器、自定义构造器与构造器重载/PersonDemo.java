
//�����������ã�1.����newһ�𴴽����� 2.������ĳ�Ա������ʼ��
class Person
{
	String name;
	int age;
	boolean sex;
	Person()//ȱʡ\Ĭ�Ϲ�����
	{
		System.out.println("--------------");
	}
	Person(String n,int a, boolean s)
	{
		 name = n;
		 age = a;
		 sex = s;
	}

}
public class PersonDemo
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();//����Ĭ�Ϲ���������һ������

		Person p2 = new Person("Lily",20,true);
		System.out.println("name:" + p2.name + "\n" +"age:" + p2.age + "\n" + "sex:" + p2.sex);
	}
}
