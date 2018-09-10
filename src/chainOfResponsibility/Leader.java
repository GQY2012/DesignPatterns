package chainOfResponsibility;

public abstract class Leader {
	private String name;
	protected Leader nextLeader;
	public Leader(String name) {
		this.name = name;
	}
	//设定链上的后继对象
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	public abstract void handleRequest(LeaveRequest request);
}
