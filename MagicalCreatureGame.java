/* Midy Voong
 * CSC 20
 * 3/13/2022
 * Assignment 2
 */

import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class MagicalCreatureGame {
	public static ArrayList<MagicalCreature> creatures = new ArrayList<>();
	public static int MOVES;
	public static int alive;
	public static int deathCounter =0;
	public static void main(String[] args) {
		playGame();
		checkAlive();
		
	}
	
	//Populating Creatures and playing game
	public static void playGame() {
		try {
			Scanner input = new Scanner(new File("creatures.txt"));
			
			while(input.hasNextLine()) {
				String line = input.nextLine();
				String[] temp = line.split(",");
				
				switch(temp[1]) {
				case "Dragon":
					creatures.add(new Dragon(temp[0],temp[1],temp[2],Integer.valueOf(temp[3])));
					break;
				case "Elf":
					creatures.add(new Elf(temp[0],temp[1],temp[2],Integer.valueOf(temp[3])));
					break;
				case "Goblin":
					creatures.add(new Goblin(temp[0],temp[1],temp[2],Integer.valueOf(temp[3])));
					break;
				case "Genie":
					creatures.add(new Genie(temp[0],temp[1],temp[2],Integer.valueOf(temp[3])));
					break;
				default:
					creatures.add(new MagicalCreature(temp[0],temp[1],temp[2],Integer.valueOf(temp[3])));
					break;
				}
				alive++;

			}
		}
		catch(Exception e) {
			System.out.println("An exception has occured");
		
		}
		war();
	}
	
	//Starting the actual game (war)
	public static void war() {
		
		int i = 1;
		System.out.print("Decide the amount of moves you would like to play for: ");
		Scanner scan = new Scanner(System.in);
		MOVES = scan.nextInt();
		
		while(i <= MOVES) {
			if(creatures.size()==0) {
				System.out.println("War has ended!");
				break;
			}
			Random rand = new Random();
			int a , b;
			a = rand.nextInt(creatures.size());
			b = rand.nextInt(creatures.size());
			i++;
			System.out.println(creatures.get(a).getType()+" "+creatures.get(a).getName()+ " is attacking " +creatures.get(b).getType()+" "+ creatures.get(b).getName());
			creatures.get(a).kill(creatures.get(b));
			if(creatures.get(b).getAlive() == false) {
				creatures.get(b).setAlive(true);
				creatures.remove(b);
				deathCounter++;
				
			}
		
		
		
			
		}	
		
		
	
	}
	
	//Checking whos is alive and stating the members alive + shows how many died
	public static void checkAlive() {
		System.out.println("\n\nWho is still alive?");
		System.out.println("The amount of tradegies = "+deathCounter);
		for(int i=0;i<creatures.size();i++) {
			System.out.println(i+": "+creatures.get(i));
			
		}
	}

	
	
}
