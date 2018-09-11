package observer;

public class Client2 {

	public static void main(String[] args) {
		ConcreteSubject2 cs = new ConcreteSubject2();
		
		ConcreteObserver2 o1 = new ConcreteObserver2();
		ConcreteObserver2 o2 = new ConcreteObserver2();
		ConcreteObserver2 o3 = new ConcreteObserver2();
		
		cs.addObserver(o1);;
		cs.addObserver(o2);
		cs.addObserver(o3);
		
		cs.setState(300);
		
		System.out.println(o1.getMyState());
		System.out.println(o2.getMyState());
		System.out.println(o3.getMyState());
		
		cs.setState(3000);
		
		System.out.println(o1.getMyState());
		System.out.println(o2.getMyState());
		System.out.println(o3.getMyState());
	}

}
