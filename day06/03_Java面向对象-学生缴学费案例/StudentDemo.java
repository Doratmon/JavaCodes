// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StudentDemo.java

import java.io.PrintStream;

public class StudentDemo
{

	public StudentDemo()
	{
	}

	public static void main(String args[])
	{
		Student student = new Student();
		student.name = "赵一";
		student.isFee = true;
		Student student1 = new Student();
		student1.name = "王二";
		Student student2 = new Student();
		student2.name = "张三";
		Student student3 = new Student();
		student3.name = "李四";
		student3.isFee = true;
		Student astudent[] = {
			student, student1, student2, student3
		};
		System.out.println("缴费前----------------");
		Student astudent1[] = astudent;
		int i = astudent1.length;
		for (int j = 0; j < i; j++)
		{
			Student student4 = astudent1[j];
			System.out.println(student4.isFee);
		}

		astudent1 = astudent;
		i = astudent1.length;
		for (int k = 0; k < i; k++)
		{
			Student student5 = astudent1[k];
			if (!student5.isFee)
				student5.fees();
		}

		System.out.println("缴费后----------------");
		astudent1 = astudent;
		i = astudent1.length;
		for (int l = 0; l < i; l++)
		{
			Student student6 = astudent1[l];
			System.out.println(student6.isFee);
		}

	}
}
