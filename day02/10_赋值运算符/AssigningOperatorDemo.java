public class AssigningOperatorDemo 
{
	public static void main(String[] args) 
	{
		/*
		1.声明一个int类型变量age
		2.在内存中存储常量数据18
		3.将18赋值给变量age
		*/
		int age = 18;


		int a = 33;
		/*
		1.+=赋值符号中间不能有空格
		2.a += 3等价于a = (int)(a + 3);
		*/
		a += 3;
		System.out.println(a);

	}
}
