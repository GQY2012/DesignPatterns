package factorymethod;

public class BydFatory implements CarFactory{

	@Override
	public Car createCar() {
		return new Byd();
	}

}
