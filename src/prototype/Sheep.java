package prototype;

import java.io.Serializable;
import java.util.Date;
/**
 * 原型模式
 * 实现Cloneable接口和clone方法(注意clone方法属于Object)
 * @author gqy2012
 *
 */
public class Sheep implements Cloneable{
	private String name;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		
		//深克隆,需要手动克隆所有的属性
		/*Sheep s = (Sheep) obj;
		s.birthday = (Date) this.birthday.clone();*/
		
		return obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Sheep(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public Sheep() {
	}
	
}


