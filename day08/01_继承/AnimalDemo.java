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
		Animal a = new Dog();
		Animal b = new Cat();
		a.eat();
		b.eat();
	}
}
