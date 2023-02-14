
public class Goblin extends MagicalCreature {
	
	//Constructor
	public Goblin(String name, String type, String color,int age) {
		super(name, type, color, age);
	}
	
	//toString
	public String toString() {
		return super.toString()+" I kill elves if they do not have shields";
	}
	
	//Kill Condition
	public void kill(MagicalCreature other) {
		if(other.getType()== "Elf") {
			other.die();
		}else {
			super.kill(other);
		}
	}

}
