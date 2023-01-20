package creational.abstract_factory.weapon;

public class DiamondWeapon implements IWeapon{
	
	private String name = "Taflarius";
	private int atk = 20;

	@Override
	public String name() {
		return name;
	}

	@Override
	public int atk() {
		return atk;
	}
}
