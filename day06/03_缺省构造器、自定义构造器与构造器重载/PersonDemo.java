
//构造器的作用：1.联合new一起创建对象 2.给对象的成员变量初始化
class Person
{
	String name;
	int age;
	boolean sex;
	Person()//缺省\默认构造器
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
		Person p1 = new Person();//调用默认构造器创建一个对象

		Person p2 = new Person("Lily",20,true);
		System.out.println("name:" + p2.name + "\n" +"age:" + p2.age + "\n" + "sex:" + p2.sex);
	}
}
