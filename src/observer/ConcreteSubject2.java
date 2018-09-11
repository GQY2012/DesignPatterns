package observer;

import java.util.Observable;
/**
 * jdk自带的Observable
 * @author gqy2012
 *
 */
public class ConcreteSubject2 extends Observable{
	
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		
		setChanged();//表示目标对象做了更改
		notifyObservers(state);//通知所有观察者
	}
	
	

}
