package iterator;
/**
 * 迭代器模式iterator(游标模式cursor)
 * 提供一种可以遍历聚合对象的方式
 * 
 * 聚合对象
 * 迭代器(通常作为内部类)
 * 
 * 应用场景
 * List和Set容器的迭代器
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		cma.addObject("aa");
		cma.addObject("bb");
		cma.addObject("cc");
		
		MyIterator iter = cma.createIterator();
		while(iter.hasNext()) {
			System.out.println(iter.getCurrentObj());
			iter.next();
		}
	}

}
