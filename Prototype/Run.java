package Prototype;

import Prototype.classes.Fal;
import Prototype.classes.Gun;

public class Run {
	public static void main(String[] args) {
		Gun gun1 = new Fal("fal");
		Gun gun2 = (Gun) gun1.clone();
		
		//different instance
		System.out.println(gun1 == gun2);
		
		System.out.println(gun1.getName());
		System.out.println(gun2.getName());		
	}
}
