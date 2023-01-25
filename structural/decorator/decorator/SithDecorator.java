package structural.decorator.decorator;

import structural.decorator.forceUser.ForceUser;

public class SithDecorator extends ForceUserDecorator{

	public SithDecorator(ForceUser forceUser) {
		super(forceUser);
		this.forceUser = forceUser;
	}

	@Override
	public int forcePushPoints() {
		// +3 because the force user is/was a sith
		return this.forceUser.forcePushPoints() + 3;
		
	}

	@Override
	public String saberColor() {
		// only sith have red saber
		return "Red";
	}
	
	public void forceChoking() {
		System.out.println("choking...");
	}
}
