package singleton;

import java.lang.reflect.Constructor;

/**
 * 单例模式：保证一个类只有一个实例，并提供一个访问该实例的全局访问点
 * 常用应用场景：任务管理器，回收站，读配置文件的类，网站计数器。数据库连接池，Servlet类
 * 优点：减少系统开销
 * 实现方式：懒汉式，饿汉式
 * @author gqy2012
 *
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		test1();
	}
	
	private static void test1() throws Exception{
		A a1 = A.getInstance();
		A a2 = A.getInstance();
		System.out.println(a1==a2);
		
		//使用反射破解单例模式
		Class<A> clazz = (Class<A>) Class.forName("singleton.A");
		Constructor<A> c = clazz.getDeclaredConstructor();
		c.setAccessible(true);
		
		A a3 = c.newInstance();
		A a4 = c.newInstance();
		
		System.out.println(a3==a4);
	}
	
	
}
/**
 * 饿汉式
 * 优点：线程天然安全，调用效率高
 * 缺点：没有延时加载，资源利用率低
 * @author gqy2012
 *
 */
class A{
	//静态引用
	private static A instance = new A();
	//私有化构造器
	private A() {
		//可以通过添加判断防止反射破解单例模式
		/*if(instance != null)
			try {
				throw new Exception("只能创建一个对象");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}*/
	}
	//返回对象的方法
	public static A getInstance() {
		return instance;
	}
	//可定义readResolve方法防止反序列化破解单例模式
	/*private Object readResove() {
		return instance;
	}*/
}
/**
 * 懒汉式
 * 优点：可以延时加载
 * 缺点：需要同步，调用效率低
 * @author gqy2012
 *
 */
class B{
	//静态引用
	private static B instance;
	//私有化构造器
	private B() {
		
	}
	//必须加同步，否则多线程可能会创建多个对象
	public synchronized static B getInstance() {
		if(instance == null) {
			instance = new B();
		}
		return instance;
	}
}
/**
 * 静态内部类实现方式(推荐)
 * 优点：线程天然安全，延迟加载
 * @author gqy2012
 *
 */
class C{
	private static class SingletonInstance{
		private static C instance = new C();
	}
	
	private C() {
		
	}
	
	public static C getInstance() {
		return SingletonInstance.instance;
	}
}
/**
 * 枚举式
 * 优点：可以防止反射与反序列化，线程安全
 * 缺点：不能延迟加载
 * @author gqy2012
 *
 */
enum D{
	//枚举元素本身就是单例的，基于JVM底层实现
	INSTANCE;
	
}

/**
 * 双重检测锁
 *
 */

class E{
	
	private E() {
		
	}
	//volatile防止指令重排序
	private volatile static E instance;
	
	public static E getInstance() {
		//在synchronized外作一次非空检测，提升效率
		if(instance == null) {
			synchronized(E.class) {
				if(instance == null) {
					instance = new E();
				}
			}
		}
		return instance;
	}
}
