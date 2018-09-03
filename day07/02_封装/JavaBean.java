class Person
{
	private String name;
	private int age;
	public int getAge()
	{
		return age;
	}
	public void setAge(int a)
	{
		age = a;
	}
}
class JavaBean
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.setAge(12);
		int i  = p.getAge();
		System.out.println(i);
	}
}
