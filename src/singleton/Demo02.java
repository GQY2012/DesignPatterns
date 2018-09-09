package singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试各实现方式的效率
 * @author gqy2012
 *
 */
public class Demo02 {
	public static void main(String[] args) throws InterruptedException {
		
		long start = System.currentTimeMillis();
		
		final int threadNum = 10;
		CountDownLatch count = new CountDownLatch(threadNum);
		
		for(int i = 0;i < 10;i++) {
			new Thread(()-> {
				for(int j = 0;j<100000;j++) {
					Object o = A.getInstance();
				}
				
				count.countDown();//每有线程执行到此，计数器减一
			}).start();
		}
		
		
		count.await();//阻塞main线程，直到计数器为0
		
		long end = System.currentTimeMillis();
		System.out.println("耗时"+(end-start));
	}
}
