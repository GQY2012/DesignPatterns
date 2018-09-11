package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	protected List<Observer> list = new ArrayList<>();
	
	public void register(Observer observer) {
		list.add(observer);
	}
	
	public void remove(Observer observer) {
		list.remove(observer);
	}
	
	public void notifyAllObserver() {
		for(Observer o:list) {
			o.update(this);
		}
	}
}
