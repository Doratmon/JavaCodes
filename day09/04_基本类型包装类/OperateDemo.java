class OperateDemo 
{
	public static void main(String[] args) 
	{
		//包装类的常量
		int max = Integer.MAX_VALUE; 
		System.out.println(max);
		int min = Integer.MIN_VALUE; 
		System.out.println(min);

		//基本类型和包装类型的转换
		Integer i1 = new Integer(12);
		Integer i2 = Integer.valueOf(12);

		int i3 = i2.intValue();

		//String和基本类型之间的转化 
		String str = 12 + "";
		int num = Integer.parseInt("234");

		//String和包装类之间的转化 
		String str2 = i1.toString();
		Integer i4 = Integer.valueOf("123");
	}
}
