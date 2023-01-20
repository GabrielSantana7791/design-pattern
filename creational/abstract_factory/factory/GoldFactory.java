package creational.abstract_factory.factory;

import creational.abstract_factory.armor.GoldArmor;
import creational.abstract_factory.armor.IArmor;
import creational.abstract_factory.weapon.GoldWeapon;
import creational.abstract_factory.weapon.IWeapon;

public class GoldFactory implements Factory{

	@Override
	public IWeapon createWeapon() {
		return new GoldWeapon();
	}

	@Override
	public IArmor createArmor() {
		return new GoldArmor();
	}
}
