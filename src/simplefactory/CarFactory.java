package simplefactory;

import factorymethod.Audi;
import factorymethod.Byd;
import factorymethod.Car;

/**
 * 简单工厂模式，也叫静态工厂模式
 * 缺点：增加新产品只能修改代码，违反了ocp原则(开闭原则)
 * @author gqy2012
 *
 */
public class CarFactory {
	public Car createCar(String type) {
		if("Audi".equals(type)) {
			return new Audi();
		}else if("Byd".equals(type)) {
			return new Byd();
		}else {
			return null;
		}
	}
}
/**
 * 简单工厂模式的另一种实现
 * @author gqy2012
 *
 */
class CarFactory2{
	public static Car createAudi() {
		return new Audi();
	}
	public static Car createByd() {
		return new Byd();
	}
}
