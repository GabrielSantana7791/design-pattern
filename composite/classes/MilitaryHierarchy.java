package composite.classes;

import java.util.ArrayList;

public interface MilitaryHierarchy {
	public String getName();
	public int getUnitsAmount();
	public ArrayList<MilitaryHierarchy> getLeaves();
	public void addLeaf(MilitaryHierarchy militaryHierarchy);
}
