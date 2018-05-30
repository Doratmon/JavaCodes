


public class IntegerDemo
{
		public static void main(String[] args)
	{
			//装箱操作：把一个基本数据类型变量转换为对应的包装类对象
			//方式一
			Integer i1 = new Integer(12);
			//方式二
			Integer i2 = Integer.valueOf(12);
            System.out.println(i1);
			System.out.println(i2);
			//拆箱操作：把一个包装类对象转换为对应的基本数据类型变量
			System.out.println("-----------------------");
			int num1 = i1.intValue();
			 System.out.println(num1);
			System.out.println("-----------------------");
			 //JDK5开始提供了自动装箱与拆箱操作(语法糖)
			 Integer num2 = 19;
			 int num3 = num2;
			 System.out.println(num2);
			 System.out.println(num3);



			 //理解Object obj  = 17
			 //1. 自动装箱：17转换为Integer类型的对象
			 //2. 引用类型的自动类型转换，将子类对象转换为父类对象
			 //————Object可以接收一切数据类型，Object数组可以接收一切数据类型
			Object obj = 17;
			Object[] obj2 = {"ASC", 12, 12.3, true};
	}
}
