/*写单例设计模式的步骤（饿汉形式,并非真正的饿汉式）：
1. 必须在该类中，自己先创建一个对象
2. 私有化自身的构造器，防止外界通过构造器创建新的对象
3. 向外暴露一个公共静态方法用于获取自身的对象
*/
class ArrayUtil
{
	private static ArrayUtil instance = new ArrayUtil();
	private ArrayUtil(){}
    public static ArrayUtil getInstance()
	{
		return instance;
	}

	public void sort(int[] arr)
	{
		System.out.println("排序");
	}
}
public class SingletonDemo 
{
	public static void main(String[] args) 
	{
		ArrayUtil.getInstance().sort(null);
	}
}
