package observer;

import java.util.ArrayList;
import java.util.List;

public class NewspaperOffice implements Subject{
	protected List<Observer> Observers = new ArrayList<>();
	int state;
	
	@Override
	public void registerObserver(Observer o) {
		Observers.add(o);		
	}

	@Override
	public void removeObserver(Observer o) {
		Observers.remove(o);		
	}

	@Override
	public void notifyObservers() {
		for(Observer o:Observers) {
			o.update(this);
		}		
	}
	
}
