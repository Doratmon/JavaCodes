/*1 抽象类不一定必须包含抽象方法
   2 抽象方法存在的类必须是抽象类
   3 抽象类的方法不能用final、private、static（static是类级别的，不存在覆盖问题)修饰,
   抽象方法必须有方法体，且必须被覆盖
   4 抽象类不能被final修饰
   */

abstract class GraphDemo
{
	abstract public Double getArea();
}
class Circle extends GraphDemo
{
     private Integer r;
	 Circle(Integer r)
	{
		 this.r = r;
	 }
	 public  Double getArea()
	{
		return 3.14*r*r;
	 }
}
class Rectangle extends GraphDemo
{
	private Integer width;
	private Integer height;
	Rectangle(Integer width, Integer height)
	{
		this.width = width;
		this.height = height;
	}
	public Double getArea()
	{
		return width.doubleValue()*height.doubleValue();
	}
	public void get()//仅仅用于实验，无任何实在意义
	{
	/*
	width和height会自动拆箱为int类型相乘然后自动装箱为Integer类型，
	即相应包装类运算时还是要转换为基本类型
	*/
		Integer i =  width*height;
	}
}
class AbstractDemo
{
	public static void main(String[] args) 
	{
		System.out.println(new Circle(2).getArea());
		System.out.println(new Rectangle(2,3).getArea());
	}
}
