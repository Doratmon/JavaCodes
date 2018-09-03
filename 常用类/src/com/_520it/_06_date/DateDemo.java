package com._520it._06_date;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		//创建Date对象
		Date d = new Date();//默认底层用System.currentTimeMillis方法得到当前毫秒数
		System.out.println(d);//Sat Aug 18 17:23:46 CST 2018 CST(Central Standard Time)时区的缩写
		System.out.println("-------------------");
		
		//long-->Date对象
		long time = System.currentTimeMillis();//1970 年 1 月 1 日 00:00:00 以来的指定毫秒数
		Date d2 = new Date(time);
		System.out.println(d2);
		
		//Date对象-->long
		long currentTime = d.getTime();//1970 年 1 月 1 日 00:00:00 以来的指定毫秒数
		
		
		System.out.println("中国人日期风格 " + new Date().toLocaleString());//toLocalString转换为当地日期风格

	}

}
