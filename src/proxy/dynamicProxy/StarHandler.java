package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 处理器类
 * 所有对代理类方法的调用都在这个类的invoke函数处理
 * @author gqy2012
 *
 */
public class StarHandler implements InvocationHandler{

	private Star realStar;
	//invoke(Object proxy, Method method, Object[] args)
	//proxy:　　代理类
	//method:　 我们所要调用方法的Method对象
	//args:　　  方法时接受的参数
	//当代理对象调用方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法(既下面的方法)来进行调用	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
	//在代理真实对象前我们可以添加一些自己的操作
    System.out.println("before");		//AOP的切面
        
    //System.out.println("Method:" + method);	
    
    if(method.getName().equals("bookTicket"))
    	System.out.println("订票");
    	
    //在需要调用方法为真实对象方法时，通过传入真实对象来调用真实方法
    if(method.getName().equals("sing"))
    	method.invoke(realStar, args);
	
	//在代理真实对象后我们也可以添加一些自己的操作
    System.out.println("after");		//AOP的切面
		
		return null;
	}
	public StarHandler(Star realStar) {
		this.realStar = realStar;
	}
	

}
