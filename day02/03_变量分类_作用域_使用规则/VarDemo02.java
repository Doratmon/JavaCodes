//变量分类-作用域-使用规则
/*
成员变量/字段(Field)：直接定义在类的{}中，方法外的变量
局部变量：处理成员变量

变量的作用域：可以起作用的领域
	成员变量：在所定义的类中起作用
	局部变量：从定义的那一个地方号开始，到紧跟着的花括号结束
  
*/
public class VarDemo02  
{
	//int a = 2;
	//static int a = 2;
	public static void main(String[] args) 
	{
		/*
			报错：错误: 无法从静态上下文(环境)中引用非静态 变量 a
			解决方法：在int之前加上static
			System.out.println(a);
		*/
		int a = 3;
		//输出结果为3，就近原则
		System.out.println(a);
	}
	/*
	static int a = 3;
	System.out.println( a );
	*/
}
