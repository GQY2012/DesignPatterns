package memento;
/**
 * 负责人类
 * 负责管理备忘录对象
 * 可通过压栈管理更多的对象
 * @author gqy2012
 *
 */
public class CareTaker {
	
	private EmpMemento mmt;

	public EmpMemento getMmt() {
		return mmt;
	}

	public void setMmt(EmpMemento mmt) {
		this.mmt = mmt;
	}

	
	
}
