package KaunBanegaCoder;


import java.util.Scanner;

public class Turnament extends MainMenu {
	int CountofQuestion;
	int TotalMarks = CountofQuestion;
	int ObtainedMarks;
	String Question;
	String a;
	String b;
	String c;
	String d;
	String UserAnswer;
	String ActualAnswer;
	String Question1;
	String a1;
	String b1;
	String c1;
	String d1;
	String UserAnswer1;
	String ActualAnswer1;
	String Question2;
	String a2;
	String b2;
	String c2;
	String d2;
	String UserAnswer2;
	String ActualAnswer2;
	String Question3;
	String a3;
	String b3;
	String c3;
	String d3;
	String UserAnswer3;
	String ActualAnswer3;
	String Question4;
	String a4;
	String b4;
	String c4;
	String d4;
	String UserAnswer4;
	String ActualAnswer4;
	String Question5;
	String a5;
	String b5;
	String c5;
	String d5;
	String UserAnswer5;
	String ActualAnswer5;
	String Question6;
	String a6;
	String b6;
	String c6;
	String d6;
	String UserAnswer6;
	String ActualAnswer6;
	String Question7;
	String a7;
	String b7;
	String c7;
	String d7;
	String UserAnswer7;
	String ActualAnswer7;
	String Question8;
	String a8;
	String b8;
	String c8;
	String d8;
	String UserAnswer8;
	String ActualAnswer8;
	String Question9;
	String a9;
	String b9;
	String c9;
	String d9;
	String UserAnswer9;
	String ActualAnswer9;
	String Question10;
	String a10;
	String b10;
	String c10;
	String d10;
	String UserAnswer10;
	String ActualAnswer10;
	
	public void Turnament1(Scanner sc) {
	}
	public void turnament(Scanner sc) {
		try {
			
			System.err.println("Currently doesn't have turnament!!");
			System.out.println("Press 1 for Create Turnament");
			System.out.println("Press 2 for Go Main Menu");
			System.out.println("Input: ");
			String s = sc.next();
			int input = Integer.parseInt(s);
			sc.nextLine();
			if(input ==1) {
				createTurnament(sc);
				Questions ref = new Questions(CountofQuestion);
				ref.questionsSet(sc);
				}
			else if(input ==2) {
				mainMenu(sc);
				}
			
			
		}
		catch(NumberFormatException nfe) {
			System.out.println("Input type is incorrect!!");
			turnament(sc);
			}
		
		
	}
	
	public void createTurnament(Scanner sc) {
		try {
			System.out.println("How many Question?(eg. 5, 10)");
			System.out.println("Press 1 for 5 question");
			System.out.println("Press 2 for 10 question");
			String s = sc.next();
			int input = Integer.parseInt(s);
			if(input ==1) {
				CountofQuestion =5;
			}
			else if(input ==2) {
				CountofQuestion =10;
			}
		}
		catch(NumberFormatException ime) {
			System.err.println("Input types is invalid");
			createTurnament(sc);
		}
		
	}
}
