package creational.abstract_factory.weapon;

public class GoldWeapon implements IWeapon{
	
	private String name = "Stravius";
	private int atk = 5;

	@Override
	public String name() {
		return name;
	}

	@Override
	public int atk() {
		return atk;
	}
}
