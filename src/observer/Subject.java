package observer;
/**
 * 主题接口
 * @author gqy2012
 *
 */
interface Subject{
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}

