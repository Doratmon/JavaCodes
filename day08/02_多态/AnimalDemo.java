
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
		Animal a = new Dog();
		Animal b = new Cat();
		a.eat();
		b.eat();
	}
}
