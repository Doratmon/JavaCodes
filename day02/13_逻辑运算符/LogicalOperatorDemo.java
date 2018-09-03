public class LogicalOperatorDemo 
{
	public static void main(String[] args) 
	{

		/*
			与 ：boolean ret = boolean表达式A 与 boolean表达式B
			当且仅当两个表达式都为true时结果才为true
			&  ：位与,如果A表达式为false，也会判断B表达式的值，再返回false
			&& ：短路与，如果A表达式为false，则不会判断B表达式的值，直接返回false

			短路与效率更高


			或：boolean ret = boolean表达式A 与 boolean表达式B
			当且仅当两个表达式都为false时结果才为false，其余情况为true
			|  ：位或,即使A表达式为true，也会判断B表达式的值，再返回true
			||  ：  短路或,如果A表达式为true，则不会判断B表达式的值，直接返回true
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
		//System.out.println(false & (1 / 0 == 1));//有错误，证明(1 / 0 == 1)执行了
		System.out.println(false && (1 / 0 == 1));//没有错误，证明(1 / 0 == 1)没有执行了
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
		//System.out.println(true | (1 / 0 == 1));//有错误，证明(1 / 0 == 1)执行了
		System.out.println(true || (1 / 0 == 1));//没有错误，证明(1 / 0 == 1)没有执行了

		//异或
		System.out.println("-----------------------------");
		System.out.println(true ^ true);
		System.out.println(false ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);

		//非，即为取反
		System.out.println(!true);
		System.out.println(!false );
		

	}
}
