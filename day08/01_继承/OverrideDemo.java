class Bird
{
	void fly()
	{
		System.out.println("∑…œË");
	}
}
class Penguin extends Bird
{
	void fly()
	{
		System.out.println("≈º≤ªª·∑…");
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
