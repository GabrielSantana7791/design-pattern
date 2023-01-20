package creational.abstract_factory.armor;

public class DiamondArmor implements IArmor{
	private String name = "Gelaflarius";
	private int def = 15;
	
	@Override
	public String name() {
		return name;
	}

	@Override
	public int def() {
		return def;
	}
}
