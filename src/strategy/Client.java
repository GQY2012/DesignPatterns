package strategy;
/**
 * 策略模式
 * @author gqy2012
 *
 *某个市场人员接到单后的报价策略(CRM系统中常见问题)。
 *报价策略 很复杂，可以简单作如下分类： 
 *普通客户小批量报价 
 *普通客户大批量报价 
 *老客户小批量报价 
 *老客户大批量报价
 *
 *分离算法，选择实现：
 *将解决这个问题的算法簇实现为实现统一接口的算法类簇
 *方便更换算法
 *
 *应用场景：
 *1.Java GUI的不同布局
 *2.Spring框架的Resource接口
 *3.javax.servlet.http.HttpServlet#service()
 */
public class Client {

	public static void main(String[] args) {
		
	}

}
