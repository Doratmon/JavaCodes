public class CacheDemo 
{
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1 == i2);//false,==比较的是地址

		Integer i3 = Integer.valueOf(123);  //在缓冲区中的数据范围是[-128,127]， 对于Long Bye Short等也是,缓存区之内的直接从缓存区取值
		Integer i4 = Integer.valueOf(123);
		System.out.println(i3 == i4);//true

		Integer i5 = 123;//在编译后也是Integer i5 = Integer.valueOf(123)
		Integer i6 = 123;
		System.out.println(i5 == i6);//true
       
	  
		System.out.println("---------------------");
		
		Integer i11 = new Integer(230);
		Integer i21 = new Integer(230);
		System.out.println(i11 == i21);//false

		Integer i31 = Integer.valueOf(230);
		Integer i41 = Integer.valueOf(230);
		System.out.println(i31 == i41);//false

		Integer i51 = 230;
		Integer i61 = 230;
		System.out.println(i51 == i61);//false
		System.out.println(i51.equals(i61));




	}
}
