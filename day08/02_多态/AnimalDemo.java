
class Animal
{
	void eat()
	{
		System.out.println("吃食物");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("吃骨头");
	}
	void watch()
	{
		System.out.println("看门");
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("吃鱼");
	}
	void catchMouse()
	{
		System.out.println("抓老鼠");	
	}
}
class Person//饲养员
{
	//非多态方法
	/*void feed(Dog d)
	{
		d.eat();
	}
	void feed(Cat c)
	{
		c.eat();
	}
	*/
	//多态方法，编译类型是运行类型的父类，a由子类实际决定
	void feed(Animal a)//Animal a = new Dog()
	{
		System.out.println("feeding");
		a.eat();
		//Dog  d = (Dog)a;
		//boolean b = A instanceof B判断对象A是不是类B的实例
		if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.watch();
		}else if(a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.catchMouse();
			
		}
		
	}
}

public class AnimalDemo 
{
	public static void main(String[] args) 
	{

		//编译类型是运行类型的父类,真实类型是运行类型，即子类
		//Animal a = new Dog();
		//Animal b = new Cat();
		//a.eat();
		//b.eat();

		Dog d = new Dog();
		Cat c = new Cat();
		Person p = new Person();
		p.feed(d);
		p.feed(c);

		
		Object obj = "ABC";//多态
		System.out.println(obj instanceof Object);//true
		System.out.println(obj instanceof String);//true
		
		//但是一般只想判断该对象是不是运行类型的实例,gecClass()获取该对象的真实类型，XX.class后面会讲
		System.out.println(obj.getClass() == Object.class);//false
		System.out.println(obj.getClass() == String.class);//true
		
	}
}
