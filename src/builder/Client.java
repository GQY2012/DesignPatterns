package builder;
/**
 * 建造者模式:
 * 分离子组件的单独构造(Builder)与装配(Director)
 * 
 * 应用场景：
 * 1.StringBuilder的append方法
 * 2.SQL的PreparedStatement
 * @author gqy2012
 *
 */
public class Client {

	public static void main(String[] args) {
		AirShipDirector director = 
				new SZAirShipDirector(new SZAirShipBuilder());
	
		AirShip szship = director.directAirShip();
		
		System.out.println(szship.getEscapeTower().getName());
	}

}
