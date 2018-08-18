package com._520it._06_date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		//格式化操作：Date-->String
		DateFormat df = DateFormat.getInstance();//获取为日期和时间使用 SHORT 风格的默认日期/时间格式器。
		String str = df.format(date);//将一个 Date 格式化为日期/时间字符串。
		System.out.println(str);
		
		df=DateFormat.getDateTimeInstance();//获取日期/时间格式器，该格式器具有默认语言环境的默认格式化风格。
		System.out.println(df.format(date));
		
		df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);//获取日期/时间格式器，该格式器具有默认语言环境的给定日期和时间格式化风格。
		System.out.println(df.format(date));
		
		//解析操作：String类型时间-->Date类型
		df = DateFormat.getInstance();
		str = df.format(date);
		date = df.parse(str);
		System.out.println(date);//Sat Aug 18 19:13:00 CST 2018
		
		
	}

}
