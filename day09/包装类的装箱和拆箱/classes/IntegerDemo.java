// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IntegerDemo.java

import java.io.PrintStream;

public class IntegerDemo
{

	public IntegerDemo()
	{
	}

	public static void main(String args[])
	{
		Integer integer = new Integer(12);
		Integer integer1 = Integer.valueOf(12);
		System.out.println(integer);
		System.out.println(integer1);
		System.out.println("-----------------------");
		int i = integer.intValue();
		System.out.println(i);
		System.out.println("-----------------------");
		Integer integer2 = Integer.valueOf(19);
		int j = integer2.intValue();
		System.out.println(integer2);
		System.out.println(j);
		Integer integer3 = Integer.valueOf(17);
		Object aobj[] = {
			"ASC", Integer.valueOf(12), Double.valueOf(12.300000000000001D), Boolean.valueOf(true)
		};
	}
}
