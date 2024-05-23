package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SqlLevel8 extends SqlLevel7{
	
	int L8Marks=0;
	String L8Question1;
	String L8UserAnswer1;
	String L8ActualAnswer1;
	String L8Question2;
	String L8UserAnswer2;
	String L8ActualAnswer2;
	String L8Question3;
	String L8UserAnswer3;
	String L8ActualAnswer3;
	String L8Question4;
	String L8UserAnswer4;
	String L8ActualAnswer4;
	String L8Question5;
	String L8UserAnswer5;
	String L8ActualAnswer5;
	String L8Question6;
	String L8UserAnswer6;
	String L8ActualAnswer6;
	String L8Question7;
	String L8UserAnswer7;
	String L8ActualAnswer7;
	String L8Question8;
	String L8UserAnswer8;
	String L8ActualAnswer8;
	String L8Question9;
	String L8UserAnswer9;
	String L8ActualAnswer9;
	String L8Question10;
	String L8UserAnswer10;
	String L8ActualAnswer10;
	String L8Question ="";
	String a;
	String b;
	String c;
	String d;
	String L8UserAnswer;
	String L8ActualAnswer;
	int Attempt;
	
	public void L8QuestionSet(Scanner sc){
		if (Attempt ==0) 
		{
			Attempt++;
			L8Marks =0;
			L8set1Quetion1(sc);
			L8Question1 = L8Question;
			L8ActualAnswer1 = L8ActualAnswer;
			L8UserAnswer1 = L8UserAnswer;
			System.out.println(L8Marks);
			L8set1Quetion2(sc);
			L8Question2 = L8Question;
			L8ActualAnswer2 = L8ActualAnswer;
			L8UserAnswer2 = L8UserAnswer;
			L8set1Quetion3(sc);
			L8Question3 = L8Question;
			L8ActualAnswer3 = L8ActualAnswer;
			L8UserAnswer3 = L8UserAnswer;
			System.out.println(L8Marks);
			L8set1Quetion4(sc);
			L8Question4 = L8Question;
			L8ActualAnswer4 = L8ActualAnswer;
			L8UserAnswer4 = L8UserAnswer;
			System.out.println(L8Marks);
			L8set1Quetion5(sc);
			L8Question5 = L8Question;
			L8ActualAnswer5 = L8ActualAnswer;
			L8UserAnswer5 = L8UserAnswer;
			L8set1Quetion6(sc);
			L8Question6 = L8Question;
			L8ActualAnswer6 = L8ActualAnswer;
			L8UserAnswer6 = L8UserAnswer;
			L8set1Quetion7(sc);
			L8Question7 = L8Question;
			L8ActualAnswer7 = L8ActualAnswer;
			L8UserAnswer7 = L8UserAnswer;
			L8set1Quetion8(sc);
			L8Question8 = L8Question;
			L8ActualAnswer8 = L8ActualAnswer;
			L8UserAnswer8 = L8UserAnswer;
			L8set1Quetion9(sc);
			L8Question9 = L8Question;
			L8ActualAnswer9 = L8ActualAnswer;
			L8UserAnswer9 = L8UserAnswer;
			L8set1Quetion10(sc);
			L8Question10 = L8Question;
			L8ActualAnswer10 = L8ActualAnswer;
			L8UserAnswer10 = L8UserAnswer;
			
		}
		else if(Attempt ==1) 
		{
			Attempt++;
			L8Marks =0;
			L8set2Quetion1(sc);
			L8Question1 = L8Question;
			L8ActualAnswer1 = L8ActualAnswer;
			L8UserAnswer1 = L8UserAnswer;
			L8set2Quetion2(sc);
			L8Question2 = L8Question;
			L8ActualAnswer2 = L8ActualAnswer;
			L8UserAnswer2 = L8UserAnswer;
			L8set2Quetion3(sc);
			L8Question3 = L8Question;
			L8ActualAnswer3 = L8ActualAnswer;
			L8UserAnswer3 = L8UserAnswer;
			L8set2Quetion4(sc);
			L8Question4 = L8Question;
			L8ActualAnswer4 = L8ActualAnswer;
			L8UserAnswer4 = L8UserAnswer;
			L8set2Quetion5(sc);
			L8Question5 = L8Question;
			L8ActualAnswer5 = L8ActualAnswer;
			L8UserAnswer5 = L8UserAnswer;
			L8set2Quetion6(sc);
			L8Question6 = L8Question;
			L8ActualAnswer6 = L8ActualAnswer;
			L8UserAnswer6 = L8UserAnswer;
			L8set2Quetion7(sc);
			L8Question7 = L8Question;
			L8ActualAnswer7 = L8ActualAnswer;
			L8UserAnswer7 = L8UserAnswer;
			L8set2Quetion8(sc);
			L8Question8 = L8Question;
			L8ActualAnswer8 = L8ActualAnswer;
			L8UserAnswer8 = L8UserAnswer;
			L8set2Quetion9(sc);
			L8Question9 = L8Question;
			L8ActualAnswer9 = L8ActualAnswer;
			L8UserAnswer9 = L8UserAnswer;
			L8set2Quetion10(sc);
			L8Question10 = L8Question;
			L8ActualAnswer10 = L8ActualAnswer;
			L8UserAnswer10 = L8UserAnswer;	
		}
		L8Menu(sc);
		
	}
	public void L8set1Quetion1(Scanner sc){
		try 
		{
			L8Question = "What does DCL stand for in SQL?";
			a = "1. Data Collection Language";
			b = "2. Data Control Language";
			c = "3. Data Conversion Language";
			d = "4. Data Communication Language";
			System.out.println("Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = b;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set1Quetion1(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set1Quetion1(sc);
		}
	}
	
	public void L8set1Quetion2(Scanner sc){
		try 
		{
			L8Question = "Which statement is used to grant privileges in SQL?";
			a = "1. GRANT";
			b = "2. ALLOW";
			c = "3. GRANT TO";
			d = "4. PROVIDE";
			System.out.println("Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = a;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set1Quetion2(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set1Quetion2(sc);
		}
	}
	public void L8set1Quetion3(Scanner sc){
		try 
		{
			L8Question = "In SQL, which privilege allows a user to modify existing data in a table?";
			a = "1. INSERT";
			b = "2. UPDATE";
			c = "3. DELETE";
			d = "4. ALTER";
			System.out.println("Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = b;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set1Quetion3(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set1Quetion3(sc);
		}
	}
	
	public void L8set1Quetion4(Scanner sc){
		try 
		{
			L8Question = "Which SQL statement is used to remove a user from a database?";
			a = "1. REMOVE USER";
			b = "2. DELETE USER";
			c = "3. DROP USER";
			d = "4. REVOKE USER";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = d;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set1Quetion4(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set1Quetion4(sc);
		}
	}	
	
	public void L8set1Quetion5(Scanner sc){
		try 
		{
			L8Question = "Write a query to grant SELECT and INSERT privileges on the \"employees\" table to the user 'john'.";
			a = "1. GRANT SELECT, INSERT ON employees TO john;";
			b = "2. GRANT SELECT, INSERT FROM employees TO john;";
			c = "3. ALLLOW ACCESS SELECT, INSERT ON employees TO john;";
			d = "4. GRANT SELECT, INSERT ON employees TO john;";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = a;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set1Quetion5(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set1Quetion5(sc);
		}
	}
	
	public void L8set1Quetion6(Scanner sc){
		try 
		{
			L8Question = "Which of the following statements is used to set a transaction as read-only in SQL?";
			a = "1. ROLLBACK";
			b = "2. SET TRANSACTION READ ONLY";
			c = "3. COMMIT";
			d = "4. SAVEPOINT";
			System.out.println("Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = b;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set1Quetion6(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set1Quetion6(sc);
		}
	}
	
	public void L8set1Quetion7(Scanner sc){
		try 
		{
			L8Question = "In SQL, what does the SAVEPOINT statement do?";
			a = "1. Commits the transaction.";
			b = "2. Rolls back the transaction";
			c = "3. Sets a point to";
			d = "4. All the above";
			System.out.println("Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = b;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set1Quetion7(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set1Quetion7(sc);
		}
	}
	
	public void L8set1Quetion8(Scanner sc){
		try 
		{
			L8Question = "What does the COMMIT WORK statement do in SQL?";
			a = "1. Rolls back the transactio";
			b = "2. Commits the transaction";
			c = "3. Sets a savepoint";
			d = "4. Begins a new transaction";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = b;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set1Quetion8(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set1Quetion8(sc);
		}
	}
		
	public void L8set1Quetion9(Scanner sc){
		try 
		{
			L8Question = "The ROLLBACK TO SAVEPOINT statement can be used to roll back to any savepoint in a transaction.";
			a = "1. TRUE";
			b = "2. FALSE";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = d;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set1Quetion9(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set1Quetion9(sc);
		}
	}
	
	public void L8set1Quetion10(Scanner sc){
		try 
		{
			L8Question = "The ROLLBACK statement is used to permanently save changes made during a transaction.";
			a = "1. TRUE ";
			b = "2. FALSE";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = a;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set1Quetion10(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set1Quetion10(sc);
		}
	}
		
// ----------------------------------------------------------------------------------------------------------------------------------------
		// L8QuestionSet2
		
	public void L8set2Quetion1(Scanner sc){
		try 
		{
			L8Question = "What does the SQL COMMIT statement do?";
			a = "1. Saves all changes made during the current transaction";
			b = "2. Rolls back all changes made during the current transaction";
			c = "3. Removes a user from the database";
			d = "4. Grants privileges to a user";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = a;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set2Quetion1(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set2Quetion1(sc);
		}
	}
	
	
	public void L8set2Quetion2(Scanner sc){
		try 
		{
			L8Question = "In SQL, which statement is used to undo changes made during the current transaction?";
			a = "1. UNDO";
			b = "2. ROLLBACK";
			c = "3. DELETE";
			d = "4. CANCEL";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = b;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set2Quetion2(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set2Quetion2(sc);
		}
	}
	
	public void L8set2Quetion3(Scanner sc){
		try 
		{
			L8Question = "Write a query to revoke UPDATE privilege on the \"products\" table from the user 'analyst'.";
			a = "1. REVOKE UPDATE ON products TO analyst;";
			b = "2. REVOKE UPDATE ON products FROM analyst;";
			c = "3. REVOKE UPDATE TO products FROM analyst;";
			d = "4. REVOKE UPDATE FROM products TO analyst;";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = b;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set2Quetion3(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set2Quetion3(sc);
		}
	}
	
	public void L8set2Quetion4(Scanner sc){
		try 
		{
			L8Question = "Question: GIVE ACCESS TO UPDATE ON orders TO order_clerk;";
			a = "1. GRANT UPDATE ON orders ON order_clerk;";
			b = "2. ALLOW UPDATE ON orders TO order_clerk;";
			c = "3. GRANT UPDATE ON orders TO order_clerk";
			d = "4. ALLOW UPDATE ON orders ON order_clerk;";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = c;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set2Quetion4(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set2Quetion4(sc);
		}
		
	}	

	public void L8set2Quetion5(Scanner sc){
		try 
		{
			L8Question = "Question: What is the purpose of the SQL DROP USER statement?";
			a = "1. To delete a table";
			b = "2. To remove a user from a database";
			c = "3. To grant privileges to a user";
			d = "4.  To revoke privileges from a user";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = a;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set2Quetion5(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set2Quetion5(sc);
		}
		
	}	

	public void L8set2Quetion6(Scanner sc){
		try 
		{
			L8Question = "What does TCL stand for in SQL?";
			a = "1. Table Control Language";
			b = "2. Transaction Control Language";
			c = "3. Text Control Language";
			d = "4. Table Configuration Language";
			System.out.println("Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = b;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set2Quetion6(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set2Quetion6(sc);
		}
	}
	
	public void L8set2Quetion7(Scanner sc){
		try 
		{
			L8Question = "In SQL, what does the SAVEPOINT statement do?";
			a = "1. Marks the beginning of a new transaction";
			b = "2. Creates a temporary table";
			c = "3. Sets a point to which a transaction can be rolled back";
			d = "4. Grants privileges to a user";
			System.out.println("Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = b;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set2Quetion7(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set2Quetion7(sc);
		}
	}
	
	public void L8set2Quetion8(Scanner sc){
		try 
		{
			L8Question = "Which TCL statement in SQL is used to release all savepoints in a transaction?";
			a = "1. ROLLBACK";
			b = "2. RELEASE SAVEPOINT";
			c = "3. COMMIT";
			d = "4. SET TRANSACTION";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = a;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set2Quetion8(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set2Quetion8(sc);
		}
	}
		
	public void L8set2Quetion9(Scanner sc){
		try 
		{
			L8Question = "Write a query to roll back to the savepoint 'point1' in the current transaction;";
			a = "1. ROLLBACK FROM SAVEPOINT TO point1;";
			b = "2. ROLLBACK FROM SAVEPOINT point1; ";
			c = "3. ROLLBACK TO SAVEPOINT point1;";
			d = "4. all the above";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = c;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set2Quetion9(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set2Quetion9(sc);
		}
	}
	
	public void L8set2Quetion10(Scanner sc){
		try 
		{
			L8Question = "Write a query to set a savepoint named 'point2' after updating a record in the current transaction.";
			a = "1. UPDATE employees SET salary = salary * 1.10; SAVEPOINT point2;";
			b = "2. SAVES employees SET salary = salary * 1.10; SAVEPOINT point2;";
			c = "3. UPDATE employees SET salary = salary * 1.10 SAVEPOINT point2;";
			d = "4. UPDATE employees SET salary = salary * 1.10;";
			System.out.println("L8Question: "+L8Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			int input = sc.nextInt();
			this.L8ActualAnswer = a;
			System.out.println(L8ActualAnswer);
			if(input ==1) {
				L8UserAnswer = a;
			}
			else if(input ==2) {
				L8UserAnswer = b;
			}
			else if(input ==3) {
				L8UserAnswer = c;
			}
			else if(input ==4) {
				L8UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L8set2Quetion10(sc);
			}
			System.out.println(L8UserAnswer);
			if (this.L8ActualAnswer.equals(L8UserAnswer)) {
				System.out.println("Your answer is correct!");
				L8Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L8set2Quetion10(sc);
		}
	}	
	
	
	public void L8viewAnswers(Scanner sc) {
		try {
			if(Attempt==0) {
				System.out.println("You didn't play game yet!!!");
				System.out.println("Press 1 for Play Game");
				System.out.println("Press 2 for Go back to previous menu");
				System.out.println("Press 3 for Main Menu");
				int input = sc.nextInt();
				if(input ==1) {
					L8QuestionSet(sc);
				}
				else if(input ==2) {
					L8Menu(sc);
				}
				else if(input ==3) {
					mainMenu(sc);
				}
				else {
					System.err.println("Input is Incorrect!");
					L8viewAnswers(sc);
				}
				
			}
			
			else{
				System.out.println("=================================================================");
				System.out.println("1: "+L8Question1);
				System.out.println("Selected Answers: "+ L8UserAnswer1);
				System.out.println("Correct Answers: "+ L8ActualAnswer1);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("2: "+L8Question2);
				System.out.println("Selected Answers: "+ L8UserAnswer2);
				System.out.println("Correct Answers: "+ L8ActualAnswer2);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("3: "+L8Question3);
				System.out.println("Selected Answers: "+ L8UserAnswer3);
				System.out.println("Correct Answers: "+ L8ActualAnswer3);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("4: "+L8Question4);
				System.out.println("Selected Answers: "+ L8UserAnswer4);
				System.out.println("Correct Answers: "+ L8ActualAnswer4);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("5: "+L8Question5);
				System.out.println("Selected Answers: "+ L8UserAnswer5);
				System.out.println("Correct Answers: "+ L8ActualAnswer5);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("6: "+L8Question6);
				System.out.println("Selected Answers: "+ L8UserAnswer6);
				System.out.println("Correct Answers: "+ L8ActualAnswer6);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("7: "+L8Question7);
				System.out.println("Selected Answers: "+ L8UserAnswer7);
				System.out.println("Correct Answers: "+ L8ActualAnswer7);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("8: "+L8Question8);
				System.out.println("Selected Answers: "+ L8UserAnswer8);
				System.out.println("Correct Answers: "+ L8ActualAnswer8);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("9: "+L8Question9);
				System.out.println("Selected Answers: "+ L8UserAnswer9);
				System.out.println("Correct Answers: "+ L8ActualAnswer9);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("10: "+L8Question10);
				System.out.println("Selected Answers: "+ L8UserAnswer10);
				System.out.println("Correct Answers: "+ L8ActualAnswer10);
				System.out.println("=================================================================");
			}
		}
		catch (InputMismatchException ime) {
			System.out.println("something is wrong!");
			L8viewAnswers(sc);
		}
	}
	
	public void L8score(Scanner sc) {
		try {
			if(L8Marks ==0) {
				L8viewAnswers(sc);
			}
			else if(L8Marks>=5) {
				System.out.println("Congratulations, "+name);
				System.out.println("Congratulations, you completed the LeveL8");
				System.out.println("Your Score is "+ L8Marks+ "/10");
				System.out.println("1. Play Next Level");
				System.out.println("2. Play Again");
				System.out.println("3. View Answer");
				System.out.println("4. Go to Main Menu");
				int input = sc.nextInt();
				if(input ==1) {
				}
				else if(input ==1) {
					L8QuestionSet(sc);
				}
				else if(input ==2) {
					L8viewAnswers(sc);
				}
				else if(input ==4) {
					level(sc, CurrentLevel, L8Marks);
				}
				else {
					System.err.println("Incorrect Input");
					L8score(sc);
				}
			}
			else
			{
				
				System.out.println("Opps! "+ name);
				System.out.println("Your Failed to Complete!!!");
				System.out.println("your Score is "+ L8Marks+ "/10");
				if(L8Marks <5) {
					System.out.println("1. Play Again");
					System.out.println("2. View Answer");
					System.out.println("3. Go to Main Menu");
					int input = sc.nextInt();
					if(input ==1) {
						L8QuestionSet(sc);
					}
					else if(input ==2) {
						L8viewAnswers(sc);
					}
					else if(input ==3) {
						level(sc, CurrentLevel, L8Marks);
					}
					else {
						System.err.println("Incorrect Input");
						L8score(sc);
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
						L8QuestionSet(sc);
					}
					else if(input ==3) {
						L8viewAnswers(sc);
					}
					else if(input ==4) {
						level(sc, CurrentLevel, L8Marks);
					}
					else {
						System.err.println("Incorrect input");
						L8score(sc);
					}
				}
			}
		}
		catch(InputMismatchException ime) {
			System.err.println("Something is wrong.");
			L8score(sc);
		}
	}
	public void L8Menu(Scanner sc) {
		this.CurrentLevel = "Level 8";
		System.out.println("Level 8");
		System.out.println("---------------");
		System.out.println("1. Play");
		System.out.println("2.Check your score");
		System.out.println("3. View your answers");
		int input = sc.nextInt();
		switch (input) {
		case 1: L8QuestionSet(sc);
			break;
		case 2: L8score(sc);
			break;
		case 3: L8viewAnswers(sc);
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}
}


