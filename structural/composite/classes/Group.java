package structural.composite.classes;

import java.util.ArrayList;

public class Group implements MilitaryHierarchy{
	private int amount;
	private String name;
	private ArrayList<MilitaryHierarchy>leaves = new ArrayList<>();

	public Group(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		String name = this.name;
		
		
		for (MilitaryHierarchy militaryHierarchy : leaves) {
			name += "\n" + militaryHierarchy.getName();
		}
		
		return name + "\n";
	}

	@Override
	public ArrayList<MilitaryHierarchy> getLeaves() {
		return leaves;
	}

	@Override
	public void addLeaf(MilitaryHierarchy militaryHierarchy) {
		leaves.add(militaryHierarchy);		
	}

	@Override
	
	public int getUnitsAmount() {
		amount = 0;
		
		for (MilitaryHierarchy militaryHierarchy : leaves) {
			amount += militaryHierarchy.getUnitsAmount();
		}
		
		return amount;
	}
}
