class Servant//定义一个佣人类
{
	String name;
	String age;
	String sex;
	
	void shopping()
	{
		System.out.println("买菜");

	}
	void cook()
	{
		System.out.println("做饭");
	}

}
class Coder
{
	void coding()
	{
		System.out.println("写代码");
	}
	
}
public class ServantDemo 
{
	public static void main(String[] args) 
	{
		Servant s1 = new Servant();
		s1.shopping();
		s1.cook();
		Coder c1 = new Coder();
		c1.coding();
		System.out.println("菲佣s1的性别 " + s1.sex);//成员变量会自动初始化，局部变量不会
	}
}
