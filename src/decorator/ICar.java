package decorator;
//抽象构建角色
public interface ICar {
	void move();
}
//具体构建角色(真实对象)
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("move()");
	}
	
}
//装饰角色Decorator
class SuperCar implements ICar{

	protected ICar car;
	
	public SuperCar(ICar car) {
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}
	
}
//具体装饰角色ConcreteDecorator
class FlyCar extends SuperCar{
	
	
	public FlyCar(ICar car) {
		super(car);
	}

	@Override
	public void move() {
		super.move();
		fly();
	}
	
	public void fly() {
		System.out.println("fly()");
	}
	
}
//具体装饰角色ConcreteDecorator
class WaterCar extends SuperCar{
	
	
	public WaterCar(ICar car) {
		super(car);
	}

	@Override
	public void move() {
		super.move();
		swim();
	}
	
	public void swim() {
		System.out.println("swim()");
	}
	
}
//具体装饰角色ConcreteDecorator
class AICar extends SuperCar{
	
	
	public AICar(ICar car) {
		super(car);
	}

	@Override
	public void move() {
		super.move();
		autoMove();
	}
	
	public void autoMove() {
		System.out.println("autoMove()");
	}
	
}