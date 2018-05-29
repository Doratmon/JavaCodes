/*final修饰符用于解决Java中继承破坏封装的情况
    分为:1. final类 
			 2. final方法 
			 3.final变量：只有final可以修饰变量，final修饰的变量为常量，命名规则：大写+_分割*/
//构造器不能用final修饰
class SuperClass
{
	public final void doWork(){}
}
class SubClass extends SuperClass//无法从最终SuperClass进行继承
{
	//public void doWork(){}//SubClass中的doWork()无法覆盖SuperClass中的doWork()
}
class FinalDemo 
{
	static final  String DOG_NAME = "tim" ;
	public static void main(String[] args) 
	{
		System.out.println(DOG_NAME);
	}
}
