package proxy.staticProxy;

public class ProxyStar implements Star{
	//代理类持有真实类的对象引用
	private Star realstar;
	
	public ProxyStar(Star realstar) {
		this.realstar = realstar;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
	}

	@Override
	public void sing() {
		realstar.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}
	
}
