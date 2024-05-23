package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu extends KaunBanegaCoder {

	String Subject;
	public void mainMenu(Scanner sc) {
		try {
			System.out.println("Select Subject:-");
			System.out.println("1. SQL");
			System.out.println("2. Java");
			System.out.println("3. Turnament");
			int input = sc.nextInt();
			switch (input) {
			case 1: {
				this.Subject = "SQL";
				SQL ref1 = new SQL();
					ref1.SqlLevels(sc);
					LevelCompleted(sc);
					}
			break;
			case 2: {
				Subject = "Core Java";
				Java ref3 = new Java();
					ref3.JavaLevels(sc);
			}
			break;
			case 3: Turnament ref4 = new Turnament();
					ref4.turnament(sc);
			default:
				System.err.println("Invalid input");
				mainMenu(sc);
			}
		}
		catch(InputMismatchException ime) {
			System.err.println("Invalid type of input, Please type valid input!!!");
			mainMenu(sc);
		}
		
	}
	
	public void LevelCompleted(Scanner sc) {
		System.out.println("Congratulations! you completed all the levels of "+"SQL");
		System.out.println("You have a good level of knowledge is SQL.");
		System.out.println("I hope your future will is successed in your development journey.");
		System.out.println("I hope you liked KaunBenegaCoder.com application");
		System.out.println("Thanks for using.");
	}
	
}
