/*final���η����ڽ��Java�м̳��ƻ���װ�����
    ��Ϊ:1. final�� 
			 2. final���� 
			 3.final������ֻ��final�������α�����final���εı���Ϊ�������������򣺴�д+_�ָ�*/
//������������final����
class SuperClass
{
	public final void doWork(){}
}
class SubClass extends SuperClass//�޷�������SuperClass���м̳�
{
	//public void doWork(){}//SubClass�е�doWork()�޷�����SuperClass�е�doWork()
}
class FinalDemo 
{
	static final  String DOG_NAME = "tim" ;
	public static void main(String[] args) 
	{
		System.out.println(DOG_NAME);
	}
}
