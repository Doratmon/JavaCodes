class Person
{
	String name;
	int age;
	void sleep()
	{
		System.out.println("Ë¯¾õ");
	}
}
class Student extends Person
{
	//String name;
	//int age;
	int stu_num;
	/*void sleep()
	{
		System.out.println("Ë¯¾õ");
	}*/
}
public class ExtendsDemo 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.sleep();
	}
}
