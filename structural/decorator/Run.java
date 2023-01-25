package structural.decorator;

import structural.decorator.decorator.JediDecorator;
import structural.decorator.decorator.SithDecorator;
import structural.decorator.forceUser.Consular;
import structural.decorator.forceUser.ForceUser;
import structural.decorator.forceUser.Guardian;

public class Run {

	public static void main(String[] args) {
		ForceUser anakin = new Guardian();
		ForceUser jediKnightAnakin = new JediDecorator(anakin);
		SithDecorator darthVader = new SithDecorator(jediKnightAnakin);
		
		ForceUser quiGonJinn = new Consular();
		JediDecorator masterQuiGon = new JediDecorator(quiGonJinn);
		
		
		System.out.println(masterQuiGon.toString());
		masterQuiGon.forceHeal();
		
		System.out.println("___ \n");
		
		System.out.println(darthVader.toString());
		darthVader.forceChoking();
	}

}
