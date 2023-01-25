package structural.decorator.decorator;

import structural.decorator.forceUser.ForceUser;

public abstract class ForceUserDecorator implements ForceUser{
	protected ForceUser forceUser;
	
	public ForceUserDecorator(ForceUser forceUser) {
		this.forceUser = forceUser;
	}
	
	@Override
	public String toString() {
		return "saberColor: " + saberColor() + "\n" +
				"forcePushPoints: " + forcePushPoints();
	}
}
