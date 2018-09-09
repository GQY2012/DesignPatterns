package bridge;
/**
 * 电脑类型唯维度
 * @author gqy2012
 *
 */
public abstract class Computer {
	//持有品牌维度的引用
	protected Brand brand;
	
	public Computer(Brand brand) {
		this.brand = brand;
	}
	
	public void sale() {
		brand.sale();
	}
}

class Desktop extends Computer{
	public Desktop(Brand b) {
		super(b);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("Desktop.sale()");
	}
}

class Laptop extends Computer{
	public Laptop(Brand b) {
		super(b);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("Laptop.sale()");
	}
}
