class Person
{
	String name;
	boolean sex;
	int age = 20;

	void eat()
	{
		System.out.println("�Է�");
	}

}
public class ObjectDemo 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		System.out.println(p1);//���Ϊ����p1��HashCode Person@f8db08
		Person p2 = new Person();
		if(p1 == p2)
			System.out.println("p1��p2�ĵ�ֵַ���");
		/*������������ڣ�newһ������ʱ���ڶ���Ϊ�ö�������һ���ڴ�ռ䣬
		��������б������øö��󣬹���ʱ��ͻᱻ�������ջ���GC����*/
		
		//��������һ��û������û�н��ռ��ַ���������Ķ����Ϊ��������һ��һ����������ֻʹ��һ�Σ�������ʾ
		//����������������ĵ�ַ����ͬ
		new Person().name = "С��";
		new Person().name = "С��";


		Person p3 = new Person();

		Person[] p = new Person[]{p2,p3};

		for(Person elem : p)
			System.out.println(elem.name);



	}
}
