class Student
{
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return this.name + "," + this.age;
	}
	
}
class ObjectDemo 
{
	public static void main(String[] args) 
	{
		String str = "ABC";
		System.out.println(str.hashCode());
		Object oj1 = new Object();
		Object oj2 = new Object();
		System.out.println(oj1.hashCode());
		System.out.println(oj2.hashCode());
		//== �����.equals()����ͬ�� ���Ƚ����õĵ�ֵַ�Ƿ���ͬ
		System.out.println(oj1==oj2);
		System.out.println(oj1.equals(oj2));
		Student s = new Student("С��", 15 );
		System.out.println(s);//Student@54624a40����Java��println(s)��println(s.toString());��ͬ��������String������д��toString����


	}
}
