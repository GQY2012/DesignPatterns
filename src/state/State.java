package state;

public interface State {
	void handle();
}

class FreeState implements State{

	@Override
	public void handle() {
		System.out.println("FreeState.handle()");
	}
}

class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("BookedState.handle()");
	}
	
}

class CheckedInState implements State{

	@Override
	public void handle() {
		System.out.println("CheckedInState.handle()");
	}

}