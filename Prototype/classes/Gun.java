package Prototype.classes;

public abstract class Gun implements Cloneable{
	private String name;
	
	public abstract Object clone();
	public abstract void sound();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
