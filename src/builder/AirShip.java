package builder;

public class AirShip {
	private OrbitalModule orbitalModule;
	private Engine engine;
	private EscapeTower escapeTower;
	
	public AirShip(OrbitalModule orbitalModule, Engine engine, EscapeTower escapeTower) {
		this.orbitalModule = orbitalModule;
		this.engine = engine;
		this.escapeTower = escapeTower;
	}
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public EscapeTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	
}

class OrbitalModule{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OrbitalModule(String name) {
		this.name = name;
	}
}

class Engine{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine(String name) {
		this.name = name;
	}
}

class EscapeTower{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EscapeTower(String name) {
		this.name = name;
	}
}