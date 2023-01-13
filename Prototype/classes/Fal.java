package Prototype.classes;

public class Fal extends Gun{	
	public Fal(String nome) {
		this.setName(nome);
	}

	@Override
	public void sound() {
		System.out.println("POW");
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return new Fal(this.getName());
	}
}
		

