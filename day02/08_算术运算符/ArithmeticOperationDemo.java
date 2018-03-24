//算术运算符
public class ArithmeticOperationDemo 
{
	public static void main(String[] args) 
	{
		System.out.println('A' + 'B');

		System.out.println("AB" + "CD");

		System.out.println(10 / 3);//结果为3

		//System.out.println(10 / 0);//ArithmeticException: / by zero 除零异常

		System.out.println(10.0 / 0);//Infinity--正无穷大

		System.out.println(-10.0 / 0);//-Infinity--负无穷大

		System.out.println(0.0 / 0.0);//NaN--不是一个数，Not a Number


		double d = 0.0 / 0.0;
		System.out.println(d == d);//结果为false，不是一个数，自己不等于自己

	}
}
