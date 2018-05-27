//三元运算符
public class TernaryOperatorDemo 
{
	public static void main(String[] args) 
	{
		//判断奇偶数
		int i = 33;
		String re = i % 2 ==0 ? "偶数":"奇数";
		System.out.println("i是"+re);



		//求上一页
		/*
		int currentPage = 23;
		int prePage = currentPage > 1 ? currentPage - 1 : 1;//如果当前页不是第一页，则减一为前一页，如果当前页是第一页，则前一页仍为1
		System.out.println(prePage);

		*/
		

		//求下一页
		int currentPage = 50;
		int totalPage = 50;
		int nextPage = currentPage < totalPage ? currentPage + 1 : currentPage;//如果当前页不是最后一页，则加一为后一页，如果当前页是最后一页，则后一页仍为最后一页
		System.out.println(nextPage);
	}
}
