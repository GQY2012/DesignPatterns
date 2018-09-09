package bridge;
/**
 * 品牌维类型度
 * @author gqy2012
 *
 */
public interface Brand {
	void sale();
}

class Lenovo implements Brand{

	@Override
	public void sale() {
		System.out.println("Lenovo.sale()");
	}
	
}

class Dell implements Brand{

	@Override
	public void sale() {
		System.out.println("Dell.sale()");
	}
	
}