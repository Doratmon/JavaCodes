public class BitOperatorDemo2
{
	public static void main(String[] args) 
	{
		System.out.println(2 << 3);//16，左移后空位用0补充
		System.out.println(4 >> 1);//2，右移后空位用符号填充

		System.out.println(-2 >>> 3);//536870911,右移后空位用0填充

	}
}
