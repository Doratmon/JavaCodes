class Bird
{
	void fly()
	{
		System.out.println("����");
	}
}
class Penguin extends Bird
{
	void fly()
	{
		super.fly();
		System.out.println("ż�����");
	}
}
class SuperDemo 
{
	public static void main(String[] args) 
	{
		Penguin p = new Penguin();
		p.fly();
	}
}
