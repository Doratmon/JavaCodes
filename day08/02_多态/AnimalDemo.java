class Animal
{
	void eat()
	{
		System.out.println("��һ���ʳ��");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("�Թ�ͷ");
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
		System.out.println("����");
	}
}
public class AnimalDemo 
{
	public static void main(String[] args) 
	{
		//��̬,�������ͺ��������Ͳ���ͬ��������������Ǳ����������������͵ĸ���
		//Animal a = new Dog();
		//Animal b = new Cat();
		Dog d = new Dog();
		Cat c = new Cat();
		Person p = new Person();
		p.feed(d);
		p.feed(c);

		
	}
}
