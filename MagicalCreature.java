
public class MagicalCreature {
	//Attributes
	private String name;
	private String type;
	private String color;
	private int age;
	private boolean alive =true;
	
	//Constructor
	public MagicalCreature(String name, String type, String color,int age) {
		this.name = name;
		this.type = type;
		this.color = color;
		this.age = age;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getColor() {
		return color;
	}
	public int getAge() {
		return age;
	}
	public boolean getAlive() {
		return alive;	
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	//Print Statement
	public void kill(MagicalCreature other) {
		System.out.println("I do not have the license to kill");
	}
	
	//Sets alive to false
	public void die() {
		alive = false;
		System.out.println(getName()+" has been slained");
		
	}
	
	//toString
	public String toString() {
		return "My name is " + name +" I am a "+color+" " +type+" I am "+age +" years old ";
	}
}
