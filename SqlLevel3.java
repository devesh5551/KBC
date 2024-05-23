package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SqlLevel3 extends SqlLevel2 {
	
	int L3Marks=0;
	String L3Question1;
	String L3UserAnswer1;
	String L3ActualAnswer1;

	String L3Question2;
	String L3UserAnswer2;
	String L3ActualAnswer2;
	String L3Question3;
	String L3UserAnswer3;
	String L3ActualAnswer3;
	String L3Question4;
	String L3UserAnswer4;
	String L3ActualAnswer4;
	String L3Question5;
	String L3UserAnswer5;
	String L3ActualAnswer5;
	String L3Question6;
	String L3UserAnswer6;
	String L3ActualAnswer6;
	String L3Question7;
	String L3UserAnswer7;
	String L3ActualAnswer7;
	String L3Question8;
	String L3UserAnswer8;
	String L3ActualAnswer8;
	String L3Question9;
	String L3UserAnswer9;
	String L3ActualAnswer9;
	String L3Question10;
	String L3UserAnswer10;
	String L3ActualAnswer10;
	String L3Question ="";
	String a;
	String b;
	String c;
	String d;
	String L3UserAnswer;
	String L3ActualAnswer;
	int Attempt;
	
	public void L3QuestionSet(Scanner sc){
		if (Attempt ==0) 
		{
			Attempt++;
			L3Marks =0;
			L3set1Quetion1(sc);
			L3Question1 = L3Question;
			L3ActualAnswer1 = L3ActualAnswer;
			L3UserAnswer1 = L3UserAnswer;
			System.out.println(L3Marks);
			L3set1Quetion2(sc);
			L3Question2 = L3Question;
			L3ActualAnswer2 = L3ActualAnswer;
			L3UserAnswer2 = L3UserAnswer;
			L3set1Quetion3(sc);
			L3Question3 = L3Question;
			L3ActualAnswer3 = L3ActualAnswer;
			L3UserAnswer3 = L3UserAnswer;
			System.out.println(L3Marks);
			L3set1Quetion4(sc);
			L3Question4 = L3Question;
			L3ActualAnswer4 = L3ActualAnswer;
			L3UserAnswer4 = L3UserAnswer;
			System.out.println(L3Marks);
			L3set1Quetion5(sc);
			L3Question5 = L3Question;
			L3ActualAnswer5 = L3ActualAnswer;
			L3UserAnswer5 = L3UserAnswer;
			L3set1Quetion6(sc);
			L3Question6 = L3Question;
			L3ActualAnswer6 = L3ActualAnswer;
			L3UserAnswer6 = L3UserAnswer;
			L3set1Quetion7(sc);
			L3Question7 = L3Question;
			L3ActualAnswer7 = L3ActualAnswer;
			L3UserAnswer7 = L3UserAnswer;
			L3set1Quetion8(sc);
			L3Question8 = L3Question;
			L3ActualAnswer8 = L3ActualAnswer;
			L3UserAnswer8 = L3UserAnswer;
			L3set1Quetion9(sc);
			L3Question9 = L3Question;
			L3ActualAnswer9 = L3ActualAnswer;
			L3UserAnswer9 = L3UserAnswer;
			L3set1Quetion10(sc);
			L3Question10 = L3Question;
			L3ActualAnswer10 = L3ActualAnswer;
			L3UserAnswer10 = L3UserAnswer;
			
		}
		else if(Attempt ==1) 
		{
			Attempt++;
			L3Marks =0;
			L3set2Quetion1(sc);
			L3Question1 = L3Question;
			L3ActualAnswer1 = L3ActualAnswer;
			L3UserAnswer1 = L3UserAnswer;
			L3set2Quetion2(sc);
			L3Question2 = L3Question;
			L3ActualAnswer2 = L3ActualAnswer;
			L3UserAnswer2 = L3UserAnswer;
			L3set2Quetion3(sc);
			L3Question3 = L3Question;
			L3ActualAnswer3 = L3ActualAnswer;
			L3UserAnswer3 = L3UserAnswer;
			L3set2Quetion4(sc);
			L3Question4 = L3Question;
			L3ActualAnswer4 = L3ActualAnswer;
			L3UserAnswer4 = L3UserAnswer;
			L3set2Quetion5(sc);
			L3Question5 = L3Question;
			L3ActualAnswer5 = L3ActualAnswer;
			L3UserAnswer5 = L3UserAnswer;
			L3set2Quetion6(sc);
			L3Question6 = L3Question;
			L3ActualAnswer6 = L3ActualAnswer;
			L3UserAnswer6 = L3UserAnswer;
			L3set2Quetion7(sc);
			L3Question7 = L3Question;
			L3ActualAnswer7 = L3ActualAnswer;
			L3UserAnswer7 = L3UserAnswer;
			L3set2Quetion8(sc);
			L3Question8 = L3Question;
			L3ActualAnswer8 = L3ActualAnswer;
			L3UserAnswer8 = L3UserAnswer;
			L3set2Quetion9(sc);
			L3Question9 = L3Question;
			L3ActualAnswer9 = L3ActualAnswer;
			L3UserAnswer9 = L3UserAnswer;
			L3set2Quetion10(sc);
			L3Question10 = L3Question;
			L3ActualAnswer10 = L3ActualAnswer;
			L3UserAnswer10 = L3UserAnswer;	
		}
		L3Menu(sc);
		
	}
	public void L3set1Quetion1(Scanner sc){
		try 
		{
			L3Question = "What does DCL stand for in SQL?";
			a = "1. Data Collection Language";
			b = "2. Data Control Language";
			c = "3. Data Conversion Language";
			d = "4. Data Communication Language";
			System.out.println("Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = b;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set1Quetion1(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set1Quetion1(sc);
		}
	}
	
	public void L3set1Quetion2(Scanner sc){
		try 
		{
			L3Question = "Which statement is used to grant privileges in SQL?";
			a = "1. GRANT";
			b = "2. ALLOW";
			c = "3. GRANT TO";
			d = "4. PROVIDE";
			System.out.println("Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = a;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set1Quetion2(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set1Quetion2(sc);
		}
	}
	public void L3set1Quetion3(Scanner sc){
		try 
		{
			L3Question = "In SQL, which privilege allows a user to modify existing data in a table?";
			a = "1. INSERT";
			b = "2. UPDATE";
			c = "3. DELETE";
			d = "4. ALTER";
			System.out.println("Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = b;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set1Quetion3(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set1Quetion3(sc);
		}
	}
	
	public void L3set1Quetion4(Scanner sc){
		try 
		{
			L3Question = "Which SQL statement is used to remove a user from a database?";
			a = "1. REMOVE USER";
			b = "2. DELETE USER";
			c = "3. DROP USER";
			d = "4. REVOKE USER";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = d;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set1Quetion4(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set1Quetion4(sc);
		}
	}	
	
	public void L3set1Quetion5(Scanner sc){
		try 
		{
			L3Question = "Write a query to grant SELECT and INSERT privileges on the \"employees\" table to the user 'john'.";
			a = "1. GRANT SELECT, INSERT ON employees TO john;";
			b = "2. GRANT SELECT, INSERT FROM employees TO john;";
			c = "3. ALLLOW ACCESS SELECT, INSERT ON employees TO john;";
			d = "4. GRANT SELECT, INSERT ON employees TO john;";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = a;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set1Quetion5(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set1Quetion5(sc);
		}
	}
	
	public void L3set1Quetion6(Scanner sc){
		try 
		{
			L3Question = "Which of the following statements is used to set a transaction as read-only in SQL?";
			a = "1. ROLLBACK";
			b = "2. SET TRANSACTION READ ONLY";
			c = "3. COMMIT";
			d = "4. SAVEPOINT";
			System.out.println("Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = b;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set1Quetion6(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set1Quetion6(sc);
		}
	}
	
	public void L3set1Quetion7(Scanner sc){
		try 
		{
			L3Question = "In SQL, what does the SAVEPOINT statement do?";
			a = "1. Commits the transaction.";
			b = "2. Rolls back the transaction";
			c = "3. Sets a point to";
			d = "4. All the above";
			System.out.println("Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = b;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set1Quetion7(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set1Quetion7(sc);
		}
	}
	
	public void L3set1Quetion8(Scanner sc){
		try 
		{
			L3Question = "What does the COMMIT WORK statement do in SQL?";
			a = "1. Rolls back the transactio";
			b = "2. Commits the transaction";
			c = "3. Sets a savepoint";
			d = "4. Begins a new transaction";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = b;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set1Quetion8(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set1Quetion8(sc);
		}
	}
		
	public void L3set1Quetion9(Scanner sc){
		try 
		{
			L3Question = "The ROLLBACK TO SAVEPOINT statement can be used to roll back to any savepoint in a transaction.";
			a = "1. TRUE";
			b = "2. FALSE";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = d;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set1Quetion9(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set1Quetion9(sc);
		}
	}
	
	public void L3set1Quetion10(Scanner sc){
		try 
		{
			L3Question = "The ROLLBACK statement is used to permanently save changes made during a transaction.";
			a = "1. TRUE ";
			b = "2. FALSE";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = a;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set1Quetion10(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set1Quetion10(sc);
		}
	}
		
// ----------------------------------------------------------------------------------------------------------------------------------------
		// L3QuestionSet2
		
	public void L3set2Quetion1(Scanner sc){
		try 
		{
			L3Question = "What does the SQL COMMIT statement do?";
			a = "1. Saves all changes made during the current transaction";
			b = "2. Rolls back all changes made during the current transaction";
			c = "3. Removes a user from the database";
			d = "4. Grants privileges to a user";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = a;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set2Quetion1(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set2Quetion1(sc);
		}
	}
	
	
	public void L3set2Quetion2(Scanner sc){
		try 
		{
			L3Question = "In SQL, which statement is used to undo changes made during the current transaction?";
			a = "1. UNDO";
			b = "2. ROLLBACK";
			c = "3. DELETE";
			d = "4. CANCEL";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = b;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set2Quetion2(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set2Quetion2(sc);
		}
	}
	
	public void L3set2Quetion3(Scanner sc){
		try 
		{
			L3Question = "Write a query to revoke UPDATE privilege on the \"products\" table from the user 'analyst'.";
			a = "1. REVOKE UPDATE ON products TO analyst;";
			b = "2. REVOKE UPDATE ON products FROM analyst;";
			c = "3. REVOKE UPDATE TO products FROM analyst;";
			d = "4. REVOKE UPDATE FROM products TO analyst;";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = b;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set2Quetion3(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set2Quetion3(sc);
		}
	}
	
	public void L3set2Quetion4(Scanner sc){
		try 
		{
			L3Question = "Question: GIVE ACCESS TO UPDATE ON orders TO order_clerk;";
			a = "1. GRANT UPDATE ON orders ON order_clerk;";
			b = "2. ALLOW UPDATE ON orders TO order_clerk;";
			c = "3. GRANT UPDATE ON orders TO order_clerk";
			d = "4. ALLOW UPDATE ON orders ON order_clerk;";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = c;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set2Quetion4(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set2Quetion4(sc);
		}
		
	}	

	public void L3set2Quetion5(Scanner sc){
		try 
		{
			L3Question = "Question: What is the purpose of the SQL DROP USER statement?";
			a = "1. To delete a table";
			b = "2. To remove a user from a database";
			c = "3. To grant privileges to a user";
			d = "4.  To revoke privileges from a user";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = a;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set2Quetion5(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set2Quetion5(sc);
		}
		
	}	

	public void L3set2Quetion6(Scanner sc){
		try 
		{
			L3Question = "What does TCL stand for in SQL?";
			a = "1. Table Control Language";
			b = "2. Transaction Control Language";
			c = "3. Text Control Language";
			d = "4. Table Configuration Language";
			System.out.println("Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = b;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set2Quetion6(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set2Quetion6(sc);
		}
	}
	
	public void L3set2Quetion7(Scanner sc){
		try 
		{
			L3Question = "In SQL, what does the SAVEPOINT statement do?";
			a = "1. Marks the beginning of a new transaction";
			b = "2. Creates a temporary table";
			c = "3. Sets a point to which a transaction can be rolled back";
			d = "4. Grants privileges to a user";
			System.out.println("Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = b;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set2Quetion7(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set2Quetion7(sc);
		}
	}
	
	public void L3set2Quetion8(Scanner sc){
		try 
		{
			L3Question = "Which TCL statement in SQL is used to release all savepoints in a transaction?";
			a = "1. ROLLBACK";
			b = "2. RELEASE SAVEPOINT";
			c = "3. COMMIT";
			d = "4. SET TRANSACTION";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = a;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set2Quetion8(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set2Quetion8(sc);
		}
	}
		
	public void L3set2Quetion9(Scanner sc){
		try 
		{
			L3Question = "Write a query to roll back to the savepoint 'point1' in the current transaction;";
			a = "1. ROLLBACK FROM SAVEPOINT TO point1;";
			b = "2. ROLLBACK FROM SAVEPOINT point1; ";
			c = "3. ROLLBACK TO SAVEPOINT point1;";
			d = "4. all the above";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = c;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set2Quetion9(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set2Quetion9(sc);
		}
	}
	
	public void L3set2Quetion10(Scanner sc){
		try 
		{
			L3Question = "Write a query to set a savepoint named 'point2' after updating a record in the current transaction.";
			a = "1. UPDATE employees SET salary = salary * 1.10; SAVEPOINT point2;";
			b = "2. SAVES employees SET salary = salary * 1.10; SAVEPOINT point2;";
			c = "3. UPDATE employees SET salary = salary * 1.10 SAVEPOINT point2;";
			d = "4. UPDATE employees SET salary = salary * 1.10;";
			System.out.println("L3Question: "+L3Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L3ActualAnswer = a;
			System.out.println(L3ActualAnswer);
			if(input ==1) {
				L3UserAnswer = a;
			}
			else if(input ==2) {
				L3UserAnswer = b;
			}
			else if(input ==3) {
				L3UserAnswer = c;
			}
			else if(input ==4) {
				L3UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L3set2Quetion10(sc);
			}
			System.out.println(L3UserAnswer);
			if (this.L3ActualAnswer.equals(L3UserAnswer)) {
				System.out.println("Your answer is correct!");
				L3Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L3set2Quetion10(sc);
		}
	}	
	
	
	public void L3viewAnswers(Scanner sc) {
		try {
			if(Attempt==0) {
				System.out.println("You didn't play game yet!!!");
				System.out.println("Press 1 for Play Game");
				System.out.println("Press 2 for Go back to previous menu");
				System.out.println("Press 3 for Main Menu");
				int input = sc.nextInt();
				if(input ==1) {
					L3QuestionSet(sc);
				}
				else if(input ==2) {
					L3Menu(sc);
				}
				else if(input ==3) {
					mainMenu(sc);
				}
				else {
					System.err.println("Input is Incorrect!");
					L3viewAnswers(sc);
				}
				
			}
			
			else{
				System.out.println("=================================================================");
				System.out.println("1: "+L3Question1);
				System.out.println("Selected Answers: "+ L3UserAnswer1);
				System.out.println("Correct Answers: "+ L3ActualAnswer1);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("2: "+L3Question2);
				System.out.println("Selected Answers: "+ L3UserAnswer2);
				System.out.println("Correct Answers: "+ L3ActualAnswer2);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("3: "+L3Question3);
				System.out.println("Selected Answers: "+ L3UserAnswer3);
				System.out.println("Correct Answers: "+ L3ActualAnswer3);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("4: "+L3Question4);
				System.out.println("Selected Answers: "+ L3UserAnswer4);
				System.out.println("Correct Answers: "+ L3ActualAnswer4);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("5: "+L3Question5);
				System.out.println("Selected Answers: "+ L3UserAnswer5);
				System.out.println("Correct Answers: "+ L3ActualAnswer5);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("6: "+L3Question6);
				System.out.println("Selected Answers: "+ L3UserAnswer6);
				System.out.println("Correct Answers: "+ L3ActualAnswer6);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("7: "+L3Question7);
				System.out.println("Selected Answers: "+ L3UserAnswer7);
				System.out.println("Correct Answers: "+ L3ActualAnswer7);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("8: "+L3Question8);
				System.out.println("Selected Answers: "+ L3UserAnswer8);
				System.out.println("Correct Answers: "+ L3ActualAnswer8);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("9: "+L3Question9);
				System.out.println("Selected Answers: "+ L3UserAnswer9);
				System.out.println("Correct Answers: "+ L3ActualAnswer9);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("10: "+L3Question10);
				System.out.println("Selected Answers: "+ L3UserAnswer10);
				System.out.println("Correct Answers: "+ L3ActualAnswer10);
				System.out.println("=================================================================");
			}
		}
		catch (InputMismatchException ime) {
			System.out.println("something is wrong!");
			L3viewAnswers(sc);
		}
	}
	
	public void L3score(Scanner sc) {
		try {
			if(L3Marks ==0) {
				L3viewAnswers(sc);
			}
			else if(L3Marks>=5) {
				System.out.println("Congratulations, "+name);
				System.out.println("Congratulations, you completed the LeveL3");
				System.out.println("Your Score is "+ L3Marks+ "/10");
				System.out.println("1. Play Next Level");
				System.out.println("2. Play Again");
				System.out.println("3. View Answer");
				System.out.println("4. Go to Main Menu");
				int input = sc.nextInt();
				if(input ==1) {
				}
				else if(input ==1) {
					L3QuestionSet(sc);
				}
				else if(input ==2) {
					L3viewAnswers(sc);
				}
				else if(input ==4) {
					level(sc, CurrentLevel, L3Marks);
				}
				else {
					System.err.println("Incorrect Input");
					L3score(sc);
				}
			}
			else
			{
				
				System.out.println("Opps! "+ name);
				System.out.println("Your Failed to Complete!!!");
				System.out.println("your Score is "+ L3Marks+ "/10");
				if(L3Marks <5) {
					System.out.println("1. Play Again");
					System.out.println("2. View Answer");
					System.out.println("3. Go to Main Menu");
					int input = sc.nextInt();
					if(input ==1) {
						L3QuestionSet(sc);
					}
					else if(input ==2) {
						L3viewAnswers(sc);
					}
					else if(input ==3) {
						level(sc, CurrentLevel, L3Marks);
					}
					else {
						System.err.println("Incorrect Input");
						L3score(sc);
					}
				}
				else {
					System.out.println("1. Play next");
					System.out.println("2. Play Again");
					System.out.println("3. View Answer");
					System.out.println("4. Go to Main Menu");
					int input = sc.nextInt();
					if(input==1) {
						
					}
					else if(input ==2) {
						L3QuestionSet(sc);
					}
					else if(input ==3) {
						L3viewAnswers(sc);
					}
					else if(input ==4) {
						level(sc, CurrentLevel, L3Marks);
					}
					else {
						System.err.println("Incorrect input");
						L3score(sc);
					}
				}
			}
		}
		catch(InputMismatchException ime) {
			System.err.println("Something is wrong.");
			L3score(sc);
		}
	}
	public void L3Menu(Scanner sc) {
		this.CurrentLevel = "Level 3";
		System.out.println("Level 3");
		System.out.println("---------------");
		System.out.println("1. Play");
		System.out.println("2.Check your score");
		System.out.println("3. View your answers");
		int input = sc.nextInt();
		switch (input) {
		case 1: L3QuestionSet(sc);
			break;
		case 2: L3score(sc);
			break;
		case 3: L3viewAnswers(sc);
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}
}


