package state;
/**
 * 状态模式state
 * 
 * 酒店系统中，房间的状态变化： 
 * • 已预订 
 * • 已入住 
 * • 空闲
 * 
 * 不同状态之间切换
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) {
		Context ctx = new Context();
		
		ctx.setState(new FreeState());
	}

}
