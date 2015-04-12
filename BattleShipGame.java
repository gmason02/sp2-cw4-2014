import java.util.Random;
import java.util.Scanner;

public class BattleShipGame {
	Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.println("Welcome to Battle Ships");
		System.out.println();
		
		Ocean ocean = new Ocean();
		ocean.print();
		//Create a new Ocean from Ocean class
		//Have Ocean fill with random placed ships
		//Display Ocean. Should all of these be called from Ocean class?
	}
}