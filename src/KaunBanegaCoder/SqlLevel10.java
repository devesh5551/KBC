package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SqlLevel10 extends SqlLevel9{
	
	int L10Marks=0;
	String L10Question1;
	String L10UserAnswer1;
	String L10ActualAnswer1;
	String L10Question2;
	String L10UserAnswer2;
	String L10ActualAnswer2;
	String L10Question3;
	String L10UserAnswer3;
	String L10ActualAnswer3;
	String L10Question4;
	String L10UserAnswer4;
	String L10ActualAnswer4;
	String L10Question5;
	String L10UserAnswer5;
	String L10ActualAnswer5;
	String L10Question6;
	String L10UserAnswer6;
	String L10ActualAnswer6;
	String L10Question7;
	String L10UserAnswer7;
	String L10ActualAnswer7;
	String L10Question8;
	String L10UserAnswer8;
	String L10ActualAnswer8;
	String L10Question9;
	String L10UserAnswer9;
	String L10ActualAnswer9;
	String L10Question10;
	String L10UserAnswer10;
	String L10ActualAnswer10;
	String L10Question ="";
	String a;
	String b;
	String c;
	String d;
	String L10UserAnswer;
	String L10ActualAnswer;
	int Attempt;
	
	public void L10QuestionSet(Scanner sc){
		if (Attempt ==0) 
		{
			Attempt++;
			L10Marks =0;
			L10set1Quetion1(sc);
			L10Question1 = L10Question;
			L10ActualAnswer1 = L10ActualAnswer;
			L10UserAnswer1 = L10UserAnswer;
			System.out.println(L10Marks);
			L10set1Quetion2(sc);
			L10Question2 = L10Question;
			L10ActualAnswer2 = L10ActualAnswer;
			L10UserAnswer2 = L10UserAnswer;
			L10set1Quetion3(sc);
			L10Question3 = L10Question;
			L10ActualAnswer3 = L10ActualAnswer;
			L10UserAnswer3 = L10UserAnswer;
			System.out.println(L10Marks);
			L10set1Quetion4(sc);
			L10Question4 = L10Question;
			L10ActualAnswer4 = L10ActualAnswer;
			L10UserAnswer4 = L10UserAnswer;
			System.out.println(L10Marks);
			L10set1Quetion5(sc);
			L10Question5 = L10Question;
			L10ActualAnswer5 = L10ActualAnswer;
			L10UserAnswer5 = L10UserAnswer;
			L10set1Quetion6(sc);
			L10Question6 = L10Question;
			L10ActualAnswer6 = L10ActualAnswer;
			L10UserAnswer6 = L10UserAnswer;
			L10set1Quetion7(sc);
			L10Question7 = L10Question;
			L10ActualAnswer7 = L10ActualAnswer;
			L10UserAnswer7 = L10UserAnswer;
			L10set1Quetion8(sc);
			L10Question8 = L10Question;
			L10ActualAnswer8 = L10ActualAnswer;
			L10UserAnswer8 = L10UserAnswer;
			L10set1Quetion9(sc);
			L10Question9 = L10Question;
			L10ActualAnswer9 = L10ActualAnswer;
			L10UserAnswer9 = L10UserAnswer;
			L10set1Quetion10(sc);
			L10Question10 = L10Question;
			L10ActualAnswer10 = L10ActualAnswer;
			L10UserAnswer10 = L10UserAnswer;
			
		}
		else if(Attempt ==1) 
		{
			Attempt++;
			L10Marks =0;
			L10set2Quetion1(sc);
			L10Question1 = L10Question;
			L10ActualAnswer1 = L10ActualAnswer;
			L10UserAnswer1 = L10UserAnswer;
			L10set2Quetion2(sc);
			L10Question2 = L10Question;
			L10ActualAnswer2 = L10ActualAnswer;
			L10UserAnswer2 = L10UserAnswer;
			L10set2Quetion3(sc);
			L10Question3 = L10Question;
			L10ActualAnswer3 = L10ActualAnswer;
			L10UserAnswer3 = L10UserAnswer;
			L10set2Quetion4(sc);
			L10Question4 = L10Question;
			L10ActualAnswer4 = L10ActualAnswer;
			L10UserAnswer4 = L10UserAnswer;
			L10set2Quetion5(sc);
			L10Question5 = L10Question;
			L10ActualAnswer5 = L10ActualAnswer;
			L10UserAnswer5 = L10UserAnswer;
			L10set2Quetion6(sc);
			L10Question6 = L10Question;
			L10ActualAnswer6 = L10ActualAnswer;
			L10UserAnswer6 = L10UserAnswer;
			L10set2Quetion7(sc);
			L10Question7 = L10Question;
			L10ActualAnswer7 = L10ActualAnswer;
			L10UserAnswer7 = L10UserAnswer;
			L10set2Quetion8(sc);
			L10Question8 = L10Question;
			L10ActualAnswer8 = L10ActualAnswer;
			L10UserAnswer8 = L10UserAnswer;
			L10set2Quetion9(sc);
			L10Question9 = L10Question;
			L10ActualAnswer9 = L10ActualAnswer;
			L10UserAnswer9 = L10UserAnswer;
			L10set2Quetion10(sc);
			L10Question10 = L10Question;
			L10ActualAnswer10 = L10ActualAnswer;
			L10UserAnswer10 = L10UserAnswer;	
		}
		L10Menu(sc);
		
	}
	public void L10set1Quetion1(Scanner sc){
		try 
		{
			L10Question = "What does DCL stand for in SQL?";
			a = "a.  Data Collection Language";
			b = "b.  Data Control Language";
			c = "c.  Data Conversion Language";
			d = "d.  Data Communication Language";
			System.out.println("Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = b;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set1Quetion1(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set1Quetion1(sc);
		}
	}
	
	public void L10set1Quetion2(Scanner sc){
		try 
		{
			L10Question = "Which statement is used to grant privileges in SQL?";
			a = "a.  GRANT";
			b = "b.  ALLOW";
			c = "c.  GRANT TO";
			d = "d.  PROVIDE";
			System.out.println("Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = a;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set1Quetion2(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set1Quetion2(sc);
		}
	}
	public void L10set1Quetion3(Scanner sc){
		try 
		{
			L10Question = "In SQL, which privilege allows a user to modify existing data in a table?";
			a = "a.  INSERT";
			b = "b.  UPDATE";
			c = "c.  DELETE";
			d = "d.  ALTER";
			System.out.println("Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = b;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set1Quetion3(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set1Quetion3(sc);
		}
	}
	
	public void L10set1Quetion4(Scanner sc){
		try 
		{
			L10Question = "Which SQL statement is used to remove a user from a database?";
			a = "a.  REMOVE USER";
			b = "b.  DELETE USER";
			c = "c.  DROP USER";
			d = "d.  REVOKE USER";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = d;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set1Quetion4(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set1Quetion4(sc);
		}
	}	
	
	public void L10set1Quetion5(Scanner sc){
		try 
		{
			L10Question = "Write a query to grant SELECT and INSERT privileges on the \"employees\" table to the user 'john'.";
			a = "a.  GRANT SELECT, INSERT ON employees TO john;";
			b = "b.  GRANT SELECT, INSERT FROM employees TO john;";
			c = "c.  ALLLOW ACCESS SELECT, INSERT ON employees TO john;";
			d = "d.  GRANT SELECT, INSERT ON employees TO john;";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = a;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set1Quetion5(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set1Quetion5(sc);
		}
	}
	
	public void L10set1Quetion6(Scanner sc){
		try 
		{
			L10Question = "Which of the following statements is used to set a transaction as read-only in SQL?";
			a = "a.  ROLLBACK";
			b = "b.  SET TRANSACTION READ ONLY";
			c = "c.  COMMIT";
			d = "d.  SAVEPOINT";
			System.out.println("Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = b;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set1Quetion6(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set1Quetion6(sc);
		}
	}
	
	public void L10set1Quetion7(Scanner sc){
		try 
		{
			L10Question = "In SQL, what does the SAVEPOINT statement do?";
			a = "a.  Commits the transaction.";
			b = "b.  Rolls back the transaction";
			c = "c.  Sets a point to";
			d = "d.  All the above";
			System.out.println("Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = b;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set1Quetion7(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set1Quetion7(sc);
		}
	}
	
	public void L10set1Quetion8(Scanner sc){
		try 
		{
			L10Question = "What does the COMMIT WORK statement do in SQL?";
			a = "a.  Rolls back the transactio";
			b = "b.  Commits the transaction";
			c = "c.  Sets a savepoint";
			d = "d.  Begins a new transaction";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = b;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set1Quetion8(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set1Quetion8(sc);
		}
	}
		
	public void L10set1Quetion9(Scanner sc){
		try 
		{
			L10Question = "The ROLLBACK TO SAVEPOINT statement can be used to roll back to any savepoint in a transaction.";
			a = "a.  TRUE";
			b = "b.  FALSE";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = d;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set1Quetion9(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set1Quetion9(sc);
		}
	}
	
	public void L10set1Quetion10(Scanner sc){
		try 
		{
			L10Question = "The ROLLBACK statement is used to permanently save changes made during a transaction.";
			a = "a.  TRUE ";
			b = "b.  FALSE";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = a;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set1Quetion10(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set1Quetion10(sc);
		}
	}
		
// ----------------------------------------------------------------------------------------------------------------------------------------
		// L10QuestionSet2
		
	public void L10set2Quetion1(Scanner sc){
		try 
		{
			L10Question = "What does the SQL COMMIT statement do?";
			a = "a.  Saves all changes made during the current transaction";
			b = "b.  Rolls back all changes made during the current transaction";
			c = "c.  Removes a user from the database";
			d = "d.  Grants privileges to a user";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = a;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set2Quetion1(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set2Quetion1(sc);
		}
	}
	
	
	public void L10set2Quetion2(Scanner sc){
		try 
		{
			L10Question = "In SQL, which statement is used to undo changes made during the current transaction?";
			a = "a.  UNDO";
			b = "b.  ROLLBACK";
			c = "c.  DELETE";
			d = "d.  CANCEL";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = b;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set2Quetion2(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set2Quetion2(sc);
		}
	}
	
	public void L10set2Quetion3(Scanner sc){
		try 
		{
			L10Question = "Write a query to revoke UPDATE privilege on the \"products\" table from the user 'analyst'.";
			a = "a.  REVOKE UPDATE ON products TO analyst;";
			b = "b.  REVOKE UPDATE ON products FROM analyst;";
			c = "c.  REVOKE UPDATE TO products FROM analyst;";
			d = "d.  REVOKE UPDATE FROM products TO analyst;";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = b;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set2Quetion3(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set2Quetion3(sc);
		}
	}
	
	public void L10set2Quetion4(Scanner sc){
		try 
		{
			L10Question = "Question: GIVE ACCESS TO UPDATE ON orders TO order_clerk;";
			a = "a.  GRANT UPDATE ON orders ON order_clerk;";
			b = "b.  ALLOW UPDATE ON orders TO order_clerk;";
			c = "c.  GRANT UPDATE ON orders TO order_clerk";
			d = "d.  ALLOW UPDATE ON orders ON order_clerk;";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = c;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set2Quetion4(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set2Quetion4(sc);
		}
		
	}	

	public void L10set2Quetion5(Scanner sc){
		try 
		{
			L10Question = "Question: What is the purpose of the SQL DROP USER statement?";
			a = "a.  To delete a table";
			b = "b.  To remove a user from a database";
			c = "c.  To grant privileges to a user";
			d = "d.   To revoke privileges from a user";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = a;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set2Quetion5(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set2Quetion5(sc);
		}
		
	}	

	public void L10set2Quetion6(Scanner sc){
		try 
		{
			L10Question = "What does TCL stand for in SQL?";
			a = "a.  Table Control Language";
			b = "b.  Transaction Control Language";
			c = "c.  Text Control Language";
			d = "d.  Table Configuration Language";
			System.out.println("Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = b;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set2Quetion6(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set2Quetion6(sc);
		}
	}
	
	public void L10set2Quetion7(Scanner sc){
		try 
		{
			L10Question = "In SQL, what does the SAVEPOINT statement do?";
			a = "a.  Marks the beginning of a new transaction";
			b = "b.  Creates a temporary table";
			c = "c.  Sets a point to which a transaction can be rolled back";
			d = "d.  Grants privileges to a user";
			System.out.println("Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = b;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set2Quetion7(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set2Quetion7(sc);
		}
	}
	
	public void L10set2Quetion8(Scanner sc){
		try 
		{
			L10Question = "Which TCL statement in SQL is used to release all savepoints in a transaction?";
			a = "a.  ROLLBACK";
			b = "b.  RELEASE SAVEPOINT";
			c = "c.  COMMIT";
			d = "d.  SET TRANSACTION";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = a;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set2Quetion8(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set2Quetion8(sc);
		}
	}
		
	public void L10set2Quetion9(Scanner sc){
		try 
		{
			L10Question = "Write a query to roll back to the savepoint 'point1' in the current transaction;";
			a = "a.  ROLLBACK FROM SAVEPOINT TO point1;";
			b = "b.  ROLLBACK FROM SAVEPOINT point1; ";
			c = "c.  ROLLBACK TO SAVEPOINT point1;";
			d = "d.  all the above";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = c;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set2Quetion9(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set2Quetion9(sc);
		}
	}
	
	public void L10set2Quetion10(Scanner sc){
		try 
		{
			L10Question = "Write a query to set a savepoint named 'point2' after updating a record in the current transaction.";
			a = "a.  UPDATE employees SET salary = salary * 1.10; SAVEPOINT point2;";
			b = "b.  SAVES employees SET salary = salary * 1.10; SAVEPOINT point2;";
			c = "c.  UPDATE employees SET salary = salary * 1.10 SAVEPOINT point2;";
			d = "d.  UPDATE employees SET salary = salary * 1.10;";
			System.out.println("L10Question: "+L10Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L10ActualAnswer = a;
			System.out.println(L10ActualAnswer);
			if(input =='a' || input =='A') {
				L10UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L10UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L10UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L10UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L10set2Quetion10(sc);
			}
			System.out.println(L10UserAnswer);
			if (this.L10ActualAnswer.equals(L10UserAnswer)) {
				System.out.println("Your answer is correct!");
				L10Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L10set2Quetion10(sc);
		}
	}	
	
	
	public void L10viewAnswers(Scanner sc) {
		try {
			if(Attempt==0) {
				System.out.println("You didn't play game yet!!!");
				System.out.println("Press 1 for Play Game");
				System.out.println("Press 2 for Go back to previous menu");
				System.out.println("Press 3 for Main Menu");
				String s = sc.next();
				int input = Integer.parseInt(s);
				if(input ==1) {
					L10QuestionSet(sc);
				}
				else if(input ==2) {
					L10Menu(sc);
				}
				else if(input ==3) {
					mainMenu(sc);
				}
				else {
					System.err.println("Input is Incorrect!");
					L10viewAnswers(sc);
				}
				
			}
			
			else{
				System.out.println("=================================================================");
				System.out.println("1: "+L10Question1);
				System.out.println("Selected Answers: "+ L10UserAnswer1);
				System.out.println("Correct Answers: "+ L10ActualAnswer1);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("2: "+L10Question2);
				System.out.println("Selected Answers: "+ L10UserAnswer2);
				System.out.println("Correct Answers: "+ L10ActualAnswer2);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("3: "+L10Question3);
				System.out.println("Selected Answers: "+ L10UserAnswer3);
				System.out.println("Correct Answers: "+ L10ActualAnswer3);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("4: "+L10Question4);
				System.out.println("Selected Answers: "+ L10UserAnswer4);
				System.out.println("Correct Answers: "+ L10ActualAnswer4);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("5: "+L10Question5);
				System.out.println("Selected Answers: "+ L10UserAnswer5);
				System.out.println("Correct Answers: "+ L10ActualAnswer5);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("6: "+L10Question6);
				System.out.println("Selected Answers: "+ L10UserAnswer6);
				System.out.println("Correct Answers: "+ L10ActualAnswer6);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("7: "+L10Question7);
				System.out.println("Selected Answers: "+ L10UserAnswer7);
				System.out.println("Correct Answers: "+ L10ActualAnswer7);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("8: "+L10Question8);
				System.out.println("Selected Answers: "+ L10UserAnswer8);
				System.out.println("Correct Answers: "+ L10ActualAnswer8);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("9: "+L10Question9);
				System.out.println("Selected Answers: "+ L10UserAnswer9);
				System.out.println("Correct Answers: "+ L10ActualAnswer9);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("10: "+L10Question10);
				System.out.println("Selected Answers: "+ L10UserAnswer10);
				System.out.println("Correct Answers: "+ L10ActualAnswer10);
				System.out.println("=================================================================");
			}
		}
		catch (NumberFormatException nfe) {
			System.out.println("something is wrong!");
			L10viewAnswers(sc);
		}
	}
	
	public void L10score(Scanner sc) {
		try {
			if(L10Marks ==0) {
				L10viewAnswers(sc);
			}
			else if(L10Marks>=5) {
				System.out.println("Congratulations, "+name);
				System.out.println("Congratulations, you completed the LeveL10");
				System.out.println("Your Score is "+ L10Marks+ "/10");
				System.out.println("1. Play Next Level");
				System.out.println("2. Play Again");
				System.out.println("3. View Answer");
				System.out.println("4. Go to Main Menu");
				String s = sc.next();
				int input = Integer.parseInt(s);
				if(input ==1) {
				}
				else if(input ==1) {
					L10QuestionSet(sc);
				}
				else if(input ==2) {
					L10viewAnswers(sc);
				}
				else if(input ==4) {
					level(sc, CurrentLevel, L10Marks);
				}
				else {
					System.err.println("Incorrect Input");
					L10score(sc);
				}
			}
			else
			{
				
				System.out.println("Opps! "+ name);
				System.out.println("Your Failed to Complete!!!");
				System.out.println("your Score is "+ L10Marks+ "/10");
				if(L10Marks <5) {
					System.out.println("1. Play Again");
					System.out.println("2. View Answer");
					System.out.println("3. Go to Main Menu");
					String s = sc.next();
					int input = Integer.parseInt(s);
					if(input ==1) {
						L10QuestionSet(sc);
					}
					else if(input ==2) {
						L10viewAnswers(sc);
					}
					else if(input ==3) {
						level(sc, CurrentLevel, L10Marks);
					}
					else {
						System.err.println("Incorrect Input");
						L10score(sc);
					}
				}
				else {
					System.out.println("1. Play next");
					System.out.println("2. Play Again");
					System.out.println("3. View Answer");
					System.out.println("4. Go to Main Menu");
					String s = sc.next();
					int input = Integer.parseInt(s);
					if(input==1) {
						//It will directly go to next level 
					}
					else if(input ==2) {
						L10QuestionSet(sc);
					}
					else if(input ==3) {
						L10viewAnswers(sc);
					}
					else if(input ==4) {
						level(sc, CurrentLevel, L10Marks);
					}
					else {
						System.err.println("Incorrect input");
						L10score(sc);
					}
				}
			}
		}
		catch(NumberFormatException nfe) {
			System.err.println("Something is wrong.");
			L10score(sc);
		}
	}
	public void L10Menu(Scanner sc) {
		try {
			this.CurrentLevel = "Level 10";
			System.out.println("Level 10");
			System.out.println("---------------");
			System.out.println("1. Play");
			System.out.println("2.Check your score");
			System.out.println("3. View your answers");
			String s = sc.next();
			int input = Integer.parseInt(s);
			switch (input) {
			case 1: L10QuestionSet(sc);
				break;
			case 2: L10score(sc);
				break;
			case 3: L10viewAnswers(sc);
			
			default:
				System.err.println("Incorrect input");
				L10Menu(sc);
			}
		}
		catch(NumberFormatException nme) {
			L10Menu(sc);
		}
	}
}


