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
		super.fly();
		System.out.println("≈º≤ªª·∑…");
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
