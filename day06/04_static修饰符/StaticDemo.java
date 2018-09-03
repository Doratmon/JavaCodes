//在Java中static修饰符存在于方法区 即所有类的字段都能访问 但是在底层还是用类名访问 类不能访问非静态方法
class Person
{
	String name;
	int age;
	static int total = 6;//静态成员变量，表示人类总数
	
	Person(String n, int a)
	{
		name = n;
		age = a;
		total ++;
	}
	void die()
	{
		total --;
		System.out.println("去世....");
	}

	static void destroy()
	{
		total = 0;
		System.out.println("人类毁灭");
	}

}

public class StaticDemo 
{
	public static void main(String[] args) 
	{
		System.out.println(Person.total);

		Person p1 = new Person("Tom",19);
		System.out.println(Person.total);
		System.out.println(p1.total);//在底层还是用类名调用

		p1.die();
		System.out.println(Person.total);
		
		Person.destroy();
		System.out.println(Person.total);



	}
}
