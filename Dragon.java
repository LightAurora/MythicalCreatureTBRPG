
public class Dragon extends MagicalCreature{
	
	//Constructor
	public Dragon(String name, String type, String color, int age) {
		super(name,type,color,age);
	}
	
	//toString
	public String toString() {
		return super.toString()+" I breath fire";
	}
	
	//Compares other creature to determine death
	public void kill(MagicalCreature other) {
		if(getAge()>40)  {
			if(getName() != other.getName()) {
				other.die();
			}
			if(getName() == other.getName()) {
				System.out.println("I do not want to kill myself");
			}
		}else if(getAge()<40) {
			System.out.println("I am too young to kill !");
		}
	}
	
	public void die() {
		System.out.println("I am a dragon - nobody gets to kill me !");
	}

}
