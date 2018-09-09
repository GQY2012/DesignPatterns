package adapter;
/**
 * 适配器(对象适配器方式)
 * 使用组合
 * @author gqy2012
 *
 */
public class Adapter2 implements Target{

	private Adaptee a;
	@Override
	public void handleReq() {
		a.request();
	}
	public Adapter2(Adaptee a) {
		this.a = a;
	}

}
