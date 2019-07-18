package observer;
/**
 * 观察者模式
 * 
 * 主要用于实现广播机制
 * 目标对象Subject/Observable状态变化时
 * 及时告知一系列对象Observer
 * 
 * 应用场景:
 * 1.servlet的监听器
 * 2.Andriod的广播机制
 * 3.awt的事件处理模型
 * 4.聊天程序，服务器转发
 * 5.网络游戏，服务端分发客户端的状态
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteSubject cs = new ConcreteSubject();
		
		ConcreteObserver o1 = new ConcreteObserver();
		ConcreteObserver o2 = new ConcreteObserver();
		ConcreteObserver o3 = new ConcreteObserver();
		
		cs.registerObserver(o1);
		cs.registerObserver(o2);
		cs.registerObserver(o3);
		
		cs.setSubject(300);
		
		System.out.println(o1.getMystate());
		System.out.println(o2.getMystate());
		System.out.println(o3.getMystate());
		
		cs.setSubject(600);
		
		System.out.println(o1.getMystate());
		System.out.println(o2.getMystate());
		System.out.println(o3.getMystate());
	}

}
