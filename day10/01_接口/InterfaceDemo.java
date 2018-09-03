//类之间是继承关系，接口与类之间是实现关系
interface Person
{
	int a = 23;//默认使用public static final修饰
	void print();//默认使用public abstract修饰
	class Test//内部类默认使用public static修饰
	{
	}
}
class Animal
{
}
//爬行动物规范
interface IWalkable
{
	void walk();
}
//水生动物规范
interface ISwimable
{
	void swim();
}
//两栖动物规范，一个接口可以继承多个接口，而类只能单继承
interface Amphibiousable extends IWalkable,ISwimable
{
}
class Frog extends Animal implements IWalkable,ISwimable
{
	public void walk()
	{
		System.out.println("跳啊跳");
	}
	public void swim()
	{
		System.out.println("游啊游");
	}
}
class Cat extends Animal implements IWalkable//Cat不是抽象的, 并且未覆盖IWalkable中的抽象方法walk()
{
	public void walk()  //正在尝试分配更低的访问权限; 以前为public,子类得访问权限必须大于等于父类
	{
		System.out.println("走猫步");
	}
}
class  InterfaceDemo
{
	public static void main(String[] args) 
	{
		//Cat c = new Cat();//唾弃
		IWalkable w = new Cat();//面向接口编程，实现了真正的多态
		w.walk();
		Frog f = new Frog();//特殊情况：实现了两个接口,不能用接口定义了
		f.walk();
		f.swim();
	}
}
