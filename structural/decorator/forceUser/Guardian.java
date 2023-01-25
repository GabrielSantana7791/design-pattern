package structural.decorator.forceUser;

public class Guardian implements ForceUser{
	
	@Override
	public int forcePushPoints() {
		return 2;
		
	}

	@Override
	public String saberColor() {
		return "Blue";
	}
	
	@Override
	public String toString() {
		return "saberColor: " + saberColor() + "\n" +
				"forcePushPoints: " + forcePushPoints();
	}
}
