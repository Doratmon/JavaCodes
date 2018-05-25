class Animal
{
	void eat()
	{
		System.out.println("吃一般的食物");
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
	//没有使用多态时
	/*void feed(Dog d)
	{
		d.eat();
	}
	void feed(Cat c)
	{
		c.eat();
	}
	*/
	//使用多态,一个方法解决，真实类型由运行类型决定，即子类决定
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
		//多态,编译类型和运行类型不相同，以下这种情况是编译类型是运行类型的父类
		//Animal a = new Dog();
		//Animal b = new Cat();
		Dog d = new Dog();
		Cat c = new Cat();
		Person p = new Person();
		p.feed(d);
		p.feed(c);

		
	}
}
