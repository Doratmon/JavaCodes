//�ַ���
public class StringDemo 
{
	public static void main(String[] args) 
	{
		//String�ĳ���
		System.out.println("Hello World!");
		//String�ı���
		String name = "�";
		System.out.println("name =" +name);
		//���"Hello"
		System.out.println("\"Hello\"");

		name="����"+"jack";
		System.out.println("name =" +name);
		System.out.println("----------------------");
		System.out.println(7+8+"Hello World!");//���15Hello World!
		System.out.println("Hello World!"+7+8);//���Hello World!78
		System.out.println(7+"Hello World!"+8);//���7Hello World!8

		String str = 17+"abc";
		System.out.println(str);
		//str = (String)17+"abc";//������󣺲���ת��������

	}
}
