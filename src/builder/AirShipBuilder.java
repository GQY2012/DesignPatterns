package builder;
/**
 * 构建者
 * @author gqy2012
 *
 */
public interface AirShipBuilder {
	/**
	 * 单组组件的构造
	 */
	Engine buildEngine();
	OrbitalModule buildOrbitalModule();
	EscapeTower buildEscapeTower();
}
