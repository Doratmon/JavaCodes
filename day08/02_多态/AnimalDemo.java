
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
class Person//����Ա
{
	//û��ʹ�ö�̬ʱ
	/*void feed(Dog d)
	{
		d.eat();
	}
	void feed(Cat c)
	{
		c.eat();
	}
	*/
	//ʹ�ö�̬,һ�������������ʵ�������������;��������������
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
<<<<<<< HEAD
		//��̬,�������ͺ��������Ͳ���ͬ��������������Ǳ����������������͵ĸ���
		//Animal a = new Dog();
		//Animal b = new Cat();
		Dog d = new Dog();
		Cat c = new Cat();
		Person p = new Person();
		p.feed(d);
		p.feed(c);

		
=======
		//多态,编译类型和运行类型不相同，以下这种情况是编译类型是运行类型的父类
		Animal a = new Dog();
		Animal b = new Cat();
		a.eat();
		b.eat();
>>>>>>> 1e5dea9230ced5267e6cabd8042a7d95037548c2
	}
}
