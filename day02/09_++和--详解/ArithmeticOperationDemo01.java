//++、--运算符
class ArithmeticOperationDemo01 
{
	public static void main(String[] args) 
	{
		int a1 = 2;
		int b1 = a1++;//a1加一然后将原始值赋值给b1，原始值为2
		System.out.println("a1:"+a1+" "+"b1:"+b1);

		int a2 = 2;
		int b2 = ++a2;//a2加一然后将自加后的结果赋给b2
		System.out.println("a2:"+a2+" "+"b2:"+b2);




		int num1 = 1;
		num1 = num1++;
		System.out.println(num1);

		int num2 = 1;
		num2 = ++num2;
		System.out.println(num2);


	}
}
