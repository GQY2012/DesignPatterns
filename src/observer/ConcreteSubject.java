package observer;

public class ConcreteSubject extends Subject{

	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setSubject(int state) {
		this.state = state;
		
		this.notifyAllObserver();
	}
}
