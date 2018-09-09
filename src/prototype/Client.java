package prototype;

import java.util.Date;

/**
 * 克隆
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date d = new Date(342525245345L);
		
		
		//浅克隆
		Sheep s1 = new Sheep("sheep1",d);
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());

		Sheep s2 = (Sheep) s1.clone();
		System.out.println(s2);
		System.out.println(s2.getName());
		System.out.println(s2.getBirthday());
		
		d.setTime(3425363563L);//s1,s2指向同一个Date对象
		System.out.println(s1.getBirthday());
		System.out.println(s2.getBirthday());
		
		
		//深克隆
		Sheep2 s3 = new Sheep2("sheep2",d);
		System.out.println(s3);
		System.out.println(s3.getName());
		System.out.println(s3.getBirthday());

		Sheep2 s4 = (Sheep2) s3.clone();
		System.out.println(s4);
		System.out.println(s4.getName());
		System.out.println(s4.getBirthday());
		
		d.setTime(94564223563L);
		System.out.println(s3.getBirthday());
		System.out.println(s4.getBirthday());
	}

}
