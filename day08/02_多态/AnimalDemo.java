
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
	void feed(Animal a)
	{
		a.eat();
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("吃鱼");
	}
}
public class AnimalDemo 
{
	public static void main(String[] args) 
	{

		//编译类型是运行类型的父类
		//Animal a = new Dog();
		//Animal b = new Cat();
		Dog d = new Dog();
		Cat c = new Cat();
		Person p = new Person();
		p.feed(d);
		p.feed(c);

		

		//
		Animal a = new Dog();
		Animal b = new Cat();
		a.eat();
		b.eat();

	}
}
