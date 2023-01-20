package creational.abstract_factory.factory;

import creational.abstract_factory.armor.DiamondArmor;
import creational.abstract_factory.armor.IArmor;
import creational.abstract_factory.weapon.DiamondWeapon;
import creational.abstract_factory.weapon.IWeapon;

public class DiamondFactory implements Factory{

	@Override
	public IWeapon createWeapon() {
		return new DiamondWeapon();
	}

	@Override
	public IArmor createArmor() {
		return new DiamondArmor();
	}
}
