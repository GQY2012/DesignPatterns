package simplefactory;

import factorymethod.Audi;
import factorymethod.Byd;
import factorymethod.Car;
/**
 * 工厂模式应用场景
 * 1.Calendar的getInstance方法
 * 2.JDBC的Connection对象获取
 * 3.Hibernate中SessionFactory创建Session
 * @author gqy2012
 *
 */
public class SimpleFactoryDemo01 {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		Car c1 = factory.createCar("Audi");
		Car c2 = factory.createCar("Byd");
		
		c1.run();
		c2.run();
	}

}
/**
 * 没有工厂模式
 * @author gqy2012
 *
 */
class NoFactory {
	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();
		
		c1.run();
		c2.run();
	}
	
}