package composite;

import composite.classes.Group;
import composite.classes.Unit;

public class Run {

	public static void main(String[] args) {
		Unit cb1 = new Unit("CB Lozo");
		Unit soldier1 = new Unit("SD Gabriel");
		Unit soldier2 = new Unit("SD Pedro");
		Group squad1 = new Group("Squad Alpha");
		squad1.addLeaf(cb1);
		squad1.addLeaf(soldier1);
		squad1.addLeaf(soldier2);
		
		Unit sub1 = new Unit("Sub Marino");
		Unit soldier3 = new Unit("SD Nazer");
		Unit soldier4 = new Unit("SD Greg");
		Group squad2 = new Group("Squad Bravo");
				
		squad2.addLeaf(sub1);
		squad2.addLeaf(soldier3);
		squad2.addLeaf(soldier4);
		
		Group gac14 = new Group("14° GAC");
		gac14.addLeaf(squad1);
		gac14.addLeaf(squad2);
		
		System.out.println("Units: " + gac14.getUnitsAmount());
		System.out.println(gac14.getName());
	}
}
