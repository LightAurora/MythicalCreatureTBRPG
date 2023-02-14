import java.util.Scanner;

public class Genie extends MagicalCreature {
	//Attributes
	private boolean wand;
	
	//Constructor
	public Genie(String name, String type, String color, int age) {
		super(name,type,color,age);
	}
	
	//Getters
	public boolean getWand() {
		return wand;
	}
	
	//Setters
	public void setWand(boolean wand) {
		this.wand = wand;
	}
	
	//Compares to other creature to determine death
	public void kill(MagicalCreature other) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type true to give the attacking Genie a wand or false otherwise : ");
		boolean help = scan.nextBoolean();
		if(help == true) {
			setWand(true);
		}else {
			setWand(false);
		}
		if(wand == true ) {
			if(getName() != other.getName())
			other.die();
		}else if(wand == false) {
			System.out.println("I cannot kill without my wand !");
		}else if(getName() == other.getName()) {
			System.out.println("I do not want to kill myself");
		}
	}
	
	//toString
	public String toString() {
		if(wand == true) {
			return super.toString()+" I eat leaves, I have a wand";
		}else {
			return super.toString()+" I eat leaves, I have no wand";
		}
	}

}
