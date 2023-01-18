package composite.classes;

import java.util.ArrayList;

public class Unit implements MilitaryHierarchy{
	private String name;
	
	public Unit(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getUnitsAmount() {
		return 1;
	}

	@Override
	public ArrayList<MilitaryHierarchy> getLeaves() {
		return null;
	}

	@Override
	public void addLeaf(MilitaryHierarchy militaryHierarchy) {}
	
}
