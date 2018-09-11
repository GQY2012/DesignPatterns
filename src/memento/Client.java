package memento;
/**
 * 备忘录模式
 * 
 * 保存某个对象内部状态的拷贝
 * 
 * 源发器类Originator 
 * 备忘录类Memento 
 * 负责人类CareTaker
 * 
 * 应用场景:
 * 1.事务的回滚
 * 2.撤销操作
 * 3.历史纪录
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) {
		CareTaker ct = new CareTaker();
		
		Emp emp = new Emp("gqy", 20, 1000);
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		
		ct.setMmt(emp.memento());
		
		emp.setName("gqy2");
		emp.setAge(30);
		emp.setSalary(100);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		
		emp.recovery(ct.getMmt());
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		
	}

}
