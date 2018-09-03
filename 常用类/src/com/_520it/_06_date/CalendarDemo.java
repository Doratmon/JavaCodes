package com._520it._06_date;

import java.util.Calendar;
import java.util.Date;

//Calendar类是抽象类
public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(c.YEAR));
		//abstract  void	add(int field, int amount) 根据日历的规则，为给定的日历字段添加或减去指定的时间量。
		c.add(c.MONTH, 12);//当前月份加12
		//将Calendar对象转换为Date对象
		Date date = c.getTime();
		System.out.println(date.toLocaleString());
	}

}
