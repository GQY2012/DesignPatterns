package proxy.staticProxy;
/**
 * 静态代理
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) {
		Star real = new RealStar();
		ProxyStar proxy = new ProxyStar(real);
		
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();
		proxy.collectMoney();
	}

}
