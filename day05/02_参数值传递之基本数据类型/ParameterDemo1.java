//����ֵ����֮������������
public class ParameterDemo1 
{
	public static void main(String[] args) 
	{
		int x = 4;
		System.out.println("main����֮ǰx = " + x);
		swap(x);
		System.out.println("main����֮��x = " + x);
	}
	static void swap(int x)
	{
		System.out.println("change����֮ǰx = " + x);
		x = 34;
		System.out.println("change����֮��x = " + x);
	}
}
