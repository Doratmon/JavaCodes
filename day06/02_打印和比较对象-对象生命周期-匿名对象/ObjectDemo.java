class Person
{
	String name;
	boolean sex;
	int age = 20;

	void eat()
	{
		System.out.println("吃饭");
	}

}
public class ObjectDemo 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		System.out.println(p1);//结果为对象p1的HashCode Person@f8db08
		Person p2 = new Person();
		if(p1 == p2)
			System.out.println("p1与p2的地址值相等");
		/*对象的生命周期：new一个对象时就在堆中为该对象申请一个内存空间，
		如果不再有变量引用该对象，过段时间就会被垃圾回收机制GC回收*/
		
		//匿名对象：一个没有名称没有将空间地址赋给变量的对象称为匿名对象，一般一个匿名对象只使用一次，如下所示
		//下面两个匿名对象的地址不相同
		new Person().name = "小明";
		new Person().name = "小李";


		Person p3 = new Person();

		Person[] p = new Person[]{p2,p3};

		for(Person elem : p)
			System.out.println(elem.name);



	}
}
