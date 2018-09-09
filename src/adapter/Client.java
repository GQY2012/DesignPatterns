package adapter;
/**
 * 客户端类
 * 
 * 适配器模式一般步骤：
 * 定义客户需要的接口(target)，
 * 创建适配器类并实现接口，
 * 并继承或组合被适配类，
 * 调用客户需要的方法
 * 
 * 适配器模式应用场景
 * java io流中的字节流转化为字符流
 */
public class Client {
	public void test1(Target t) {
		t.handleReq();
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		
		Adaptee a = new Adaptee();
		
		Target t = new Adapter();
		
		c.test1(t);
		 
		t = new Adapter2(a);
		
		c.test1(t);
	}
}
