package bridge;
/**
 * 桥接模式
 * 用于处理多层继承结构(由于java没有多继承)，将各维度分别设计为独立的继承结构
 * 应用场景：
 * 1.JDBC驱动程序
 * 2.AWT的Peer架构
 * 3.银行日志管理
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) {
		//Lenovo laptop sale
		Computer c = new Laptop(new Lenovo());
		c.sale();
				
	}

}
