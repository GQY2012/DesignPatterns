package chainOfResponsibility;

public class GeneralManager extends Leader{
	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()>10 && request.getLeaveDays()<30) {
			System.out.println("GeneralManager.handleRequest()"+request.getLeaveDays());
		}else {
			System.out.println("denied");
		}
	}
}
