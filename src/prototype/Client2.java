package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 使用序列化与反序列化实现深克隆
 * @author gqy2012
 *
 */
public class Client2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Date d = new Date(342525245345L);
		
		Sheep s1 = new Sheep("sheep1",d);
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());
		
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(s1);
		
		byte[] b = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Sheep s2 = (Sheep) ois.readObject();
		System.out.println(s2);
		System.out.println(s2.getName());
		System.out.println(s2.getBirthday());
		
		d.setTime(99982323423L);
		System.out.println(s1.getBirthday());
		System.out.println(s2.getBirthday());
	}

}
