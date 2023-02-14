import java.util.Scanner;

public class Elf extends MagicalCreature {
	//Attributes
	private boolean shield;
	
	//Constructor
	public Elf(String name, String type, String color, int age) {
		super(name,type,color,age);
	}
	
	//Setters
	public void setShield(boolean shield) {
		this.shield = shield;
	}
	
	//toString
	public String toString() {
		if(shield == true) {
			return super.toString()+" I eat leaves, I have a shield";
		}else {
			return super.toString()+" I eat leaves, I have no shield";
		}
	}
	
	//If Getting attack
	public void die() {
		Scanner in = new Scanner(System.in);
		System.out.print("Type true to give the defending Elf a shield or false otherwise : ");
		boolean help = in.nextBoolean();
		if(help == true) {
			setShield(true);
		}else {
			setShield(false);
		}
		if(shield==true) {
			System.out.println("I escaped death with a shield");
		}else {
			super.die();
		}
	}
	
	
}
