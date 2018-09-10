package chainOfResponsibility;
/**
 * 责任链模式chain of responsibility
 * 将能够处理同一类请求的对象连成一条链，请求沿着链传递
 * 链上的对象判断能否处理，不能处理则传给下一个对象
 * 
 * 公司里面，请假条的审批过程： 
 * • 如果请假天数小于3天，主任审批 
 * • 如果请假天数大于等于3天，小于10天，经理审批 
 * • 如果大于等于10天，小于30天，总经理审批 
 * • 如果大于等于30天，提示拒绝
 * 
 * 可替换大量的if-else语句
 * 应用场景：
 * 1.Java的异常处理机制catch
 * 2.Javascript事件的冒泡和捕获机制
 * 3.Servlet过滤器的链式处理
 * 4.Struts2的拦截器
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) {
		Leader a = new Director("gqy");
		Leader b = new Manager("gqy2");
		Leader c = new GeneralManager("gqy3");
		
		//此处可随时扩展新的处理类，形成新的责任链而不影响其他代码
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		LeaveRequest lr = new LeaveRequest("hh", 30, "sick");
		a.handleRequest(lr);
	}

}
