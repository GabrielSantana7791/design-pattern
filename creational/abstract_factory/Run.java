package creational.abstract_factory;

import creational.abstract_factory.factory.DiamondFactory;
import creational.abstract_factory.factory.Factory;
import creational.abstract_factory.factory.GoldFactory;

public class Run {

	public static void main(String[] args) {
		Factory diamondFactory = new DiamondFactory();
		Pack diamondPack = new Pack(diamondFactory);
		
		Factory goldFactory = new GoldFactory();
		Pack goldPack = new Pack(goldFactory);
		
		diamondPack.showEquip();
		System.out.println("___________ \n");
		goldPack.showEquip();
	}
}
