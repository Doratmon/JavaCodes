
class Animal
{
	void eat()
	{
		System.out.println("åƒä¸€èˆ¬çš„é£Ÿç‰©");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("åƒéª¨å¤´");
	}
}
class Person//ËÇÑøÔ±
{
	//Ã»ÓĞÊ¹ÓÃ¶àÌ¬Ê±
	/*void feed(Dog d)
	{
		d.eat();
	}
	void feed(Cat c)
	{
		c.eat();
	}
	*/
	//Ê¹ÓÃ¶àÌ¬,Ò»¸ö·½·¨½â¾ö£¬ÕæÊµÀàĞÍÓÉÔËĞĞÀàĞÍ¾ö¶¨£¬¼´×ÓÀà¾ö¶¨
	void feed(Animal a)
	{
		a.eat();
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("åƒé±¼");
	}
}
public class AnimalDemo 
{
	public static void main(String[] args) 
	{
<<<<<<< HEAD
		//¶àÌ¬,±àÒëÀàĞÍºÍÔËĞĞÀàĞÍ²»ÏàÍ¬£¬ÒÔÏÂÕâÖÖÇé¿öÊÇ±àÒëÀàĞÍÊÇÔËĞĞÀàĞÍµÄ¸¸Àà
		//Animal a = new Dog();
		//Animal b = new Cat();
		Dog d = new Dog();
		Cat c = new Cat();
		Person p = new Person();
		p.feed(d);
		p.feed(c);

		
=======
		//å¤šæ€,ç¼–è¯‘ç±»å‹å’Œè¿è¡Œç±»å‹ä¸ç›¸åŒï¼Œä»¥ä¸‹è¿™ç§æƒ…å†µæ˜¯ç¼–è¯‘ç±»å‹æ˜¯è¿è¡Œç±»å‹çš„çˆ¶ç±»
		Animal a = new Dog();
		Animal b = new Cat();
		a.eat();
		b.eat();
>>>>>>> 1e5dea9230ced5267e6cabd8042a7d95037548c2
	}
}
