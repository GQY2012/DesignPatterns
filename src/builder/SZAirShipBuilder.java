package builder;

public class SZAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine buildEngine() {
		System.out.println("s engine");
		return new Engine("s engine");
	}

	@Override
	public OrbitalModule buildOrbitalModule() {
		System.out.println("s orbital module");
		return new OrbitalModule("s orbital module");
	}

	@Override
	public EscapeTower buildEscapeTower() {
		System.out.println("s escapetower");
		return new EscapeTower("s escapetower");
	}

}
