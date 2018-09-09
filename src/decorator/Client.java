package decorator;
/**
 * 装饰器模式Decorator(包装模式Wrapper)
 * 使用对象关联来代替继承，为类添加新的功能
 * 可以降低系统耦合度，比继承灵活
 * 但产生了很多小对象，影响性能，且容易出错
 * 
 * 应用场景：
 * 1.io流 包装流
 * 2.Swing包图形界面构建
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		
		System.out.println("add fly");
		FlyCar flycar = new FlyCar(car);
		flycar.move();
		
		System.out.println("add swim");
		WaterCar waterCar = new WaterCar(car);
		waterCar.move();
		
		System.out.println("add swim and fly");
		
		FlyCar FlyWaterCar = new FlyCar(new WaterCar(new Car()));
		FlyWaterCar.move();
	}

}
