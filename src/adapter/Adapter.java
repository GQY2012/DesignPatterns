package adapter;
/**
 * 适配器(类适配器方式)
 * 通过继承实现,由于只有单继承所以不够灵活
 * @author gqy2012
 *
 */
public class Adapter extends Adaptee implements Target{

	
	@Override
	public void handleReq() {
		super.request();
	}
	
}
