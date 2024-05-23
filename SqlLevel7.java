package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SqlLevel7 extends SqlLevel6{
	
	int L7Marks=0;
	String L7Question1;
	String L7UserAnswer1;
	String L7ActualAnswer1;
	String L7Question2;
	String L7UserAnswer2;
	String L7ActualAnswer2;
	String L7Question3;
	String L7UserAnswer3;
	String L7ActualAnswer3;
	String L7Question4;
	String L7UserAnswer4;
	String L7ActualAnswer4;
	String L7Question5;
	String L7UserAnswer5;
	String L7ActualAnswer5;
	String L7Question6;
	String L7UserAnswer6;
	String L7ActualAnswer6;
	String L7Question7;
	String L7UserAnswer7;
	String L7ActualAnswer7;
	String L7Question8;
	String L7UserAnswer8;
	String L7ActualAnswer8;
	String L7Question9;
	String L7UserAnswer9;
	String L7ActualAnswer9;
	String L7Question10;
	String L7UserAnswer10;
	String L7ActualAnswer10;
	String L7Question ="";
	String a;
	String b;
	String c;
	String d;
	String L7UserAnswer;
	String L7ActualAnswer;
	int Attempt;
	
	public void L7QuestionSet(Scanner sc){
		if (Attempt ==0) 
		{
			Attempt++;
			L7Marks =0;
			L7set1Quetion1(sc);
			L7Question1 = L7Question;
			L7ActualAnswer1 = L7ActualAnswer;
			L7UserAnswer1 = L7UserAnswer;
			System.out.println(L7Marks);
			L7set1Quetion2(sc);
			L7Question2 = L7Question;
			L7ActualAnswer2 = L7ActualAnswer;
			L7UserAnswer2 = L7UserAnswer;
			L7set1Quetion3(sc);
			L7Question3 = L7Question;
			L7ActualAnswer3 = L7ActualAnswer;
			L7UserAnswer3 = L7UserAnswer;
			System.out.println(L7Marks);
			L7set1Quetion4(sc);
			L7Question4 = L7Question;
			L7ActualAnswer4 = L7ActualAnswer;
			L7UserAnswer4 = L7UserAnswer;
			System.out.println(L7Marks);
			L7set1Quetion5(sc);
			L7Question5 = L7Question;
			L7ActualAnswer5 = L7ActualAnswer;
			L7UserAnswer5 = L7UserAnswer;
			L7set1Quetion6(sc);
			L7Question6 = L7Question;
			L7ActualAnswer6 = L7ActualAnswer;
			L7UserAnswer6 = L7UserAnswer;
			L7set1Quetion7(sc);
			L7Question7 = L7Question;
			L7ActualAnswer7 = L7ActualAnswer;
			L7UserAnswer7 = L7UserAnswer;
			L7set1Quetion8(sc);
			L7Question8 = L7Question;
			L7ActualAnswer8 = L7ActualAnswer;
			L7UserAnswer8 = L7UserAnswer;
			L7set1Quetion9(sc);
			L7Question9 = L7Question;
			L7ActualAnswer9 = L7ActualAnswer;
			L7UserAnswer9 = L7UserAnswer;
			L7set1Quetion10(sc);
			L7Question10 = L7Question;
			L7ActualAnswer10 = L7ActualAnswer;
			L7UserAnswer10 = L7UserAnswer;
			
		}
		else if(Attempt ==1) 
		{
			Attempt++;
			L7Marks =0;
			L7set2Quetion1(sc);
			L7Question1 = L7Question;
			L7ActualAnswer1 = L7ActualAnswer;
			L7UserAnswer1 = L7UserAnswer;
			L7set2Quetion2(sc);
			L7Question2 = L7Question;
			L7ActualAnswer2 = L7ActualAnswer;
			L7UserAnswer2 = L7UserAnswer;
			L7set2Quetion3(sc);
			L7Question3 = L7Question;
			L7ActualAnswer3 = L7ActualAnswer;
			L7UserAnswer3 = L7UserAnswer;
			L7set2Quetion4(sc);
			L7Question4 = L7Question;
			L7ActualAnswer4 = L7ActualAnswer;
			L7UserAnswer4 = L7UserAnswer;
			L7set2Quetion5(sc);
			L7Question5 = L7Question;
			L7ActualAnswer5 = L7ActualAnswer;
			L7UserAnswer5 = L7UserAnswer;
			L7set2Quetion6(sc);
			L7Question6 = L7Question;
			L7ActualAnswer6 = L7ActualAnswer;
			L7UserAnswer6 = L7UserAnswer;
			L7set2Quetion7(sc);
			L7Question7 = L7Question;
			L7ActualAnswer7 = L7ActualAnswer;
			L7UserAnswer7 = L7UserAnswer;
			L7set2Quetion8(sc);
			L7Question8 = L7Question;
			L7ActualAnswer8 = L7ActualAnswer;
			L7UserAnswer8 = L7UserAnswer;
			L7set2Quetion9(sc);
			L7Question9 = L7Question;
			L7ActualAnswer9 = L7ActualAnswer;
			L7UserAnswer9 = L7UserAnswer;
			L7set2Quetion10(sc);
			L7Question10 = L7Question;
			L7ActualAnswer10 = L7ActualAnswer;
			L7UserAnswer10 = L7UserAnswer;	
		}
		L7Menu(sc);
		
	}
	public void L7set1Quetion1(Scanner sc){
		try 
		{
			L7Question = "What does DCL stand for in SQL?";
			a = "1. Data Collection Language";
			b = "2. Data Control Language";
			c = "3. Data Conversion Language";
			d = "4. Data Communication Language";
			System.out.println("Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = b;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set1Quetion1(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set1Quetion1(sc);
		}
	}
	
	public void L7set1Quetion2(Scanner sc){
		try 
		{
			L7Question = "Which statement is used to grant privileges in SQL?";
			a = "1. GRANT";
			b = "2. ALLOW";
			c = "3. GRANT TO";
			d = "4. PROVIDE";
			System.out.println("Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = a;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set1Quetion2(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set1Quetion2(sc);
		}
	}
	public void L7set1Quetion3(Scanner sc){
		try 
		{
			L7Question = "In SQL, which privilege allows a user to modify existing data in a table?";
			a = "1. INSERT";
			b = "2. UPDATE";
			c = "3. DELETE";
			d = "4. ALTER";
			System.out.println("Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = b;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set1Quetion3(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set1Quetion3(sc);
		}
	}
	
	public void L7set1Quetion4(Scanner sc){
		try 
		{
			L7Question = "Which SQL statement is used to remove a user from a database?";
			a = "1. REMOVE USER";
			b = "2. DELETE USER";
			c = "3. DROP USER";
			d = "4. REVOKE USER";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = d;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set1Quetion4(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set1Quetion4(sc);
		}
	}	
	
	public void L7set1Quetion5(Scanner sc){
		try 
		{
			L7Question = "Write a query to grant SELECT and INSERT privileges on the \"employees\" table to the user 'john'.";
			a = "1. GRANT SELECT, INSERT ON employees TO john;";
			b = "2. GRANT SELECT, INSERT FROM employees TO john;";
			c = "3. ALLLOW ACCESS SELECT, INSERT ON employees TO john;";
			d = "4. GRANT SELECT, INSERT ON employees TO john;";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = a;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set1Quetion5(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set1Quetion5(sc);
		}
	}
	
	public void L7set1Quetion6(Scanner sc){
		try 
		{
			L7Question = "Which of the following statements is used to set a transaction as read-only in SQL?";
			a = "1. ROLLBACK";
			b = "2. SET TRANSACTION READ ONLY";
			c = "3. COMMIT";
			d = "4. SAVEPOINT";
			System.out.println("Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = b;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set1Quetion6(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set1Quetion6(sc);
		}
	}
	
	public void L7set1Quetion7(Scanner sc){
		try 
		{
			L7Question = "In SQL, what does the SAVEPOINT statement do?";
			a = "1. Commits the transaction.";
			b = "2. Rolls back the transaction";
			c = "3. Sets a point to";
			d = "4. All the above";
			System.out.println("Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = b;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set1Quetion7(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set1Quetion7(sc);
		}
	}
	
	public void L7set1Quetion8(Scanner sc){
		try 
		{
			L7Question = "What does the COMMIT WORK statement do in SQL?";
			a = "1. Rolls back the transactio";
			b = "2. Commits the transaction";
			c = "3. Sets a savepoint";
			d = "4. Begins a new transaction";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = b;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set1Quetion8(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set1Quetion8(sc);
		}
	}
		
	public void L7set1Quetion9(Scanner sc){
		try 
		{
			L7Question = "The ROLLBACK TO SAVEPOINT statement can be used to roll back to any savepoint in a transaction.";
			a = "1. TRUE";
			b = "2. FALSE";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = d;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set1Quetion9(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set1Quetion9(sc);
		}
	}
	
	public void L7set1Quetion10(Scanner sc){
		try 
		{
			L7Question = "The ROLLBACK statement is used to permanently save changes made during a transaction.";
			a = "1. TRUE ";
			b = "2. FALSE";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = a;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set1Quetion10(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set1Quetion10(sc);
		}
	}
		
// ----------------------------------------------------------------------------------------------------------------------------------------
		// L7QuestionSet2
		
	public void L7set2Quetion1(Scanner sc){
		try 
		{
			L7Question = "What does the SQL COMMIT statement do?";
			a = "1. Saves all changes made during the current transaction";
			b = "2. Rolls back all changes made during the current transaction";
			c = "3. Removes a user from the database";
			d = "4. Grants privileges to a user";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = a;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set2Quetion1(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set2Quetion1(sc);
		}
	}
	
	
	public void L7set2Quetion2(Scanner sc){
		try 
		{
			L7Question = "In SQL, which statement is used to undo changes made during the current transaction?";
			a = "1. UNDO";
			b = "2. ROLLBACK";
			c = "3. DELETE";
			d = "4. CANCEL";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = b;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set2Quetion2(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set2Quetion2(sc);
		}
	}
	
	public void L7set2Quetion3(Scanner sc){
		try 
		{
			L7Question = "Write a query to revoke UPDATE privilege on the \"products\" table from the user 'analyst'.";
			a = "1. REVOKE UPDATE ON products TO analyst;";
			b = "2. REVOKE UPDATE ON products FROM analyst;";
			c = "3. REVOKE UPDATE TO products FROM analyst;";
			d = "4. REVOKE UPDATE FROM products TO analyst;";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = b;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set2Quetion3(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set2Quetion3(sc);
		}
	}
	
	public void L7set2Quetion4(Scanner sc){
		try 
		{
			L7Question = "Question: GIVE ACCESS TO UPDATE ON orders TO order_clerk;";
			a = "1. GRANT UPDATE ON orders ON order_clerk;";
			b = "2. ALLOW UPDATE ON orders TO order_clerk;";
			c = "3. GRANT UPDATE ON orders TO order_clerk";
			d = "4. ALLOW UPDATE ON orders ON order_clerk;";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = c;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set2Quetion4(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set2Quetion4(sc);
		}
		
	}	

	public void L7set2Quetion5(Scanner sc){
		try 
		{
			L7Question = "Question: What is the purpose of the SQL DROP USER statement?";
			a = "1. To delete a table";
			b = "2. To remove a user from a database";
			c = "3. To grant privileges to a user";
			d = "4.  To revoke privileges from a user";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = a;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set2Quetion5(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set2Quetion5(sc);
		}
		
	}	

	public void L7set2Quetion6(Scanner sc){
		try 
		{
			L7Question = "What does TCL stand for in SQL?";
			a = "1. Table Control Language";
			b = "2. Transaction Control Language";
			c = "3. Text Control Language";
			d = "4. Table Configuration Language";
			System.out.println("Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = b;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set2Quetion6(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set2Quetion6(sc);
		}
	}
	
	public void L7set2Quetion7(Scanner sc){
		try 
		{
			L7Question = "In SQL, what does the SAVEPOINT statement do?";
			a = "1. Marks the beginning of a new transaction";
			b = "2. Creates a temporary table";
			c = "3. Sets a point to which a transaction can be rolled back";
			d = "4. Grants privileges to a user";
			System.out.println("Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = b;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set2Quetion7(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set2Quetion7(sc);
		}
	}
	
	public void L7set2Quetion8(Scanner sc){
		try 
		{
			L7Question = "Which TCL statement in SQL is used to release all savepoints in a transaction?";
			a = "1. ROLLBACK";
			b = "2. RELEASE SAVEPOINT";
			c = "3. COMMIT";
			d = "4. SET TRANSACTION";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = a;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set2Quetion8(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set2Quetion8(sc);
		}
	}
		
	public void L7set2Quetion9(Scanner sc){
		try 
		{
			L7Question = "Write a query to roll back to the savepoint 'point1' in the current transaction;";
			a = "1. ROLLBACK FROM SAVEPOINT TO point1;";
			b = "2. ROLLBACK FROM SAVEPOINT point1; ";
			c = "3. ROLLBACK TO SAVEPOINT point1;";
			d = "4. all the above";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = c;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set2Quetion9(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set2Quetion9(sc);
		}
	}
	
	public void L7set2Quetion10(Scanner sc){
		try 
		{
			L7Question = "Write a query to set a savepoint named 'point2' after updating a record in the current transaction.";
			a = "1. UPDATE employees SET salary = salary * 1.10; SAVEPOINT point2;";
			b = "2. SAVES employees SET salary = salary * 1.10; SAVEPOINT point2;";
			c = "3. UPDATE employees SET salary = salary * 1.10 SAVEPOINT point2;";
			d = "4. UPDATE employees SET salary = salary * 1.10;";
			System.out.println("L7Question: "+L7Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L7ActualAnswer = a;
			System.out.println(L7ActualAnswer);
			if(input ==1) {
				L7UserAnswer = a;
			}
			else if(input ==2) {
				L7UserAnswer = b;
			}
			else if(input ==3) {
				L7UserAnswer = c;
			}
			else if(input ==4) {
				L7UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L7set2Quetion10(sc);
			}
			System.out.println(L7UserAnswer);
			if (this.L7ActualAnswer.equals(L7UserAnswer)) {
				System.out.println("Your answer is correct!");
				L7Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L7set2Quetion10(sc);
		}
	}	
	
	
	public void L7viewAnswers(Scanner sc) {
		try {
			if(Attempt==0) {
				System.out.println("You didn't play game yet!!!");
				System.out.println("Press 1 for Play Game");
				System.out.println("Press 2 for Go back to previous menu");
				System.out.println("Press 3 for Main Menu");
				int input = sc.nextInt();
				if(input ==1) {
					L7QuestionSet(sc);
				}
				else if(input ==2) {
					L7Menu(sc);
				}
				else if(input ==3) {
					mainMenu(sc);
				}
				else {
					System.err.println("Input is Incorrect!");
					L7viewAnswers(sc);
				}
				
			}
			
			else{
				System.out.println("=================================================================");
				System.out.println("1: "+L7Question1);
				System.out.println("Selected Answers: "+ L7UserAnswer1);
				System.out.println("Correct Answers: "+ L7ActualAnswer1);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("2: "+L7Question2);
				System.out.println("Selected Answers: "+ L7UserAnswer2);
				System.out.println("Correct Answers: "+ L7ActualAnswer2);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("3: "+L7Question3);
				System.out.println("Selected Answers: "+ L7UserAnswer3);
				System.out.println("Correct Answers: "+ L7ActualAnswer3);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("4: "+L7Question4);
				System.out.println("Selected Answers: "+ L7UserAnswer4);
				System.out.println("Correct Answers: "+ L7ActualAnswer4);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("5: "+L7Question5);
				System.out.println("Selected Answers: "+ L7UserAnswer5);
				System.out.println("Correct Answers: "+ L7ActualAnswer5);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("6: "+L7Question6);
				System.out.println("Selected Answers: "+ L7UserAnswer6);
				System.out.println("Correct Answers: "+ L7ActualAnswer6);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("7: "+L7Question7);
				System.out.println("Selected Answers: "+ L7UserAnswer7);
				System.out.println("Correct Answers: "+ L7ActualAnswer7);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("8: "+L7Question8);
				System.out.println("Selected Answers: "+ L7UserAnswer8);
				System.out.println("Correct Answers: "+ L7ActualAnswer8);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("9: "+L7Question9);
				System.out.println("Selected Answers: "+ L7UserAnswer9);
				System.out.println("Correct Answers: "+ L7ActualAnswer9);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("10: "+L7Question10);
				System.out.println("Selected Answers: "+ L7UserAnswer10);
				System.out.println("Correct Answers: "+ L7ActualAnswer10);
				System.out.println("=================================================================");
			}
		}
		catch (InputMismatchException ime) {
			System.out.println("something is wrong!");
			L7viewAnswers(sc);
		}
	}
	
	public void L7score(Scanner sc) {
		try {
			if(L7Marks ==0) {
				L7viewAnswers(sc);
			}
			else if(L7Marks>=5) {
				System.out.println("Congratulations, "+name);
				System.out.println("Congratulations, you completed the LeveL7");
				System.out.println("Your Score is "+ L7Marks+ "/10");
				System.out.println("1. Play Next Level");
				System.out.println("2. Play Again");
				System.out.println("3. View Answer");
				System.out.println("4. Go to Main Menu");
				int input = sc.nextInt();
				if(input ==1) {
				}
				else if(input ==1) {
					L7QuestionSet(sc);
				}
				else if(input ==2) {
					L7viewAnswers(sc);
				}
				else if(input ==4) {
					level(sc, CurrentLevel, L7Marks);
				}
				else {
					System.err.println("Incorrect Input");
					L7score(sc);
				}
			}
			else
			{
				
				System.out.println("Opps! "+ name);
				System.out.println("Your Failed to Complete!!!");
				System.out.println("your Score is "+ L7Marks+ "/10");
				if(L7Marks <5) {
					System.out.println("1. Play Again");
					System.out.println("2. View Answer");
					System.out.println("3. Go to Main Menu");
					int input = sc.nextInt();
					if(input ==1) {
						L7QuestionSet(sc);
					}
					else if(input ==2) {
						L7viewAnswers(sc);
					}
					else if(input ==3) {
						level(sc, CurrentLevel, L7Marks);
					}
					else {
						System.err.println("Incorrect Input");
						L7score(sc);
					}
				}
				else {
					System.out.println("1. Play next");
					System.out.println("2. Play Again");
					System.out.println("3. View Answer");
					System.out.println("4. Go to Main Menu");
					int input = sc.nextInt();
					if(input==1) {
						//It will directly go to next level 
					}
					else if(input ==2) {
						L7QuestionSet(sc);
					}
					else if(input ==3) {
						L7viewAnswers(sc);
					}
					else if(input ==4) {
						level(sc, CurrentLevel, L7Marks);
					}
					else {
						System.err.println("Incorrect input");
						L7score(sc);
					}
				}
			}
		}
		catch(InputMismatchException ime) {
			System.err.println("Something is wrong.");
			L7score(sc);
		}
	}
	public void L7Menu(Scanner sc) {
		this.CurrentLevel = "Level 7";
		System.out.println("Level 7");
		System.out.println("---------------");
		System.out.println("1. Play");
		System.out.println("2.Check your score");
		System.out.println("3. View your answers");
		int input = sc.nextInt();
		switch (input) {
		case 1: L7QuestionSet(sc);
			break;
		case 2: L7score(sc);
			break;
		case 3: L7viewAnswers(sc);
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}
}


