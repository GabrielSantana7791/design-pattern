package creational.abstract_factory;

import creational.abstract_factory.armor.IArmor;
import creational.abstract_factory.factory.Factory;
import creational.abstract_factory.weapon.IWeapon;

public class Pack {
	private IWeapon weapon;
	private IArmor armor;
	
	public Pack(Factory factory) {
		this.weapon = factory.createWeapon();
		this.armor = factory.createArmor();
	}
	
	public void showEquip() {
		System.out.println(weapon.getClass().getSimpleName() + ": " + weapon.name() + "; atk: " + weapon.atk());
		System.out.println(armor.getClass().getSimpleName() + ": " + armor.name() + "; def: " + armor.def());
	}
	
	public IArmor armor() {
		return armor;
	}
	
	public IWeapon weapon() {
		return weapon;
	}
}
