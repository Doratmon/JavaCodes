class SuperClass
{
	public String name = "SuperClass";
}
class SubClass extends SuperClass
{
	public String name = "SubClass";
}
public class CodeBlockDemo 
{
	public static void main(String[] args) 
	{
		SuperClass sub = new SubClass();
		System.out.println(sub.name);//SuperClass
		System.out.println("Hello World!");
	}
}
