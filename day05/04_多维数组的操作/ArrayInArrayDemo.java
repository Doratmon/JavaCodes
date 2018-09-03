public class ArrayInArrayDemo
{
	public static void main(String[] args) 
	{
		//数组的静态定义 java中每个一维数组元素个数可以不一样
		int[][] arr = {
			{1,2,3},
			{4,5},
			{6}
		};
		System.out.println(arr.length);
		for(int row = 0; row < arr.length; row ++)//arr.length为二位数组元素个数，其中元素为一位数组个数
		{
			System.out.println(arr[row]);//每个元素的哈希编码，即每个数组元素为对应一维数组元素的引用
			for(int index = 0; index < arr[row].length; index ++)//arr[row].length为每个一维数组的长度
			{
				System.out.println(arr[row][index]);//打印每个整型元素值

			}

		}
			
	} 
}
