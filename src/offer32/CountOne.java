package offer32;

/**
 * 题目：输入一个整数n，求从1到n这n个整数的十进制表示中1出现的次数。
 * @author 大闲人柴毛毛
 * @date 2016年3月22日
 */
public class CountOne {
	/**
	 * 分析：本题常规思路如下：
	 * 从1开始遍历这n个数，分别统计每个数中“1”出现的次数。
	 * 那么，问题就转化为“如何统计一个整数中1出现的次数？”
	 *
	 * 首先我们需要知道以下结论：
	 * 1.设整数为n，则n％10就能取到n的个位数；
	 * 2.n除以10后再取整其实就是把n的个位数砍掉。
	 * 基于上述结论，我们只要循环以下操作即可：
	 * 1.求整数n的余数；
	 * 2.判断余数是否为1，若为1则将计数器加1；
	 * 3.重复上述过程，直到n变成为0为止。
	 * 代码如下：
	 */
	
	/**
	 * 统计1-n中“1”出现的次数
	 * @param n
	 * @return 返回1出现的次数（若返回－1表示程序出错）
	 */
	public static int countOne(int n){
		//若n<1
		if(n<1){
			System.out.println("n<1！");
			return -1;
		}
		
		//创建计数器，用于统计1的个数
		int count = 0;
		
		//统计1-n中“1”出现的次数
		for(int i=1;i<=n;i++){
			//temp用于记录当前整数
			int temp = i;
			while(temp>0){
				//判断个位数是否为1
				if(temp%10==1)
					count++;
				//将temp的个位数砍掉
				temp /= 10;
			}
		}
		
		return count;
	}
	
	/**
	 * 上述方法需要对1-n分别进行扫描，而且对每个数还要进行m次扫描(m为数字的位数)，因此效率并不高。
	 * 网上有一些大神提出了一些更高效的方法，但过于巧妙，只能就题论题，缺乏推广的价值，因此这里不再介绍。
	 * 若有更高效且具有推广价值的方法，欢迎交流。
	 */
	
	
	/**
	 * 测试
	 */
	public static void main(String[] args){
		System.out.println(countOne(13));
	}
}
