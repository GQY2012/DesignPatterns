package abstractfactory;

public interface Tyre {
	void revolve();
}

class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("磨损少");
	}
	
}

class LowTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("磨损多");
	}
	
}