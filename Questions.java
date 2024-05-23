package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questions extends Turnament {
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
	
	public Questions(int CountofQuestion) {
		this.CountofQuestion = CountofQuestion;
	}
	
	public void questionsSet(Scanner sc) {
		if(CountofQuestion==5) {
			QuestionUpdater(sc);
			System.out.println("Question1");
			Question1 = Question;
			a1 = a;
			b1 = b;
			c1 =c;
			d1 =d;
			ActualAnswer1 = ActualAnswer;
			System.out.println("Question 1 Completed");
			System.out.println("Question2");
			Question2 = Question;
			a2 = a;
			b2 = b;
			c2 =c;
			d2 =d;
			ActualAnswer2 = ActualAnswer;
			System.out.println("Question 2 Completed");
			System.out.println("Question3");
			Question3 = Question;
			a3 = a;
			b3 = b;
			c3 =c;
			d3 =d;
			ActualAnswer3 = ActualAnswer;
			System.out.println("Question 3 Completed");
			System.out.println("Question4");
			Question4 = Question;
			a4 = a;
			b4 = b;
			c4 =c;
			d4 =d;
			ActualAnswer4 = ActualAnswer;
			System.out.println("Question 4 Completed");
			System.out.println("Question5");
			Question5 = Question;
			a5 = a;
			b5 = b;
			c5 =c;
			d5 =d;
			ActualAnswer5 = ActualAnswer;
			System.out.println("Question 5 Completed");
			
		}
		else if(CountofQuestion==10) {
			QuestionUpdater(sc);
			System.out.println("Question1");
			Question1 = Question;
			a1 = a;
			b1 = b;
			c1 =c;
			d1 =d;
			ActualAnswer1 = ActualAnswer;
			System.out.println("Question 1 Completed");
			System.out.println("Question2");
			Question2 = Question;
			a2 = a;
			b2 = b;
			c2 =c;
			d2 =d;
			ActualAnswer2 = ActualAnswer;
			System.out.println("Question 2 Completed");
			System.out.println("Question3");
			Question3 = Question;
			a3 = a;
			b3 = b;
			c3 =c;
			d3 =d;
			ActualAnswer3 = ActualAnswer;
			System.out.println("Question 3 Completed");
			System.out.println("Question4");
			Question4 = Question;
			a4 = a;
			b4 = b;
			c4 =c;
			d4 =d;
			ActualAnswer4 = ActualAnswer;
			System.out.println("Question 4 Completed");
			System.out.println("Question5");
			Question5 = Question;
			a5 = a;
			b5 = b;
			c5 =c;
			d5 =d;
			ActualAnswer5 = ActualAnswer;
			System.out.println("Question 5 Completed");
			System.out.println("Question6");
			Question6 = Question;
			a6 = a;
			b6 = b;
			c6 =c;
			d6 =d;
			ActualAnswer6 = ActualAnswer;
			System.out.println("Question 6 Completed");
			System.out.println("Question7");
			Question7 = Question;
			a7 = a;
			b7 = b;
			c7 =c;
			d7 =d;
			ActualAnswer7 = ActualAnswer;
			System.out.println("Question 7 Completed");
			System.out.println("Question8");
			Question8 = Question;
			a8 = a;
			b8 = b;
			c8 =c;
			d8 =d;
			ActualAnswer8 = ActualAnswer;
			System.out.println("Question 8 Completed");
			System.out.println("Question9");
			Question9 = Question;
			a9 = a;
			b9 = b;
			c9 =c;
			d9 =d;
			ActualAnswer9 = ActualAnswer;
			System.out.println("Question 9 Completed");
			System.out.println("Question10");
			Question10 = Question;
			a10 = a;
			b10 = b;
			c10 =c;
			d10 =d;
			ActualAnswer10 = ActualAnswer;
			System.out.println("Question 10 Completed");
			
		}
		viewQuestion(sc);
		System.out.println("All Question added Successfully!");
		
	}
	
	public void start(Scanner sc) {
		System.out.println("Press 1 for Start");
		System.out.println("Press 2 for Go to main menu");
		int input = sc.nextInt();
		if(input ==1) {
			startTest(sc);
			score(sc);
		}
		else if(input ==2) {
			mainMenu(sc);
		}
		else {
			System.err.println("Invalid input");
			start(sc);
		}
	}
	public void QuestionUpdater(Scanner sc) {
		try {
			sc.nextLine();
			System.out.print("Enter Question: ");
			Question = sc.nextLine();
			System.out.print("Option a: ");
			String input = sc.nextLine();
			a = "1. "+input;
			System.out.print("Option b: ");
			input = sc.nextLine();
			b = "2. "+ input;
			System.out.print("Option c: ");
			input = sc.nextLine();
			c = "3. "+ input;
			System.out.print("Option d: ");
			input = sc.nextLine();
			d = "4. "+ input;
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println("Question: "+Question);
			System.out.println("options: "); 
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.print("Enter Correct Answer: ");
			byte input2 = sc.nextByte();
			if(input2==1)
			{
				ActualAnswer =a;
			}
			else if(input2==2)
			{
				ActualAnswer =b;
			}
			else if(input2==3)
			{
				ActualAnswer =c;
			}
			else if(input2==4)
			{
				ActualAnswer =d;
			}
			else {
				System.err.println("Opps! Correct answer is invalid, Please re -enter the question!!!");
				QuestionUpdater(sc);
			}
		}
		catch(InputMismatchException ime) {
			System.out.println("Invalid Input, please enter valid input");
			QuestionUpdater(sc);
		}
		
	}
	
	public void viewQuestion(Scanner sc) {
		if(CountofQuestion==5) {
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 1: "+ Question1);
			System.out.println("Options: ");
			System.out.println("      "+ a1);
			System.out.println("      "+ b1);
			System.out.println("      "+ c1);
			System.out.println("      "+ d1);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer1);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 2: "+ Question2);
			System.out.println("Options: ");
			System.out.println("      "+ a2);
			System.out.println("      "+ b2);
			System.out.println("      "+ c2);
			System.out.println("      "+ d2);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer2);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 3: "+ Question3);
			System.out.println("Options: ");
			System.out.println("      "+ a3);
			System.out.println("      "+ b3);
			System.out.println("      "+ c3);
			System.out.println("      "+ d3);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer3);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 4: "+ Question4);
			System.out.println("Options: ");
			System.out.println("      "+ a4);
			System.out.println("      "+ b4);
			System.out.println("      "+ c4);
			System.out.println("      "+ d4);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer4);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 5: "+ Question5);
			System.out.println("Options: ");
			System.out.println("      "+ a5);
			System.out.println("      "+ b5);
			System.out.println("      "+ c5);
			System.out.println("      "+ d5);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer5);
			System.out.println("--------------------------------------------------------------------------------------------");
		}
		else if(CountofQuestion==10) {
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 1: "+ Question1);
			System.out.println("Options: ");
			System.out.println("      "+ a1);
			System.out.println("      "+ b1);
			System.out.println("      "+ c1);
			System.out.println("      "+ d1);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer1);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 2: "+ Question2);
			System.out.println("Options: ");
			System.out.println("      "+ a2);
			System.out.println("      "+ b2);
			System.out.println("      "+ c2);
			System.out.println("      "+ d2);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer2);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 3: "+ Question3);
			System.out.println("Options: ");
			System.out.println("      "+ a3);
			System.out.println("      "+ b3);
			System.out.println("      "+ c3);
			System.out.println("      "+ d3);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer3);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 4: "+ Question4);
			System.out.println("Options: ");
			System.out.println("      "+ a4);
			System.out.println("      "+ b4);
			System.out.println("      "+ c4);
			System.out.println("      "+ d4);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer4);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 5: "+ Question5);
			System.out.println("Options: ");
			System.out.println("      "+ a5);
			System.out.println("      "+ b5);
			System.out.println("      "+ c5);
			System.out.println("      "+ d5);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer5);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 6: "+ Question6);
			System.out.println("Options: ");
			System.out.println("      "+ a6);
			System.out.println("      "+ b6);
			System.out.println("      "+ c6);
			System.out.println("      "+ d6);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer6);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 7: "+ Question7);
			System.out.println("Options: ");
			System.out.println("      "+ a7);
			System.out.println("      "+ b7);
			System.out.println("      "+ c7);
			System.out.println("      "+ d7);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer7);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 8: "+ Question8);
			System.out.println("Options: ");
			System.out.println("      "+ a8);
			System.out.println("      "+ b8);
			System.out.println("      "+ c8);
			System.out.println("      "+ d8);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer8);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 9: "+ Question9);
			System.out.println("Options: ");
			System.out.println("      "+ a9);
			System.out.println("      "+ b9);
			System.out.println("      "+ c9);
			System.out.println("      "+ d9);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer9);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 10: "+ Question10);
			System.out.println("Options: ");
			System.out.println("      "+ a10);
			System.out.println("      "+ b10);
			System.out.println("      "+ c10);
			System.out.println("      "+ d10);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer10);
			System.out.println("--------------------------------------------------------------------------------------------");
		}
		
	}
	public void viewAnswer(Scanner sc) {
		if(CountofQuestion==5) {
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 1: "+ Question1);
			System.out.println("Options: ");
			System.out.println("      "+ a1);
			System.out.println("      "+ b1);
			System.out.println("      "+ c1);
			System.out.println("      "+ d1);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer1);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer1);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 2: "+ Question2);
			System.out.println("Options: ");
			System.out.println("      "+ a2);
			System.out.println("      "+ b2);
			System.out.println("      "+ c2);
			System.out.println("      "+ d2);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer2);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer2);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 3: "+ Question3);
			System.out.println("Options: ");
			System.out.println("      "+ a3);
			System.out.println("      "+ b3);
			System.out.println("      "+ c3);
			System.out.println("      "+ d3);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer3);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer3);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 4: "+ Question4);
			System.out.println("Options: ");
			System.out.println("      "+ a4);
			System.out.println("      "+ b4);
			System.out.println("      "+ c4);
			System.out.println("      "+ d4);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer4);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer4);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 5: "+ Question5);
			System.out.println("Options: ");
			System.out.println("      "+ a5);
			System.out.println("      "+ b5);
			System.out.println("      "+ c5);
			System.out.println("      "+ d5);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer5);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer5);
			System.out.println("--------------------------------------------------------------------------------------------");
		}
		else if(CountofQuestion==10) {
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 1: "+ Question1);
			System.out.println("Options: ");
			System.out.println("      "+ a1);
			System.out.println("      "+ b1);
			System.out.println("      "+ c1);
			System.out.println("      "+ d1);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer1);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer1);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 2: "+ Question2);
			System.out.println("Options: ");
			System.out.println("      "+ a2);
			System.out.println("      "+ b2);
			System.out.println("      "+ c2);
			System.out.println("      "+ d2);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer2);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer2);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 3: "+ Question3);
			System.out.println("Options: ");
			System.out.println("      "+ a3);
			System.out.println("      "+ b3);
			System.out.println("      "+ c3);
			System.out.println("      "+ d3);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer3);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer3);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 4: "+ Question4);
			System.out.println("Options: ");
			System.out.println("      "+ a4);
			System.out.println("      "+ b4);
			System.out.println("      "+ c4);
			System.out.println("      "+ d4);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer4);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer4);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 5: "+ Question5);
			System.out.println("Options: ");
			System.out.println("      "+ a5);
			System.out.println("      "+ b5);
			System.out.println("      "+ c5);
			System.out.println("      "+ d5);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer5);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer5);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 6: "+ Question6);
			System.out.println("Options: ");
			System.out.println("      "+ a6);
			System.out.println("      "+ b6);
			System.out.println("      "+ c6);
			System.out.println("      "+ d6);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer6);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer6);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 7: "+ Question7);
			System.out.println("Options: ");
			System.out.println("      "+ a7);
			System.out.println("      "+ b7);
			System.out.println("      "+ c7);
			System.out.println("      "+ d7);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer7);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer7);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 8: "+ Question8);
			System.out.println("Options: ");
			System.out.println("      "+ a8);
			System.out.println("      "+ b8);
			System.out.println("      "+ c8);
			System.out.println("      "+ d8);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer8);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer8);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 9: "+ Question9);
			System.out.println("Options: ");
			System.out.println("      "+ a9);
			System.out.println("      "+ b9);
			System.out.println("      "+ c9);
			System.out.println("      "+ d9);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer9);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer9);
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 10: "+ Question10);
			System.out.println("Options: ");
			System.out.println("      "+ a10);
			System.out.println("      "+ b10);
			System.out.println("      "+ c10);
			System.out.println("      "+ d10);
			System.out.println("-------------------------------------------------------");
			System.out.println("Correct Answer: "+ActualAnswer10);
			System.out.println("-------------------------------------------------------");
			System.out.println("Your Answer: "+UserAnswer10);
			System.out.println("--------------------------------------------------------------------------------------------");
		}
	}
	public void startTest(Scanner sc) 
	{
		if(CountofQuestion==1) {
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 1: "+ Question1);
			System.out.println("Options: ");
			System.out.println("      "+ a1);
			System.out.println("      "+ b1);
			System.out.println("      "+ c1);
			System.out.println("      "+ d1);
			System.out.println("-------------------------------------------------------");
			System.out.print("Answer: ");
			int input = sc.nextInt();
			if(input==1) {
				UserAnswer1 = a1;
			}
			else if(input==2) {
				UserAnswer1 = b1;
			}
			else if(input==3) {
				UserAnswer1 = c1;
			}
			else if(input==4) {
				UserAnswer1 = d1;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer1 = "Incorrect Input";
			}
			if(this.ActualAnswer1.equals(UserAnswer1)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 2: "+ Question2);
			System.out.println("Options: ");
			System.out.println("      "+ a2);
			System.out.println("      "+ b2);
			System.out.println("      "+ c2);
			System.out.println("      "+ d2);
			System.out.println("-------------------------------------------------------");
			System.out.print("Answer: ");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer2 = a2;
			}
			else if(input==2) {
				UserAnswer2 = b2;
			}
			else if(input==3) {
				UserAnswer2 = c2;
			}
			else if(input==4) {
				UserAnswer2 = d2;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer2 = "Incorrect Input";
			}
			if(this.ActualAnswer2.equals(UserAnswer2)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 3: "+ Question3);
			System.out.println("Options: ");
			System.out.println("      "+ a3);
			System.out.println("      "+ b3);
			System.out.println("      "+ c3);
			System.out.println("      "+ d3);
			System.out.println("-------------------------------------------------------");
			System.out.print("Answer: ");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer3 = a3;
			}
			else if(input==2) {
				UserAnswer3 = b3;
			}
			else if(input==3) {
				UserAnswer3 = c3;
			}
			else if(input==4) {
				UserAnswer3 = d3;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer3 = "Incorrect Input";
			}
			if(this.ActualAnswer3.equals(UserAnswer3)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 4: "+ Question4);
			System.out.println("Options: ");
			System.out.println("      "+ a4);
			System.out.println("      "+ b4);
			System.out.println("      "+ c4);
			System.out.println("      "+ d4);
			System.out.println("-------------------------------------------------------");
			System.out.print("Answer: ");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer4 = a4;
			}
			else if(input==2) {
				UserAnswer4 = b4;
			}
			else if(input==3) {
				UserAnswer4 = c4;
			}
			else if(input==4) {
				UserAnswer4 = d4;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer4 = "Incorrect Input";
			}
			if(this.ActualAnswer4.equals(UserAnswer4)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 5: "+ Question5);
			System.out.println("Options: ");
			System.out.println("      "+ a5);
			System.out.println("      "+ b5);
			System.out.println("      "+ c5);
			System.out.println("      "+ d5);
			System.out.println("-------------------------------------------------------");
			System.out.print("Answer: ");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer5 = a5;
			}
			else if(input==2) {
				UserAnswer5 = b5;
			}
			else if(input==3) {
				UserAnswer5 = c5;
			}
			else if(input==4) {
				UserAnswer5 = d5;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer5 = "Incorrect Input";
			}
			if(this.ActualAnswer5.equals(UserAnswer5)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
		}
		else if(CountofQuestion==10) {
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 1: "+ Question1);
			System.out.println("Options: ");
			System.out.println("      "+ a1);
			System.out.println("      "+ b1);
			System.out.println("      "+ c1);
			System.out.println("      "+ d1);
			System.out.println("-------------------------------------------------------");
			System.out.print("Answer: ");
			int input = sc.nextInt();
			if(input==1) {
				UserAnswer1 = a1;
			}
			else if(input==2) {
				UserAnswer1 = b1;
			}
			else if(input==3) {
				UserAnswer1 = c1;
			}
			else if(input==4) {
				UserAnswer1 = d1;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer1 = "Incorrect Input";
			}
			if(this.ActualAnswer1.equals(UserAnswer1)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 2: "+ Question2);
			System.out.println("Options: ");
			System.out.println("      "+ a2);
			System.out.println("      "+ b2);
			System.out.println("      "+ c2);
			System.out.println("      "+ d2);
			System.out.println("-------------------------------------------------------");
			System.out.print("Answer: ");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer2 = a2;
			}
			else if(input==2) {
				UserAnswer2 = b2;
			}
			else if(input==3) {
				UserAnswer2 = c2;
			}
			else if(input==4) {
				UserAnswer2 = d2;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer2 = "Incorrect Input";
			}
			if(this.ActualAnswer2.equals(UserAnswer2)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 3: "+ Question3);
			System.out.println("Options: ");
			System.out.println("      "+ a3);
			System.out.println("      "+ b3);
			System.out.println("      "+ c3);
			System.out.println("      "+ d3);
			System.out.println("-------------------------------------------------------");
			System.out.print("Answer: ");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer3 = a3;
			}
			else if(input==2) {
				UserAnswer3 = b3;
			}
			else if(input==3) {
				UserAnswer3 = c3;
			}
			else if(input==4) {
				UserAnswer3 = d3;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer3 = "Incorrect Input";
			}
			if(this.ActualAnswer3.equals(UserAnswer3)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 4: "+ Question4);
			System.out.println("Options: ");
			System.out.println("      "+ a4);
			System.out.println("      "+ b4);
			System.out.println("      "+ c4);
			System.out.println("      "+ d4);
			System.out.println("-------------------------------------------------------");
			System.out.print("Answer: ");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer4 = a4;
			}
			else if(input==2) {
				UserAnswer4 = b4;
			}
			else if(input==3) {
				UserAnswer4 = c4;
			}
			else if(input==4) {
				UserAnswer4 = d4;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer4 = "Incorrect Input";
			}
			if(this.ActualAnswer4.equals(UserAnswer4)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 5: "+ Question5);
			System.out.println("Options: ");
			System.out.println("      "+ a5);
			System.out.println("      "+ b5);
			System.out.println("      "+ c5);
			System.out.println("      "+ d5);
			System.out.println("-------------------------------------------------------");
			System.out.print("Answer: ");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer5 = a5;
			}
			else if(input==2) {
				UserAnswer5 = b5;
			}
			else if(input==3) {
				UserAnswer5 = c5;
			}
			else if(input==4) {
				UserAnswer5 = d5;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer5 = "Incorrect Input";
			}
			if(this.ActualAnswer5.equals(UserAnswer5)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 6: "+ Question6);
			System.out.println("Options: ");
			System.out.println("      "+ a6);
			System.out.println("      "+ b6);
			System.out.println("      "+ c6);
			System.out.println("      "+ d6);
			System.out.println("-------------------------------------------------------");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer6 = a6;
			}
			else if(input==2) {
				UserAnswer6 = b6;
			}
			else if(input==3) {
				UserAnswer6 = c6;
			}
			else if(input==4) {
				UserAnswer6 = d6;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer6 = "Incorrect Input";
			}
			if(this.ActualAnswer6.equals(UserAnswer6)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 7: "+ Question7);
			System.out.println("Options: ");
			System.out.println("      "+ a7);
			System.out.println("      "+ b7);
			System.out.println("      "+ c7);
			System.out.println("      "+ d7);
			System.out.println("-------------------------------------------------------");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer7 = a7;
			}
			else if(input==2) {
				UserAnswer7 = b7;
			}
			else if(input==3) {
				UserAnswer7 = c7;
			}
			else if(input==4) {
				UserAnswer7 = d7;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer7 = "Incorrect Input";
			}
			if(this.ActualAnswer7.equals(UserAnswer7)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 8: "+ Question8);
			System.out.println("Options: ");
			System.out.println("      "+ a8);
			System.out.println("      "+ b8);
			System.out.println("      "+ c8);
			System.out.println("      "+ d8);
			System.out.println("-------------------------------------------------------");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer8 = a8;
			}
			else if(input==2) {
				UserAnswer8 = b8;
			}
			else if(input==3) {
				UserAnswer8 = c8;
			}
			else if(input==4) {
				UserAnswer8 = d8;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer8 = "Incorrect Input";
			}
			if(this.ActualAnswer8.equals(UserAnswer8)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 9: "+ Question9);
			System.out.println("Options: ");
			System.out.println("      "+ a9);
			System.out.println("      "+ b9);
			System.out.println("      "+ c9);
			System.out.println("      "+ d9);
			System.out.println("-------------------------------------------------------");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer9 = a9;
			}
			else if(input==2) {
				UserAnswer9 = b9;
			}
			else if(input==3) {
				UserAnswer9 = c9;
			}
			else if(input==4) {
				UserAnswer9 = d9;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer9 = "Incorrect Input";
			}
			if(this.ActualAnswer9.equals(UserAnswer9)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 10: "+ Question10);
			System.out.println("Options: ");
			System.out.println("      "+ a10);
			System.out.println("      "+ b10);
			System.out.println("      "+ c10);
			System.out.println("      "+ d10);
			System.out.println("-------------------------------------------------------");
			input = sc.nextInt();
			if(input==1) {
				UserAnswer10 = a10;
			}
			else if(input==2) {
				UserAnswer10 = b10;
			}
			else if(input==3) {
				UserAnswer10 = c10;
			}
			else if(input==4) {
				UserAnswer10 = d10;
			}
			else {
				System.out.println("Incorrect input");
				UserAnswer10 = "Incorrect Input";
			}
			if(this.ActualAnswer10.equals(UserAnswer10)) {
				ObtainedMarks++;
			}
			System.out.println("--------------------------------------------------------------------------------------------");
		}
	}
	
	public void score(Scanner sc) {
		System.out.println("your Score is "+ ObtainedMarks+ " /"+TotalMarks);
			System.out.println("1. Play Again");
			System.out.println("2. View Answer");
			System.out.println("3. Go to Main Menu");
			int input = sc.nextInt();
			if(input ==1) {
				startTest(sc);
			}
			else if(input ==2) {
				viewAnswer(sc);
			}
			else if(input ==3) {
				mainMenu(sc);
			}
			else {
				System.err.println("Incorrect Input");
				score(sc);
			}
	}
}
