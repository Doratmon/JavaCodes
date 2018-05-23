import java.util.*;//导入在类ImportDemo中使用到的类
public class ImportDemo
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{4,1,8,2,1,5,7};
		//String ret = Arrays.toString(arr);//将int[]类型的数组转换为字符串
		//System.out.println(ret);
		Arrays.sort(arr);//对数组arr进行升序排序
		String ret = Arrays.toString(arr);
		System.out.println(ret);

		
	}
}
