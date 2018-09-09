package composite;
/**
 * 组合模式
 * **注意不是组合**
 * 适合处理树形结构
 * 
 * 应用场景：
 * 1.操作系统资源管理器
 * 2.GUI的容器图
 * 3.XML文件的解析
 * 4.Junit单元测试框架
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) {
		Folder f1 = new Folder("folder1");
		AbstractFile f2,f3,f4;
		f2 = new ImageFile("1.jpg");
		f3 = new VideoFile("1.avi");
		f4 = new VideoFile("4.avi");
		
		Folder f11 = new Folder("folder11");
		f11.add(f4);
		
		f1.add(f2);
		f1.add(f3);
		f1.add(f11);
		
		f1.killVirus();
	}

}
