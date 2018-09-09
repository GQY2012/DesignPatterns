package builder;

public class SZAirShipDirector implements AirShipDirector{

	private AirShipBuilder builder;
	
	public SZAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public AirShip directAirShip() {
		//构建
		Engine e = builder.buildEngine();
		OrbitalModule o = builder.buildOrbitalModule();
		EscapeTower et = builder.buildEscapeTower();
		//组装
		AirShip ship = new AirShip(o,e,et);
		return ship;
	}

}
