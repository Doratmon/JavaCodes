class Animal
{
	private String name;
	private int age;
	Animal(String name,int age)
	{
		this.name = name;//this指调用当前方法的对象
		this.age = age;
		System.out.println("调用Animal类的构造器");
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
}
class Fish extends Animal
{
	private String color;
	Fish(String name,int age,String color)//此类会默认调用父类的缺省构造器
	{
		//System.out.println("Hello");// 对super的调用必须是构造器中的第一个语句，类似于this
		//super();//该语句隐式使用
		super(name,age);//super指创建子类时创建的父类的对象
		this.color = color;
		System.out.println("鱼类初始化");
	}
	void show()
	{
		System.out.println(super.getName()  +  " " + super.getAge() + " " +color);//super可以省略，因为在子类中找不到过后会自动去父类寻找
	}

}
public class InitSuclassDemo
{
	public static void main(String[] args) 
	{
		Fish f = new Fish("小黄", 5, "橘黄色");
		f.show();
	}
}
