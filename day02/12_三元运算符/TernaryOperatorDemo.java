//��Ԫ�����
public class TernaryOperatorDemo 
{
	public static void main(String[] args) 
	{
		//�ж���ż��
		int i = 33;
		String re = i % 2 ==0 ? "ż��":"����";
		System.out.println("i��"+re);



		//����һҳ
		/*
		int currentPage = 23;
		int prePage = currentPage > 1 ? currentPage - 1 : 1;//�����ǰҳ���ǵ�һҳ�����һΪǰһҳ�������ǰҳ�ǵ�һҳ����ǰһҳ��Ϊ1
		System.out.println(prePage);

		*/
		

		//����һҳ
		int currentPage = 50;
		int totalPage = 50;
		int nextPage = currentPage < totalPage ? currentPage + 1 : currentPage;//�����ǰҳ�������һҳ�����һΪ��һҳ�������ǰҳ�����һҳ�����һҳ��Ϊ���һҳ
		System.out.println(nextPage);
	}
}
