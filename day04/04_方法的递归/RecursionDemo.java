//�����ĵݹ飬쳲��������У�Fn(0)=0,Fn(1)=1,Fn(n)=F(n-1)+F(n-2)(n>=2)
//�ݹ鼴���������䱾�� 
public class RecursionDemo
{
	static int Fibonacci(int n)
	{
		if(n == 0)
		{
			return 0;
		}else if(n == 1)
		{
			return 1;
		}else
		{
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}
	public static void main(String[] args) 
	{
		int ret = Fibonacci(4);
		System.out.println(ret);
		int ret1 = Fibonacci(8);
		System.out.println(ret1);
	}
}
