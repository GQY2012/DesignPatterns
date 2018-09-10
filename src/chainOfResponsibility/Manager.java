package chainOfResponsibility;

public class Manager extends Leader{
	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<10 && request.getLeaveDays()>3) {
			System.out.println("Manager.handleRequest()"+request.getLeaveDays());
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(request);
			}
		}
	}
}
