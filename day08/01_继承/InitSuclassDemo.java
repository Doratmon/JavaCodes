class Animal
{
	private String name;
	private int age;
	Animal(String name,int age)
	{
		this.name = name;//thisָ���õ�ǰ�����Ķ���
		this.age = age;
		System.out.println("����Animal��Ĺ�����");
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
}
class Fish extends Animal
{
	private String color;
	Fish(String name,int age,String color)//�����Ĭ�ϵ��ø����ȱʡ������
	{
		//System.out.println("Hello");// ��super�ĵ��ñ����ǹ������еĵ�һ����䣬������this
		//super();//�������ʽʹ��
		super(name,age);//superָ��������ʱ�����ĸ���Ķ���
		this.color = color;
		System.out.println("�����ʼ��");
	}
	void show()
	{
		System.out.println(super.getName()  +  " " + super.getAge() + " " +color);//super����ʡ�ԣ���Ϊ���������Ҳ���������Զ�ȥ����Ѱ��
	}

}
public class InitSuclassDemo
{
	public static void main(String[] args) 
	{
		Fish f = new Fish("С��", 5, "�ٻ�ɫ");
		f.show();
	}
}
