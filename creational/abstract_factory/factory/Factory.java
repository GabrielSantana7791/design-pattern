package creational.abstract_factory.factory;

import creational.abstract_factory.armor.IArmor;
import creational.abstract_factory.weapon.IWeapon;

public interface Factory {
	public IArmor createArmor();
	public IWeapon createWeapon();
}
