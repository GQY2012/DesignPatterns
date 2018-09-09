package proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 主要通过Proxy.newProxyInstance方法能动态创建代理类
 * 通过创建实现InvocationHandler接口的handler类统一处理了代理类方法调用
 * 
 * 应用场景：
 * 1.struts2拦截器的实现
 * 2.Spring AOP
 * 3.Hibernate延时加载
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) {
		Star realStar = new RealStar();
		StarHandler handler = new StarHandler(realStar);
		/**
		 * newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
		 * 
		 * loader:一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
		 * interfaces:一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口
		 * ，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
		 * h:一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候
		 * ，会关联到哪一个InvocationHandler对象上
		 * 
		 * 该方法的主要工作
		 * 1. 根据类加载器和接口创建代理类
		 * 2. 获得代理类的带参数的构造函数
		 * 3. 创建代理对象，并制定调用处理器实例为参数传入
		 */
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader()
				, realStar.getClass().getInterfaces(),handler);
		//代理类
		proxy.bookTicket();
		proxy.sing();
	}

}
