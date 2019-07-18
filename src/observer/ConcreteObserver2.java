package observer;

import java.util.Observable;
import java.util.Observer;
/**
 * jdk自带的Observer
 * @author gqy2012
 *
 */
public class ConcreteObserver2 implements Observer{

	private int myState;
	@Override
	public void update(Observable o, Object arg) {
		//myState = ((ConcreteSubject2) o).getState();
		myState = (int) arg;
	}
	public int getMyState() {
		return myState;
	}
	public void setMyState(int myState) {
		this.myState = myState;
	}

	
}
