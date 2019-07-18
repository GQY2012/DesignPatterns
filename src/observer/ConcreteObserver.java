package observer;

public class ConcreteObserver implements Observer{

	private int mystate;//需要与目标对象保持一致
	@Override
	public void update(Subject subject) {
		mystate = ((ConcreteSubject) subject).getState();
	}
	public int getMystate() {
		return mystate;
	}
	public void setMystate(int mystate) {
		this.mystate = mystate;
	}

}
