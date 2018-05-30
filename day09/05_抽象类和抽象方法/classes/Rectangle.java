// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractDemo.java


class Rectangle extends GraphDemo
{

	private Integer width;
	private Integer height;

	Rectangle(Integer integer, Integer integer1)
	{
		width = integer;
		height = integer1;
	}

	public Double getArea()
	{
		return Double.valueOf(width.doubleValue() * height.doubleValue());
	}

	public void get()
	{
		Integer integer = Integer.valueOf(width.intValue() * height.intValue());
	}
}
