package structural.decorator.forceUser;

public class Consular implements ForceUser{
	
	@Override
	public int forcePushPoints() {
		return 7;
		
	}

	@Override
	public String saberColor() {
		return "Green";
	}
	
	@Override
	public String toString() {
		return "SaberColor: " + saberColor() + "\n" +
				"forcePushPoints: " + forcePushPoints();
	}
}
