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
		System.out.println("ż�����");
	}
}
public class OverrideDemo 
{
	public static void main(String[] args) 
	{
		Penguin p = new Penguin();
		p.fly();
	}
}
