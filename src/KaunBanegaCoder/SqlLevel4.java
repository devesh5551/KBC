package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SqlLevel4 extends SqlLevel3 {
	
	int L4Marks=0;
	String L4Question1;
	String L4UserAnswer1;
	String L4ActualAnswer1;
	String L4Question2;
	String L4UserAnswer2;
	String L4ActualAnswer2;
	String L4Question3;
	String L4UserAnswer3;
	String L4ActualAnswer3;
	String L4Question4;
	String L4UserAnswer4;
	String L4ActualAnswer4;
	String L4Question5;
	String L4UserAnswer5;
	String L4ActualAnswer5;
	String L4Question6;
	String L4UserAnswer6;
	String L4ActualAnswer6;
	String L4Question7;
	String L4UserAnswer7;
	String L4ActualAnswer7;
	String L4Question8;
	String L4UserAnswer8;
	String L4ActualAnswer8;
	String L4Question9;
	String L4UserAnswer9;
	String L4ActualAnswer9;
	String L4Question10;
	String L4UserAnswer10;
	String L4ActualAnswer10;
	String L4Question ="";
	String a;
	String b;
	String c;
	String d;
	String L4UserAnswer;
	String L4ActualAnswer;
	int Attempt;
	
	public void L4QuestionSet(Scanner sc){
		if (Attempt ==0) 
		{
			Attempt++;
			L4Marks =0;
			L4set1Quetion1(sc);
			L4Question1 = L4Question;
			L4ActualAnswer1 = L4ActualAnswer;
			L4UserAnswer1 = L4UserAnswer;
			System.out.println(L4Marks);
			L4set1Quetion2(sc);
			L4Question2 = L4Question;
			L4ActualAnswer2 = L4ActualAnswer;
			L4UserAnswer2 = L4UserAnswer;
			L4set1Quetion3(sc);
			L4Question3 = L4Question;
			L4ActualAnswer3 = L4ActualAnswer;
			L4UserAnswer3 = L4UserAnswer;
			System.out.println(L4Marks);
			L4set1Quetion4(sc);
			L4Question4 = L4Question;
			L4ActualAnswer4 = L4ActualAnswer;
			L4UserAnswer4 = L4UserAnswer;
			System.out.println(L4Marks);
			L4set1Quetion5(sc);
			L4Question5 = L4Question;
			L4ActualAnswer5 = L4ActualAnswer;
			L4UserAnswer5 = L4UserAnswer;
			L4set1Quetion6(sc);
			L4Question6 = L4Question;
			L4ActualAnswer6 = L4ActualAnswer;
			L4UserAnswer6 = L4UserAnswer;
			L4set1Quetion7(sc);
			L4Question7 = L4Question;
			L4ActualAnswer7 = L4ActualAnswer;
			L4UserAnswer7 = L4UserAnswer;
			L4set1Quetion8(sc);
			L4Question8 = L4Question;
			L4ActualAnswer8 = L4ActualAnswer;
			L4UserAnswer8 = L4UserAnswer;
			L4set1Quetion9(sc);
			L4Question9 = L4Question;
			L4ActualAnswer9 = L4ActualAnswer;
			L4UserAnswer9 = L4UserAnswer;
			L4set1Quetion10(sc);
			L4Question10 = L4Question;
			L4ActualAnswer10 = L4ActualAnswer;
			L4UserAnswer10 = L4UserAnswer;
			
		}
		else if(Attempt ==1) 
		{
			Attempt++;
			L4Marks =0;
			L4set2Quetion1(sc);
			L4Question1 = L4Question;
			L4ActualAnswer1 = L4ActualAnswer;
			L4UserAnswer1 = L4UserAnswer;
			L4set2Quetion2(sc);
			L4Question2 = L4Question;
			L4ActualAnswer2 = L4ActualAnswer;
			L4UserAnswer2 = L4UserAnswer;
			L4set2Quetion3(sc);
			L4Question3 = L4Question;
			L4ActualAnswer3 = L4ActualAnswer;
			L4UserAnswer3 = L4UserAnswer;
			L4set2Quetion4(sc);
			L4Question4 = L4Question;
			L4ActualAnswer4 = L4ActualAnswer;
			L4UserAnswer4 = L4UserAnswer;
			L4set2Quetion5(sc);
			L4Question5 = L4Question;
			L4ActualAnswer5 = L4ActualAnswer;
			L4UserAnswer5 = L4UserAnswer;
			L4set2Quetion6(sc);
			L4Question6 = L4Question;
			L4ActualAnswer6 = L4ActualAnswer;
			L4UserAnswer6 = L4UserAnswer;
			L4set2Quetion7(sc);
			L4Question7 = L4Question;
			L4ActualAnswer7 = L4ActualAnswer;
			L4UserAnswer7 = L4UserAnswer;
			L4set2Quetion8(sc);
			L4Question8 = L4Question;
			L4ActualAnswer8 = L4ActualAnswer;
			L4UserAnswer8 = L4UserAnswer;
			L4set2Quetion9(sc);
			L4Question9 = L4Question;
			L4ActualAnswer9 = L4ActualAnswer;
			L4UserAnswer9 = L4UserAnswer;
			L4set2Quetion10(sc);
			L4Question10 = L4Question;
			L4ActualAnswer10 = L4ActualAnswer;
			L4UserAnswer10 = L4UserAnswer;	
		}
		L4Menu(sc);
		
	}
	public void L4set1Quetion1(Scanner sc){
		try 
		{
			L4Question = "What does DCL stand for in SQL?";
			a = "a. Data Collection Language";
			b = "b. Data Control Language";
			c = "c. Data Conversion Language";
			d = "d. Data Communication Language";
			System.out.println("Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = b;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C') {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')  {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set1Quetion1(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set1Quetion1(sc);
		}
	}
	
	public void L4set1Quetion2(Scanner sc){
		try 
		{
			L4Question = "Which statement is used to grant privileges in SQL?";
			a = "a. GRANT";
			b = "b. ALLOW";
			c = "c. GRANT TO";
			d = "d. PROVIDE";
			System.out.println("Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = a;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')    {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set1Quetion2(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set1Quetion2(sc);
		}
	}
	public void L4set1Quetion3(Scanner sc){
		try 
		{
			L4Question = "In SQL, which privilege allows a user to modify existing data in a table?";
			a = "a. INSERT";
			b = "b. UPDATE";
			c = "c. DELETE";
			d = "d. ALTER";
			System.out.println("Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = b;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')    {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set1Quetion3(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set1Quetion3(sc);
		}
	}
	
	public void L4set1Quetion4(Scanner sc){
		try 
		{
			L4Question = "Which SQL statement is used to remove a user from a database?";
			a = "a. REMOVE USER";
			b = "b. DELETE USER";
			c = "c. DROP USER";
			d = "d. REVOKE USER";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = d;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set1Quetion4(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set1Quetion4(sc);
		}
	}	
	
	public void L4set1Quetion5(Scanner sc){
		try 
		{
			L4Question = "Write a query to grant SELECT and INSERT privileges on the \"employees\" table to the user 'john'.";
			a = "a. GRANT SELECT, INSERT ON employees TO john;";
			b = "b. GRANT SELECT, INSERT FROM employees TO john;";
			c = "c. ALLLOW ACCESS SELECT, INSERT ON employees TO john;";
			d = "d. GRANT SELECT, INSERT ON employees TO john;";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = a;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set1Quetion5(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set1Quetion5(sc);
		}
	}
	
	public void L4set1Quetion6(Scanner sc){
		try 
		{
			L4Question = "Which of the following statements is used to set a transaction as read-only in SQL?";
			a = "a. ROLLBACK";
			b = "b. SET TRANSACTION READ ONLY";
			c = "c. COMMIT";
			d = "d. SAVEPOINT";
			System.out.println("Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = b;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set1Quetion6(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set1Quetion6(sc);
		}
	}
	
	public void L4set1Quetion7(Scanner sc){
		try 
		{
			L4Question = "In SQL, what does the SAVEPOINT statement do?";
			a = "a. Commits the transaction.";
			b = "b. Rolls back the transaction";
			c = "c. Sets a point to";
			d = "d. All the above";
			System.out.println("Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = b;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set1Quetion7(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set1Quetion7(sc);
		}
	}
	
	public void L4set1Quetion8(Scanner sc){
		try 
		{
			L4Question = "What does the COMMIT WORK statement do in SQL?";
			a = "a. Rolls back the transactio";
			b = "b. Commits the transaction";
			c = "c. Sets a savepoint";
			d = "d. Begins a new transaction";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = b;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set1Quetion8(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set1Quetion8(sc);
		}
	}
		
	public void L4set1Quetion9(Scanner sc){
		try 
		{
			L4Question = "The ROLLBACK TO SAVEPOINT statement can be used to roll back to any savepoint in a transaction.";
			a = "a. TRUE";
			b = "b. FALSE";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = d;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set1Quetion9(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set1Quetion9(sc);
		}
	}
	
	public void L4set1Quetion10(Scanner sc){
		try 
		{
			L4Question = "The ROLLBACK statement is used to permanently save changes made during a transaction.";
			a = "a. TRUE ";
			b = "b. FALSE";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = a;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set1Quetion10(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set1Quetion10(sc);
		}
	}
		
// ----------------------------------------------------------------------------------------------------------------------------------------
		// L4QuestionSet2
		
	public void L4set2Quetion1(Scanner sc){
		try 
		{
			L4Question = "What does the SQL COMMIT statement do?";
			a = "a. Saves all changes made during the current transaction";
			b = "b. Rolls back all changes made during the current transaction";
			c = "c. Removes a user from the database";
			d = "d. Grants privileges to a user";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = a;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set2Quetion1(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set2Quetion1(sc);
		}
	}
	
	
	public void L4set2Quetion2(Scanner sc){
		try 
		{
			L4Question = "In SQL, which statement is used to undo changes made during the current transaction?";
			a = "a. UNDO";
			b = "b. ROLLBACK";
			c = "c. DELETE";
			d = "d. CANCEL";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = b;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set2Quetion2(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set2Quetion2(sc);
		}
	}
	
	public void L4set2Quetion3(Scanner sc){
		try 
		{
			L4Question = "Write a query to revoke UPDATE privilege on the \"products\" table from the user 'analyst'.";
			a = "a. REVOKE UPDATE ON products TO analyst;";
			b = "b. REVOKE UPDATE ON products FROM analyst;";
			c = "c. REVOKE UPDATE TO products FROM analyst;";
			d = "d. REVOKE UPDATE FROM products TO analyst;";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = b;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set2Quetion3(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set2Quetion3(sc);
		}
	}
	
	public void L4set2Quetion4(Scanner sc){
		try 
		{
			L4Question = "Question: GIVE ACCESS TO UPDATE ON orders TO order_clerk;";
			a = "a. GRANT UPDATE ON orders ON order_clerk;";
			b = "b. ALLOW UPDATE ON orders TO order_clerk;";
			c = "c. GRANT UPDATE ON orders TO order_clerk";
			d = "d. ALLOW UPDATE ON orders ON order_clerk;";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = c;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set2Quetion4(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set2Quetion4(sc);
		}
		
	}	

	public void L4set2Quetion5(Scanner sc){
		try 
		{
			L4Question = "Question: What is the purpose of the SQL DROP USER statement?";
			a = "a. To delete a table";
			b = "b. To remove a user from a database";
			c = "c. To grant privileges to a user";
			d = "d.  To revoke privileges from a user";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = a;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set2Quetion5(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set2Quetion5(sc);
		}
		
	}	

	public void L4set2Quetion6(Scanner sc){
		try 
		{
			L4Question = "What does TCL stand for in SQL?";
			a = "a. Table Control Language";
			b = "b. Transaction Control Language";
			c = "c. Text Control Language";
			d = "d. Table Configuration Language";
			System.out.println("Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = b;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set2Quetion6(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set2Quetion6(sc);
		}
	}
	
	public void L4set2Quetion7(Scanner sc){
		try 
		{
			L4Question = "In SQL, what does the SAVEPOINT statement do?";
			a = "a. Marks the beginning of a new transaction";
			b = "b. Creates a temporary table";
			c = "c. Sets a point to which a transaction can be rolled back";
			d = "d. Grants privileges to a user";
			System.out.println("Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = b;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set2Quetion7(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set2Quetion7(sc);
		}
	}
	
	public void L4set2Quetion8(Scanner sc){
		try 
		{
			L4Question = "Which TCL statement in SQL is used to release all savepoints in a transaction?";
			a = "a. ROLLBACK";
			b = "b. RELEASE SAVEPOINT";
			c = "c. COMMIT";
			d = "d. SET TRANSACTION";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = a;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set2Quetion8(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set2Quetion8(sc);
		}
	}
		
	public void L4set2Quetion9(Scanner sc){
		try 
		{
			L4Question = "Write a query to roll back to the savepoint 'point1' in the current transaction;";
			a = "a. ROLLBACK FROM SAVEPOINT TO point1;";
			b = "b. ROLLBACK FROM SAVEPOINT point1; ";
			c = "c. ROLLBACK TO SAVEPOINT point1;";
			d = "d. all the above";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = c;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input=='D')   {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set2Quetion9(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set2Quetion9(sc);
		}
	}
	
	public void L4set2Quetion10(Scanner sc){
		try 
		{
			L4Question = "Write a query to set a savepoint named 'point2' after updating a record in the current transaction.";
			a = "a. UPDATE employees SET salary = salary * 1.10; SAVEPOINT point2;";
			b = "b. SAVES employees SET salary = salary * 1.10; SAVEPOINT point2;";
			c = "c. UPDATE employees SET salary = salary * 1.10 SAVEPOINT point2;";
			d = "d. UPDATE employees SET salary = salary * 1.10;";
			System.out.println("L4Question: "+L4Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L4ActualAnswer = a;
			System.out.println(L4ActualAnswer);
			if(input =='a' || input=='A') {
				L4UserAnswer = a;
			}
			else if(input =='b' || input=='B') {
				L4UserAnswer = b;
			}
			else if(input =='c' || input=='C')  {
				L4UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L4UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L4set2Quetion10(sc);
			}
			System.out.println(L4UserAnswer);
			if (this.L4ActualAnswer.equals(L4UserAnswer)) {
				System.out.println("Your answer is correct!");
				L4Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L4set2Quetion10(sc);
		}
	}	
	
	
	
	public void L4viewAnswers(Scanner sc) {
		try {
			if(Attempt==0) {
				System.out.println("You didn't play game yet!!!");
				System.out.println("Press 1 for Play Game");
				System.out.println("Press 2 for Go back to previous menu");
				System.out.println("Press 3 for Main Menu");
				int input = Integer.parseInt(string(sc));
				if(input ==1) {
					L4QuestionSet(sc);
				}
				else if(input ==2) {
					L4Menu(sc);
				}
				else if(input ==3) {
					mainMenu(sc);
				}
				else {
					System.err.println("Input is Incorrect!");
					L4viewAnswers(sc);
				}
				
			}
			
			else{
				System.out.println("=================================================================");
				System.out.println("1: "+L4Question1);
				System.out.println("Selected Answers: "+ L4UserAnswer1);
				System.out.println("Correct Answers: "+ L4ActualAnswer1);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("2: "+L4Question2);
				System.out.println("Selected Answers: "+ L4UserAnswer2);
				System.out.println("Correct Answers: "+ L4ActualAnswer2);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("3: "+L4Question3);
				System.out.println("Selected Answers: "+ L4UserAnswer3);
				System.out.println("Correct Answers: "+ L4ActualAnswer3);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("4: "+L4Question4);
				System.out.println("Selected Answers: "+ L4UserAnswer4);
				System.out.println("Correct Answers: "+ L4ActualAnswer4);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("5: "+L4Question5);
				System.out.println("Selected Answers: "+ L4UserAnswer5);
				System.out.println("Correct Answers: "+ L4ActualAnswer5);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("6: "+L4Question6);
				System.out.println("Selected Answers: "+ L4UserAnswer6);
				System.out.println("Correct Answers: "+ L4ActualAnswer6);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("7: "+L4Question7);
				System.out.println("Selected Answers: "+ L4UserAnswer7);
				System.out.println("Correct Answers: "+ L4ActualAnswer7);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("8: "+L4Question8);
				System.out.println("Selected Answers: "+ L4UserAnswer8);
				System.out.println("Correct Answers: "+ L4ActualAnswer8);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("9: "+L4Question9);
				System.out.println("Selected Answers: "+ L4UserAnswer9);
				System.out.println("Correct Answers: "+ L4ActualAnswer9);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("10: "+L4Question10);
				System.out.println("Selected Answers: "+ L4UserAnswer10);
				System.out.println("Correct Answers: "+ L4ActualAnswer10);
				System.out.println("=================================================================");
			}
		}
		catch (NumberFormatException nfe) {
			System.out.println("something is wrong!");
			L4viewAnswers(sc);
		}
	}
	
	public void L4score(Scanner sc) {
		try {
			if(L4Marks ==0) {
				L4viewAnswers(sc);
			}
			else if(L4Marks>=5) {
				System.out.println("Congratulations, "+name);
				System.out.println("Congratulations, you completed the LeveL4");
				System.out.println("Your Score is "+ L4Marks+ "/10");
				System.out.println("1. Play Next Level");
				System.out.println("2. Play Again");
				System.out.println("3. View Answer");
				System.out.println("4. Go to Main Menu");
				int input = Integer.parseInt(string(sc));
				if(input ==1) {
				}
				else if(input ==1) {
					L4QuestionSet(sc);
				}
				else if(input ==2) {
					L4viewAnswers(sc);
				}
				else if(input ==4) {
					level(sc, CurrentLevel, L4Marks);
				}
				else {
					System.err.println("Incorrect Input");
					L4score(sc);
				}
			}
			else
			{
				
				System.out.println("Opps! "+ name);
				System.out.println("Your Failed to Complete!!!");
				System.out.println("your Score is "+ L4Marks+ "/10");
				if(L4Marks <5) {
					System.out.println("1. Play Again");
					System.out.println("2. View Answer");
					System.out.println("3. Go to Main Menu");
					int input = Integer.parseInt(string(sc));
					if(input ==1) {
						L4QuestionSet(sc);
					}
					else if(input ==2) {
						L4viewAnswers(sc);
					}
					else if(input ==3) {
						level(sc, CurrentLevel, L4Marks);
					}
					else {
						System.err.println("Incorrect Input");
						L4score(sc);
					}
				}
				else {
					System.out.println("1. Play next");
					System.out.println("2. Play Again");
					System.out.println("3. View Answer");
					System.out.println("4. Go to Main Menu");
					int input = Integer.parseInt(string(sc));
					if(input==1) {
						
					}
					else if(input ==2) {
						L4QuestionSet(sc);
					}
					else if(input ==3) {
						L4viewAnswers(sc);
					}
					else if(input ==4) {
						level(sc, CurrentLevel, L4Marks);
					}
					else {
						System.err.println("Incorrect input");
						L4score(sc);
					}
				}
			}
		}
		catch(NumberFormatException nfe) {
			System.err.println("Something is wrong.");
			L4score(sc);
		}
	}
	public void L4Menu(Scanner sc) {
		try {
			this.CurrentLevel = "Level 4";
			System.out.println("Level 4");
			System.out.println("---------------");
			System.out.println("1. Play");
			System.out.println("2.Check your score");
			System.out.println("3. View your answers");
			int input = Integer.parseInt(string(sc));
			switch (input) {
			case 1: L4QuestionSet(sc);
				break;
			case 2: L4score(sc);
				break;
			case 3: L4viewAnswers(sc);
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + input);
			}
		}
		catch(NumberFormatException nfe) {
			System.err.println("Something is wrong.");
			L4Menu(sc);
		}
	}
}


