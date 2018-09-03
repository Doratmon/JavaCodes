public class BinarySearchDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int index = binarySearch(arr,10);
		System.out.println(index);
	}
	static int binarySearch(int[] arr,int key)
	{
		
		int low = 0;
		int high = arr.length - 1;
		int mid;
		while(low <= high)
		{
			System.out.println(low + " ------------- " + high);
			mid = (low + high) >> 1;//Ïàµ±ÓÚ(low+high)/2
			if(arr[mid] > key)
			{
				high = mid - 1;
			}
			if(arr[mid] < key)
			{
				low = mid + 1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}
