package factorymethod;
/**
 * 工厂方法模式
 * 工厂单独实现工厂接口，每个产品单独一个工厂
 * 满足ocp，但复杂
 * @author gqy2012
 *
 */
public class Demo {

	public static void main(String[] args) {
		Car c1 = new AudiFactory().createCar();
		Car c2 = new BydFatory().createCar();
		
		c1.run();
		c2.run();
	}

}
