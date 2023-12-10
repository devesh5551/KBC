package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SqlLevel9 extends SqlLevel8{
	
	int L9Marks=0;
	String L9Question1;
	String L9UserAnswer1;
	String L9ActualAnswer1;
	String L9Question2;
	String L9UserAnswer2;
	String L9ActualAnswer2;
	String L9Question3;
	String L9UserAnswer3;
	String L9ActualAnswer3;
	String L9Question4;
	String L9UserAnswer4;
	String L9ActualAnswer4;
	String L9Question5;
	String L9UserAnswer5;
	String L9ActualAnswer5;
	String L9Question6;
	String L9UserAnswer6;
	String L9ActualAnswer6;
	String L9Question7;
	String L9UserAnswer7;
	String L9ActualAnswer7;
	String L9Question8;
	String L9UserAnswer8;
	String L9ActualAnswer8;
	String L9Question9;
	String L9UserAnswer9;
	String L9ActualAnswer9;
	String L9Question10;
	String L9UserAnswer10;
	String L9ActualAnswer10;
	String L9Question ="";
	String a;
	String b;
	String c;
	String d;
	String L9UserAnswer;
	String L9ActualAnswer;
	int Attempt;
	
	public void L9QuestionSet(Scanner sc){
		if (Attempt ==0) 
		{
			Attempt++;
			L9Marks =0;
			L9set1Quetion1(sc);
			L9Question1 = L9Question;
			L9ActualAnswer1 = L9ActualAnswer;
			L9UserAnswer1 = L9UserAnswer;
			System.out.println(L9Marks);
			L9set1Quetion2(sc);
			L9Question2 = L9Question;
			L9ActualAnswer2 = L9ActualAnswer;
			L9UserAnswer2 = L9UserAnswer;
			L9set1Quetion3(sc);
			L9Question3 = L9Question;
			L9ActualAnswer3 = L9ActualAnswer;
			L9UserAnswer3 = L9UserAnswer;
			System.out.println(L9Marks);
			L9set1Quetion4(sc);
			L9Question4 = L9Question;
			L9ActualAnswer4 = L9ActualAnswer;
			L9UserAnswer4 = L9UserAnswer;
			System.out.println(L9Marks);
			L9set1Quetion5(sc);
			L9Question5 = L9Question;
			L9ActualAnswer5 = L9ActualAnswer;
			L9UserAnswer5 = L9UserAnswer;
			L9set1Quetion6(sc);
			L9Question6 = L9Question;
			L9ActualAnswer6 = L9ActualAnswer;
			L9UserAnswer6 = L9UserAnswer;
			L9set1Quetion7(sc);
			L9Question7 = L9Question;
			L9ActualAnswer7 = L9ActualAnswer;
			L9UserAnswer7 = L9UserAnswer;
			L9set1Quetion8(sc);
			L9Question8 = L9Question;
			L9ActualAnswer8 = L9ActualAnswer;
			L9UserAnswer8 = L9UserAnswer;
			L9set1Quetion9(sc);
			L9Question9 = L9Question;
			L9ActualAnswer9 = L9ActualAnswer;
			L9UserAnswer9 = L9UserAnswer;
			L9set1Quetion10(sc);
			L9Question10 = L9Question;
			L9ActualAnswer10 = L9ActualAnswer;
			L9UserAnswer10 = L9UserAnswer;
			
		}
		else if(Attempt ==1) 
		{
			Attempt++;
			L9Marks =0;
			L9set2Quetion1(sc);
			L9Question1 = L9Question;
			L9ActualAnswer1 = L9ActualAnswer;
			L9UserAnswer1 = L9UserAnswer;
			L9set2Quetion2(sc);
			L9Question2 = L9Question;
			L9ActualAnswer2 = L9ActualAnswer;
			L9UserAnswer2 = L9UserAnswer;
			L9set2Quetion3(sc);
			L9Question3 = L9Question;
			L9ActualAnswer3 = L9ActualAnswer;
			L9UserAnswer3 = L9UserAnswer;
			L9set2Quetion4(sc);
			L9Question4 = L9Question;
			L9ActualAnswer4 = L9ActualAnswer;
			L9UserAnswer4 = L9UserAnswer;
			L9set2Quetion5(sc);
			L9Question5 = L9Question;
			L9ActualAnswer5 = L9ActualAnswer;
			L9UserAnswer5 = L9UserAnswer;
			L9set2Quetion6(sc);
			L9Question6 = L9Question;
			L9ActualAnswer6 = L9ActualAnswer;
			L9UserAnswer6 = L9UserAnswer;
			L9set2Quetion7(sc);
			L9Question7 = L9Question;
			L9ActualAnswer7 = L9ActualAnswer;
			L9UserAnswer7 = L9UserAnswer;
			L9set2Quetion8(sc);
			L9Question8 = L9Question;
			L9ActualAnswer8 = L9ActualAnswer;
			L9UserAnswer8 = L9UserAnswer;
			L9set2Quetion9(sc);
			L9Question9 = L9Question;
			L9ActualAnswer9 = L9ActualAnswer;
			L9UserAnswer9 = L9UserAnswer;
			L9set2Quetion10(sc);
			L9Question10 = L9Question;
			L9ActualAnswer10 = L9ActualAnswer;
			L9UserAnswer10 = L9UserAnswer;	
		}
		L9Menu(sc);
		
	}
	public void L9set1Quetion1(Scanner sc){
		try 
		{
			L9Question = "What does DCL stand for in SQL?";
			a = "a. Data Collection Language";
			b = "b. Data Control Language";
			c = "c. Data Conversion Language";
			d = "d. Data Communication Language";
			System.out.println("Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = b;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C') {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')  {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set1Quetion1(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set1Quetion1(sc);
		}
	}
	
	public void L9set1Quetion2(Scanner sc){
		try 
		{
			L9Question = "Which statement is used to grant privileges in SQL?";
			a = "a. GRANT";
			b = "b. ALLOW";
			c = "c. GRANT TO";
			d = "d. PROVIDE";
			System.out.println("Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = a;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')    {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set1Quetion2(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set1Quetion2(sc);
		}
	}
	public void L9set1Quetion3(Scanner sc){
		try 
		{
			L9Question = "In SQL, which privilege allows a user to modify existing data in a table?";
			a = "a. INSERT";
			b = "b. UPDATE";
			c = "c. DELETE";
			d = "d. ALTER";
			System.out.println("Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = b;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')    {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set1Quetion3(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set1Quetion3(sc);
		}
	}
	
	public void L9set1Quetion4(Scanner sc){
		try 
		{
			L9Question = "Which SQL statement is used to remove a user from a database?";
			a = "a. REMOVE USER";
			b = "b. DELETE USER";
			c = "c. DROP USER";
			d = "d. REVOKE USER";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = d;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set1Quetion4(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set1Quetion4(sc);
		}
	}	
	
	public void L9set1Quetion5(Scanner sc){
		try 
		{
			L9Question = "Write a query to grant SELECT and INSERT privileges on the \"employees\" table to the user 'john'.";
			a = "a. GRANT SELECT, INSERT ON employees TO john;";
			b = "b. GRANT SELECT, INSERT FROM employees TO john;";
			c = "c. ALLLOW ACCESS SELECT, INSERT ON employees TO john;";
			d = "d. GRANT SELECT, INSERT ON employees TO john;";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = a;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set1Quetion5(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set1Quetion5(sc);
		}
	}
	
	public void L9set1Quetion6(Scanner sc){
		try 
		{
			L9Question = "Which of the following statements is used to set a transaction as read-only in SQL?";
			a = "a. ROLLBACK";
			b = "b. SET TRANSACTION READ ONLY";
			c = "c. COMMIT";
			d = "d. SAVEPOINT";
			System.out.println("Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = b;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set1Quetion6(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set1Quetion6(sc);
		}
	}
	
	public void L9set1Quetion7(Scanner sc){
		try 
		{
			L9Question = "In SQL, what does the SAVEPOINT statement do?";
			a = "a. Commits the transaction.";
			b = "b. Rolls back the transaction";
			c = "c. Sets a point to";
			d = "d. All the above";
			System.out.println("Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = b;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set1Quetion7(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set1Quetion7(sc);
		}
	}
	
	public void L9set1Quetion8(Scanner sc){
		try 
		{
			L9Question = "What does the COMMIT WORK statement do in SQL?";
			a = "a. Rolls back the transactio";
			b = "b. Commits the transaction";
			c = "c. Sets a savepoint";
			d = "d. Begins a new transaction";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = b;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set1Quetion8(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set1Quetion8(sc);
		}
	}
		
	public void L9set1Quetion9(Scanner sc){
		try 
		{
			L9Question = "The ROLLBACK TO SAVEPOINT statement can be used to roll back to any savepoint in a transaction.";
			a = "a. TRUE";
			b = "b. FALSE";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = d;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set1Quetion9(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set1Quetion9(sc);
		}
	}
	
	public void L9set1Quetion10(Scanner sc){
		try 
		{
			L9Question = "The ROLLBACK statement is used to permanently save changes made during a transaction.";
			a = "a. TRUE ";
			b = "b. FALSE";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = a;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set1Quetion10(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set1Quetion10(sc);
		}
	}
		
// ----------------------------------------------------------------------------------------------------------------------------------------
		// L9QuestionSet2
		
	public void L9set2Quetion1(Scanner sc){
		try 
		{
			L9Question = "What does the SQL COMMIT statement do?";
			a = "a. Saves all changes made during the current transaction";
			b = "b. Rolls back all changes made during the current transaction";
			c = "c. Removes a user from the database";
			d = "d. Grants privileges to a user";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = a;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set2Quetion1(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set2Quetion1(sc);
		}
	}
	
	
	public void L9set2Quetion2(Scanner sc){
		try 
		{
			L9Question = "In SQL, which statement is used to undo changes made during the current transaction?";
			a = "a. UNDO";
			b = "b. ROLLBACK";
			c = "c. DELETE";
			d = "d. CANCEL";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = b;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set2Quetion2(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set2Quetion2(sc);
		}
	}
	
	public void L9set2Quetion3(Scanner sc){
		try 
		{
			L9Question = "Write a query to revoke UPDATE privilege on the \"products\" table from the user 'analyst'.";
			a = "a. REVOKE UPDATE ON products TO analyst;";
			b = "b. REVOKE UPDATE ON products FROM analyst;";
			c = "c. REVOKE UPDATE TO products FROM analyst;";
			d = "d. REVOKE UPDATE FROM products TO analyst;";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = b;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set2Quetion3(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set2Quetion3(sc);
		}
	}
	
	public void L9set2Quetion4(Scanner sc){
		try 
		{
			L9Question = "Question: GIVE ACCESS TO UPDATE ON orders TO order_clerk;";
			a = "a. GRANT UPDATE ON orders ON order_clerk;";
			b = "b. ALLOW UPDATE ON orders TO order_clerk;";
			c = "c. GRANT UPDATE ON orders TO order_clerk";
			d = "d. ALLOW UPDATE ON orders ON order_clerk;";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = c;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set2Quetion4(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set2Quetion4(sc);
		}
		
	}	

	public void L9set2Quetion5(Scanner sc){
		try 
		{
			L9Question = "Question: What is the purpose of the SQL DROP USER statement?";
			a = "a. To delete a table";
			b = "b. To remove a user from a database";
			c = "c. To grant privileges to a user";
			d = "d.  To revoke privileges from a user";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = a;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set2Quetion5(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set2Quetion5(sc);
		}
		
	}	

	public void L9set2Quetion6(Scanner sc){
		try 
		{
			L9Question = "What does TCL stand for in SQL?";
			a = "a. Table Control Language";
			b = "b. Transaction Control Language";
			c = "c. Text Control Language";
			d = "d. Table Configuration Language";
			System.out.println("Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = b;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set2Quetion6(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set2Quetion6(sc);
		}
	}
	
	public void L9set2Quetion7(Scanner sc){
		try 
		{
			L9Question = "In SQL, what does the SAVEPOINT statement do?";
			a = "a. Marks the beginning of a new transaction";
			b = "b. Creates a temporary table";
			c = "c. Sets a point to which a transaction can be rolled back";
			d = "d. Grants privileges to a user";
			System.out.println("Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = b;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set2Quetion7(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set2Quetion7(sc);
		}
	}
	
	public void L9set2Quetion8(Scanner sc){
		try 
		{
			L9Question = "Which TCL statement in SQL is used to release all savepoints in a transaction?";
			a = "a. ROLLBACK";
			b = "b. RELEASE SAVEPOINT";
			c = "c. COMMIT";
			d = "d. SET TRANSACTION";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = a;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set2Quetion8(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set2Quetion8(sc);
		}
	}
		
	public void L9set2Quetion9(Scanner sc){
		try 
		{
			L9Question = "Write a query to roll back to the savepoint 'point1' in the current transaction;";
			a = "a. ROLLBACK FROM SAVEPOINT TO point1;";
			b = "b. ROLLBACK FROM SAVEPOINT point1; ";
			c = "c. ROLLBACK TO SAVEPOINT point1;";
			d = "d. all the above";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = c;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set2Quetion9(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set2Quetion9(sc);
		}
	}
	
	public void L9set2Quetion10(Scanner sc){
		try 
		{
			L9Question = "Write a query to set a savepoint named 'point2' after updating a record in the current transaction.";
			a = "a. UPDATE employees SET salary = salary * 1.10; SAVEPOINT point2;";
			b = "b. SAVES employees SET salary = salary * 1.10; SAVEPOINT point2;";
			c = "c. UPDATE employees SET salary = salary * 1.10 SAVEPOINT point2;";
			d = "d. UPDATE employees SET salary = salary * 1.10;";
			System.out.println("L9Question: "+L9Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L9ActualAnswer = a;
			System.out.println(L9ActualAnswer);
			if(input =='a' || input=='A') {
				L9UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L9UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L9UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L9UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L9set2Quetion10(sc);
			}
			System.out.println(L9UserAnswer);
			if (this.L9ActualAnswer.equals(L9UserAnswer)) {
				System.out.println("Your answer is correct!");
				L9Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L9set2Quetion10(sc);
		}
	}	
	
	
	public void L9viewAnswers(Scanner sc) {
		try {
			if(Attempt==0) {
				System.out.println("You didn't play game yet!!!");
				System.out.println("Press 1 for Play Game");
				System.out.println("Press 2 for Go back to previous menu");
				System.out.println("Press 3 for Main Menu");
				int input = Integer.parseInt(string(sc));
				if(input ==1) {
					L9QuestionSet(sc);
				}
				else if(input ==2) {
					L9Menu(sc);
				}
				else if(input ==3) {
					mainMenu(sc);
				}
				else {
					System.err.println("Input is Incorrect!");
					L9viewAnswers(sc);
				}
				
			}
			
			else{
				System.out.println("=================================================================");
				System.out.println("1: "+L9Question1);
				System.out.println("Selected Answers: "+ L9UserAnswer1);
				System.out.println("Correct Answers: "+ L9ActualAnswer1);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("2: "+L9Question2);
				System.out.println("Selected Answers: "+ L9UserAnswer2);
				System.out.println("Correct Answers: "+ L9ActualAnswer2);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("3: "+L9Question3);
				System.out.println("Selected Answers: "+ L9UserAnswer3);
				System.out.println("Correct Answers: "+ L9ActualAnswer3);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("4: "+L9Question4);
				System.out.println("Selected Answers: "+ L9UserAnswer4);
				System.out.println("Correct Answers: "+ L9ActualAnswer4);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("5: "+L9Question5);
				System.out.println("Selected Answers: "+ L9UserAnswer5);
				System.out.println("Correct Answers: "+ L9ActualAnswer5);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("6: "+L9Question6);
				System.out.println("Selected Answers: "+ L9UserAnswer6);
				System.out.println("Correct Answers: "+ L9ActualAnswer6);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("7: "+L9Question7);
				System.out.println("Selected Answers: "+ L9UserAnswer7);
				System.out.println("Correct Answers: "+ L9ActualAnswer7);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("8: "+L9Question8);
				System.out.println("Selected Answers: "+ L9UserAnswer8);
				System.out.println("Correct Answers: "+ L9ActualAnswer8);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("9: "+L9Question9);
				System.out.println("Selected Answers: "+ L9UserAnswer9);
				System.out.println("Correct Answers: "+ L9ActualAnswer9);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("10: "+L9Question10);
				System.out.println("Selected Answers: "+ L9UserAnswer10);
				System.out.println("Correct Answers: "+ L9ActualAnswer10);
				System.out.println("=================================================================");
			}
		}
		catch (NumberFormatException nfe) {
			System.out.println("something is wrong!");
			L9viewAnswers(sc);
		}
	}
	
	public void L9score(Scanner sc) {
		try {
			if(L9Marks ==0) {
				L9viewAnswers(sc);
			}
			else if(L9Marks>=5) {
				System.out.println("Congratulations, "+name);
				System.out.println("Congratulations, you completed the LeveL9");
				System.out.println("Your Score is "+ L9Marks+ "/10");
				System.out.println("1. Play Next Level");
				System.out.println("2. Play Again");
				System.out.println("3. View Answer");
				System.out.println("4. Go to Main Menu");
				int input = Integer.parseInt(string(sc));
				if(input ==1) {
				}
				else if(input ==1) {
					L9QuestionSet(sc);
				}
				else if(input ==2) {
					L9viewAnswers(sc);
				}
				else if(input ==4) {
					level(sc, CurrentLevel, L9Marks);
				}
				else {
					System.err.println("Incorrect Input");
					L9score(sc);
				}
			}
			else
			{
				
				System.out.println("Opps! "+ name);
				System.out.println("Your Failed to Complete!!!");
				System.out.println("your Score is "+ L9Marks+ "/10");
				if(L9Marks <5) {
					System.out.println("1. Play Again");
					System.out.println("2. View Answer");
					System.out.println("3. Go to Main Menu");
					int input = Integer.parseInt(string(sc));
					if(input ==1) {
						L9QuestionSet(sc);
					}
					else if(input ==2) {
						L9viewAnswers(sc);
					}
					else if(input ==3) {
						level(sc, CurrentLevel, L9Marks);
					}
					else {
						System.err.println("Incorrect Input");
						L9score(sc);
					}
				}
				else {
					System.out.println("1. Play next");
					System.out.println("2. Play Again");
					System.out.println("3. View Answer");
					System.out.println("4. Go to Main Menu");
					int input = Integer.parseInt(string(sc));
					if(input==1) {
						//It will directly go to next level 
					}
					else if(input ==2) {
						L9QuestionSet(sc);
					}
					else if(input ==3) {
						L9viewAnswers(sc);
					}
					else if(input ==4) {
						level(sc, CurrentLevel, L9Marks);
					}
					else {
						System.err.println("Incorrect input");
						L9score(sc);
					}
				}
			}
		}
		catch(NumberFormatException nfe) {
			System.err.println("Something is wrong.");
			L9score(sc);
		}
	}
	public void L9Menu(Scanner sc) {
		try {
			this.CurrentLevel = "Level 9";
			System.out.println("Level 9");
			System.out.println("---------------");
			System.out.println("1. Play");
			System.out.println("2.Check your score");
			System.out.println("3. View your answers");
			int input = Integer.parseInt(string(sc));
			switch (input) {
			case 1: L9QuestionSet(sc);
				break;
			case 2: L9score(sc);
				break;
			case 3: L9viewAnswers(sc);
			
			default:
				System.out.println("Invalid input");
				L9Menu(sc);
			}
		}
		catch(NumberFormatException nfe) {
			System.err.println("Something is wrong.");
			L9Menu(sc);
		}
	}
}


