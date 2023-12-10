package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questions extends Turnament {
	
	
	public Questions(int CountofQuestion) {
		this.CountofQuestion = CountofQuestion;
	}
	
	public void questionsSet(Scanner sc) {
		if(CountofQuestion==5) {
			System.out.println("Question1");
			QuestionUpdater(sc);
			Question1 = Question;
			a1 = a;
			b1 = b;
			c1 =c;
			d1 =d;
			ActualAnswer1 = ActualAnswer;
			System.out.println("Question 1 Completed");
			System.out.println("Question2");
			QuestionUpdater(sc);
			Question2 = Question;
			a2 = a;
			b2 = b;
			c2 =c;
			d2 =d;
			ActualAnswer2 = ActualAnswer;
			System.out.println("Question 2 Completed");
			System.out.println("Question3");
			QuestionUpdater(sc);
			Question3 = Question;
			a3 = a;
			b3 = b;
			c3 =c;
			d3 =d;
			ActualAnswer3 = ActualAnswer;
			System.out.println("Question 3 Completed");
			System.out.println("Question4");
			QuestionUpdater(sc);
			Question4 = Question;
			a4 = a;
			b4 = b;
			c4 =c;
			d4 =d;
			ActualAnswer4 = ActualAnswer;
			System.out.println("Question 4 Completed");
			System.out.println("Question5");
			QuestionUpdater(sc);
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
			QuestionUpdater(sc);
			Question1 = Question;
			a1 = a;
			b1 = b;
			c1 =c;
			d1 =d;
			ActualAnswer1 = ActualAnswer;
			System.out.println("Question 1 Completed");
			System.out.println("Question2");
			QuestionUpdater(sc);
			Question2 = Question;
			a2 = a;
			b2 = b;
			c2 =c;
			d2 =d;
			ActualAnswer2 = ActualAnswer;
			System.out.println("Question 2 Completed");
			System.out.println("Question3");
			QuestionUpdater(sc);
			Question3 = Question;
			a3 = a;
			b3 = b;
			c3 =c;
			d3 =d;
			ActualAnswer3 = ActualAnswer;
			System.out.println("Question 3 Completed");
			System.out.println("Question4");
			QuestionUpdater(sc);
			Question4 = Question;
			a4 = a;
			b4 = b;
			c4 =c;
			d4 =d;
			ActualAnswer4 = ActualAnswer;
			System.out.println("Question 4 Completed");
			System.out.println("Question5");
			QuestionUpdater(sc);
			Question5 = Question;
			a5 = a;
			b5 = b;
			c5 =c;
			d5 =d;
			ActualAnswer5 = ActualAnswer;
			System.out.println("Question 5 Completed");
			System.out.println("Question6");
			QuestionUpdater(sc);
			Question6 = Question;
			a6 = a;
			b6 = b;
			c6 =c;
			d6 =d;
			ActualAnswer6 = ActualAnswer;
			System.out.println("Question 6 Completed");
			System.out.println("Question7");
			QuestionUpdater(sc);
			Question7 = Question;
			a7 = a;
			b7 = b;
			c7 =c;
			d7 =d;
			ActualAnswer7 = ActualAnswer;
			System.out.println("Question 7 Completed");
			System.out.println("Question8");
			QuestionUpdater(sc);
			Question8 = Question;
			a8 = a;
			b8 = b;
			c8 =c;
			d8 =d;
			ActualAnswer8 = ActualAnswer;
			System.out.println("Question 8 Completed");
			System.out.println("Question9");
			QuestionUpdater(sc);
			Question9 = Question;
			a9 = a;
			b9 = b;
			c9 =c;
			d9 =d;
			ActualAnswer9 = ActualAnswer;
			System.out.println("Question 9 Completed");
			System.out.println("Question10");
			QuestionUpdater(sc);
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
		start(sc);
		
	}
	
	public void start(Scanner sc) {
		try {
			System.out.println("Press 1 for Start");
			System.out.println("Press 2 for Go to main menu");
			String s = sc.next();
			int input = Integer.parseInt(s);
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
		catch(NumberFormatException nfe) {
			System.err.println("Invalid input type!!!");
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
			a = "a. "+input;
			System.out.print("Option b: ");
			input = sc.nextLine();
			b = "b. "+ input;
			System.out.print("Option c: ");
			input = sc.nextLine();
			c = "c. "+ input;
			System.out.print("Option d: ");
			input = sc.nextLine();
			d = "d. "+ input;
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println("Question: "+Question);
			System.out.println("options: "); 
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.print("Enter Correct Answer (eg. a/b/c/d) : ");
			char input2 = sc.next().charAt(0);
			if(input2=='a' || input2=='A')
			{
				ActualAnswer =a;
			}
			else if(input2=='b' || input2=='B')
			{
				ActualAnswer =b;
			}
			else if(input2=='c' || input2=='C')
			{
				ActualAnswer =c;
			}
			else if(input2=='d' || input2=='D')
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
		start(sc);
	}
	
	
	
	public void startTest(Scanner sc) 
	{
		if(CountofQuestion==5) {
			question1(sc);
			question2(sc);
			question3(sc);
			question4(sc);
			question5(sc);
		}
		else if(CountofQuestion==10) {
			question1(sc);
			question2(sc);
			question3(sc);
			question4(sc);
			question5(sc);
			question6(sc);
			question7(sc);
			question8(sc);
			question9(sc);
			question10(sc);
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
	
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Question1
	public void question1(Scanner sc) {
		try {
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Question 1: "+ Question1);
		System.out.println("Options: ");
		System.out.println("      "+ a1);
		System.out.println("      "+ b1);
		System.out.println("      "+ c1);
		System.out.println("      "+ d1);
		System.out.println("-------------------------------------------------------");
		System.out.print("Answer: ");
		char input2 = sc.next().charAt(0);
		if(input2=='a' || input2=='A'){
			UserAnswer2 = a2;
		}
		else if(input2=='b' || input2=='B') {
			UserAnswer2 = b2;
		}
		else if(input2=='c' || input2=='C') {
			UserAnswer2 = c2;
		}
		else if(input2=='d' || input2=='D'){
			UserAnswer2 = d2;
		}
		else {
			System.out.println("Incorrect input");
			UserAnswer1 = "Incorrect Input";
		}
		if(this.ActualAnswer1.equals(UserAnswer1)) {
			ObtainedMarks++;
		}
		}
		catch(InputMismatchException ime) {
			System.err.println("Invalid type of input");
			question1(sc);
		}
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Question 2
	
	public void question2(Scanner sc) {
		try {
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 2: "+ Question2);
			System.out.println("Options: ");
			System.out.println("      "+ a2);
			System.out.println("      "+ b2);
			System.out.println("      "+ c2);
			System.out.println("      "+ d2);
			System.out.println("-------------------------------------------------------");
			System.out.print("Answer: ");
			char input2 = sc.next().charAt(0);
			if(input2=='a' || input2=='A'){
				UserAnswer2 = a2;
			}
			else if(input2=='b' || input2=='B') {
				UserAnswer2 = b2;
			}
			else if(input2=='c' || input2=='C') {
				UserAnswer2 = c2;
			}
			else if(input2=='d' || input2=='D'){
				UserAnswer2 = d2;
			}
			else {
				System.out.println("Incorrect input");
				question2(sc);
			}
			if(this.ActualAnswer2.equals(UserAnswer2)) {
				ObtainedMarks++;
			}
		}
		catch(InputMismatchException ime) {
			System.err.println("invalid types of input");
			question2(sc);
		}
	}

	public void question3(Scanner sc) {
		try {
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Question 3: "+ Question3);
			System.out.println("Options: ");
			System.out.println("      "+ a3);
			System.out.println("      "+ b3);
			System.out.println("      "+ c3);
			System.out.println("      "+ d3);
			System.out.println("-------------------------------------------------------");
			System.out.print("Answer: ");
			char input2 = sc.next().charAt(0);
			if(input2=='a' || input2=='A'){
				UserAnswer3 = a3;
			}
			else if(input2=='b' || input2=='B') {
				UserAnswer3 = b3;
			}
			else if(input2=='c' || input2=='C') {
				UserAnswer3 = c3;
			}
			else if(input2=='d' || input2=='D'){
				UserAnswer3 = d3;
			}
			else {
				System.out.println("Incorrect input");
				question3(sc);
			}
			if(this.ActualAnswer3.equals(UserAnswer3)) {
				ObtainedMarks++;
			}
		}
		catch(InputMismatchException ime) {
			System.err.println("invalid types of input");
			question3(sc);
		}
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// Question4
		public void question4(Scanner sc) {
			try {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println("Question 4: "+ Question4);
				System.out.println("Options: ");
				System.out.println("      "+ a4);
				System.out.println("      "+ b4);
				System.out.println("      "+ c4);
				System.out.println("      "+ d4);
				System.out.println("-------------------------------------------------------");
				System.out.print("Answer: ");
				char input2 = sc.next().charAt(0);
				if(input2=='a' || input2=='A'){
					UserAnswer4 = a4;
				}
				else if(input2=='b' || input2=='B') {
					UserAnswer4 = b4;
				}
				else if(input2=='c' || input2=='C') {
					UserAnswer4 = c4;
				}
				else if(input2=='d' || input2=='D'){
					UserAnswer4 = d4;
				}
				else {
					System.out.println("Incorrect input");
					question4(sc);
				}
				if(this.ActualAnswer4.equals(UserAnswer4)) {
					ObtainedMarks++;
				}
			}
			catch(InputMismatchException ime) {
				System.err.println("invalid types of input");
				question4(sc);
			}
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Question4
		
		public void question5(Scanner sc) {
			try {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println("Question 5: "+ Question5);
				System.out.println("Options: ");
				System.out.println("      "+ a5);
				System.out.println("      "+ b5);
				System.out.println("      "+ c5);
				System.out.println("      "+ d5);
				System.out.println("-------------------------------------------------------");
				System.out.print("Answer: ");
				char input2 = sc.next().charAt(0);
				if(input2=='a' || input2=='A'){
					UserAnswer5 = a5;
				}
				else if(input2=='b' || input2=='B') {
					UserAnswer5 = b5;
				}
				else if(input2=='c' || input2=='C') {
					UserAnswer5 = c5;
				}
				else if(input2=='d' || input2=='D'){
					UserAnswer5 = d5;
				}
				else {
					System.out.println("Incorrect input");
					question5(sc);
				}
				if(this.ActualAnswer5.equals(UserAnswer5)) {
					ObtainedMarks++;
				}
			}
			catch(InputMismatchException ime) {
				System.err.println("invalid types of input");
				question5(sc);
			}
		}
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Question6
		
		public void question6(Scanner sc) {
			try {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println("Question 6: "+ Question6);
				System.out.println("Options: ");
				System.out.println("      "+ a6);
				System.out.println("      "+ b6);
				System.out.println("      "+ c6);
				System.out.println("      "+ d6);
				System.out.println("-------------------------------------------------------");
				char input2 = sc.next().charAt(0);
				if(input2=='a' || input2=='A'){
					UserAnswer6 = a6;
				}
				else if(input2=='b' || input2=='B') {
					UserAnswer6 = b6;
				}
				else if(input2=='c' || input2=='C') {
					UserAnswer6 = c6;
				}
				else if(input2=='d' || input2=='D'){
					UserAnswer6 = d6;
				}
				else {
					System.out.println("Incorrect input");
					question6(sc);
				}
				if(this.ActualAnswer6.equals(UserAnswer6)) {
					ObtainedMarks++;
				}
			}
			catch(InputMismatchException ime) {
				System.err.println("invalid types of input");
				question6(sc);
			}
		}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Question6
		
		public void question7(Scanner sc) {
			try {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println("Question 7: "+ Question7);
				System.out.println("Options: ");
				System.out.println("      "+ a7);
				System.out.println("      "+ b7);
				System.out.println("      "+ c7);
				System.out.println("      "+ d7);
				System.out.println("-------------------------------------------------------");
				char input2 = sc.next().charAt(0);
				if(input2=='a' || input2=='A'){
					UserAnswer7 = a7;
				}
				else if(input2=='b' || input2=='B') {
					UserAnswer7 = b7;
				}
				else if(input2=='c' || input2=='C') {
					UserAnswer7 = c7;
				}
				else if(input2=='d' || input2=='D'){
					UserAnswer7 = d7;
				}
				else {
					System.out.println("Incorrect input");
					question7(sc);
				}
				if(this.ActualAnswer7.equals(UserAnswer7)) {
					ObtainedMarks++;
				}
			}
			catch(InputMismatchException ime) {
				System.err.println("invalid types of input");
				question7(sc);
			}
		}
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Question8
				
		public void question8(Scanner sc) {
			try {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println("Question 8: "+ Question8);
				System.out.println("Options: ");
				System.out.println("      "+ a8);
				System.out.println("      "+ b8);
				System.out.println("      "+ c8);
				System.out.println("      "+ d8);
				System.out.println("-------------------------------------------------------");
				char input2 = sc.next().charAt(0);
				if(input2=='a' || input2=='A'){
					UserAnswer8 = a8;
					}
					else if(input2=='b' || input2=='B') {
						UserAnswer8 = b8;
					}
					else if(input2=='c' || input2=='C') {
						UserAnswer8 = c8;
					}
					else if(input2=='d' || input2=='D'){
						UserAnswer8 = d8;
					}
					else {
						System.out.println("Incorrect input");
						question8(sc);
					}
					if(this.ActualAnswer8.equals(UserAnswer8)) {
						ObtainedMarks++;
					}
				}
				catch(InputMismatchException ime) {
					System.err.println("invalid types of input");
					question8(sc);
				}
			}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Question9
						
		public void question9(Scanner sc) {
			try {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println("Question 9: "+ Question9);
				System.out.println("Options: ");
				System.out.println("      "+ a9);
				System.out.println("      "+ b9);
				System.out.println("      "+ c9);
				System.out.println("      "+ d9);
				System.out.println("-------------------------------------------------------");
				char input2 = sc.next().charAt(0);
				if(input2=='a' || input2=='A'){
					UserAnswer9 = a9;
					}
				else if(input2=='b' || input2=='B') {
					UserAnswer9 = b9;
					}
				else if(input2=='c' || input2=='C') {
					UserAnswer9 = c9;
					}
				else if(input2=='d' || input2=='D'){
					UserAnswer9 = d9;
					}
				else {
					System.out.println("Incorrect input");
					question9(sc);
					
					}
				if(this.ActualAnswer9.equals(UserAnswer9)) {
					ObtainedMarks++;
					}
				}
			catch(InputMismatchException ime) {
				System.err.println("invalid types of input");
				question9(sc);
				}
			}



//--------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Question10
								
		public void question10(Scanner sc) {
			try {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println("Question 10: "+ Question10);
				System.out.println("Options: ");
				System.out.println("      "+ a10);
				System.out.println("      "+ b10);
				System.out.println("      "+ c10);
				System.out.println("      "+ d10);
				System.out.println("-------------------------------------------------------");
				char input2 = sc.next().charAt(0);
				if(input2=='a' || input2=='A'){
					UserAnswer10 = a10;
					}
				else if(input2=='b' || input2=='B') {
					UserAnswer10 = b10;
					}
				else if(input2=='c' || input2=='C') {
					UserAnswer10 = c10;
					}
				else if(input2=='d' || input2=='D'){
					UserAnswer10 = d10;
					}
				else {
					System.out.println("Incorrect input");
					question10(sc);
							
					}
				if(this.ActualAnswer10.equals(UserAnswer10)) {
					ObtainedMarks++;
					}
				}
			catch(InputMismatchException ime) {
				System.err.println("invalid types of input");
				question10(sc);
					}
				}



//--------------------------------------------------------------------------------------------------------------------------------------------------------------









}
