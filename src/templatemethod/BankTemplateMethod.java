package templatemethod;

public abstract class BankTemplateMethod {
	//具体方法 
	public void takeNumber(){ 
		System.out.println("取号排队"); 
	}
	
	public abstract void transact(); //办理具体的业务 
	
	
	public void evaluate(){ 
		System.out.println("反馈评分"); 
	}
	
	
	public final void process(){ //模板方法：将基本操作组合在一起，子类一般不能重写
		this.takeNumber();
		this.transact();//钩子方法(方法回调)
		this.evaluate();
	}
}
