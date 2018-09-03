class PrimeOperatation
{
	public static boolean judgePrime(int num)
	{
		if(int i = 2; i < sqrt(num); i ++ )
		{
			if(num % i == 0)
				return false;
		}
		System.out.println("1 * " + num);
		return true;

	}
	public static void decomposePrime(int num)
	{
		for( int i = 2; i < num ; i ++)
			if(!judgePrime(i))//Èç¹û
			continue;
			if(num 

	}
}
public class  PrimeDecomposition 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
