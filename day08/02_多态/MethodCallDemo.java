//2018/05/26 14:30:18
//多态和覆盖都是针对对象的概念，而隐藏是针对类的概念
/*分四种情况讨论
 * 1.父类有doWork(),子类无
 * 2.父类无doWork(),子类有,编译时先去父类找doWork()方法，找到则编译通过，找不到则不通过
 * 3.父类子类都有doWork()
 * 4.父类子类都有doWork(),为static类型，这种情况我们称之为隐藏，而不叫方法的覆盖
 */
//父类
class SuperClass
{
	static public void doWork()
	{
		System.out.println("SuperClass");
	}
	
}
//子类
class SubClass extends SuperClass
{
	static public void doWork()
	{
		System.out.println("SubClass");
	}
	
}
public class MethodCallDemo
{
	public static void main(String[] args)
	{
		SuperClass s = new SubClass();
		s.doWork();
	}

}
