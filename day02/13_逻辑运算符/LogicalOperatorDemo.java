public class LogicalOperatorDemo 
{
	public static void main(String[] args) 
	{

		/*
			�� ��boolean ret = boolean���ʽA �� boolean���ʽB
			���ҽ����������ʽ��Ϊtrueʱ�����Ϊtrue
			&  ��λ��,���A���ʽΪfalse��Ҳ���ж�B���ʽ��ֵ���ٷ���false
			&& ����·�룬���A���ʽΪfalse���򲻻��ж�B���ʽ��ֵ��ֱ�ӷ���false

			��·��Ч�ʸ���


			��boolean ret = boolean���ʽA �� boolean���ʽB
			���ҽ����������ʽ��Ϊfalseʱ�����Ϊfalse���������Ϊtrue
			|  ��λ��,��ʹA���ʽΪtrue��Ҳ���ж�B���ʽ��ֵ���ٷ���true
			||  ��  ��·��,���A���ʽΪtrue���򲻻��ж�B���ʽ��ֵ��ֱ�ӷ���true
		*/
		System.out.println(true & true);
		System.out.println(false & true);
		System.out.println(true & false);
		System.out.println(false & false);
		System.out.println("-----------------------------");
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println("-----------------------------");
		//System.out.println(false & (1 / 0 == 1));//�д���֤��(1 / 0 == 1)ִ����
		System.out.println(false && (1 / 0 == 1));//û�д���֤��(1 / 0 == 1)û��ִ����
		System.out.println("-----------------------------");
		System.out.println(true | true);
		System.out.println(false | true);
		System.out.println(true | false);
		System.out.println(false | false);
		System.out.println("-----------------------------");
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println("-----------------------------");
		//System.out.println(true | (1 / 0 == 1));//�д���֤��(1 / 0 == 1)ִ����
		System.out.println(true || (1 / 0 == 1));//û�д���֤��(1 / 0 == 1)û��ִ����

		//���
		System.out.println("-----------------------------");
		System.out.println(true ^ true);
		System.out.println(false ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);

		//�ǣ���Ϊȡ��
		System.out.println(!true);
		System.out.println(!false );
		

	}
}
