 package templatemethod;
/**
 * 模板方法模式template method
 * 
 * 定义一个算法骨架，将某些步骤延迟到子类实现
 * 这样可以在不改变算法结构的前提下重新定义该算法的某些步骤
 * 
 * 父类控制所有的步骤
 * 
 * 应用场景：
 * 1.数据库访问的封装
 * 2.Junit单元测试
 * 3.Servlet的doGet，doPost
 * 
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) {
		BankTemplateMethod btm = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("取款");
			}
		};
		
		btm.process();
	}

}

