class Person
{
	private int age;//将年龄age私有，只有类Person中的属性可以访问
	String name;
	void setAge(int a)
	{
		if(a < 0)
		{
			System.out.println("年龄不能为负数");
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
