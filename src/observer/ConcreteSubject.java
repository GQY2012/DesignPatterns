package observer;

public class ConcreteSubject extends NewspaperOffice{

	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setSubject(int state) {
		this.state = state;
		//state变化，通知Observer更新
		this.notifyObservers();
	}
}
