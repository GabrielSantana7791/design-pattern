package structural.decorator.decorator;

import structural.decorator.forceUser.ForceUser;

public class JediDecorator extends ForceUserDecorator{

	public JediDecorator(ForceUser forceUser) {
		super(forceUser);
		this.forceUser = forceUser;
	}

	@Override
	public int forcePushPoints() {
		// +2 because the force user is/was a Jedi
		return this.forceUser.forcePushPoints() + 2;
	}

	@Override
	public String saberColor() {
		// only sith have red saber
		return this.forceUser.saberColor();
	}
	
	public void forceHeal() {
		System.out.println("Healing...");
	}
}
