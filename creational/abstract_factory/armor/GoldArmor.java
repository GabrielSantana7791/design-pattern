package creational.abstract_factory.armor;

public class GoldArmor implements IArmor{
	private String name = "Flavius";
	private int def = 10;
	
	@Override
	public String name() {
		return name;
	}

	@Override
	public int def() {
		return def;
	}
}
