package com._520it._02_system;

import java.util.Arrays;

public class SystemDemo {

	/**
	 * @param args
	 */
	//运行gc时会自动调用下面的方法
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("我被回收了");
	}
	public static void main(String[] args) {
		
		
		//static long	currentTimeMillis()  返回以毫秒为单位的当前时间。 以1970年0时0分0秒开始计算
		long begin = System.currentTimeMillis();
		
		int[] src = {1,2,3,4,5,6,7};
		int[] dest = new int[10];
		System.out.println(Arrays.toString(dest));
		
		//数组的拷贝操作
		//static void	arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		//从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
		System.arraycopy(src, 2, dest, 0, 5);
		System.out.println(Arrays.toString(dest));
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
		Double d = 2.3;
		System.out.println(d.toString());
		
		//static void	exit(int status) 终止当前正在运行的 Java 虚拟机，传入0表示正常结束，其他表示异常结束
		//System.exit(0);
		new SystemDemo();
		//static void	gc() 运行垃圾回收器。 一般不用
		System.gc();
		System.out.println("-------------------");
		
	}

}
