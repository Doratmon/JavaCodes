//面向接口编程：多态得好处：把实现类对象赋给接口类型变量，屏蔽了不同实现类之间的实现差异，可以做到通用编程
//USB设备案例，接口的规范是双方共同遵循的
interface IUSB
{
	void swapData();
}
class Mouse implements IUSB
{
	public void swapData()
	{
		System.out.println("鼠标移动");
	}
}
class Print implements IUSB
{
	public void swapData()
	{
		System.out.println("打印,嘟嘟嘟");
	}
}
class Motherboard
{
	private static IUSB[] u = new IUSB[6];//定义IUSB类型的数组
	private static int index = 0;
	public static void PluginIn(IUSB usb)
	{
		if(index == 5)
		{
			return;
		}
		u[index] = usb;
		index ++;
	}
	public static void work()
	{
		for(IUSB elem : u)
		{
			if(elem != null)
			elem.swapData();
		}
	}
}
class InterfaceDemo1 
{
	public static void main(String[] args) 
	{
		IUSB m = new Mouse();
		Motherboard.PluginIn(m);
		Motherboard.PluginIn(new Print());
		Motherboard.PluginIn(new Print());
		Motherboard.PluginIn(new Print());
		Motherboard.PluginIn(new Print());
		Motherboard.PluginIn(new Print());
		Motherboard.work();
	}
}
