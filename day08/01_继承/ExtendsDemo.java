class Person
{
	String name;
	int age;
	void sleep()
	{
		System.out.println("˯��");
	}
}
class Student extends Person
{
	//String name;
	//int age;
	int stu_num;
	/*void sleep()
	{
		System.out.println("˯��");
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
