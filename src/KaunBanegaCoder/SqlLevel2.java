package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

// Data Definition Laguage  & Data manipulation Language
public class SqlLevel2 extends SqlLevel1 {
	int L2Marks=0;
	String L2Question1;
	String L2UserAnswer1;
	String L2ActualAnswer1;
	
	String L2Question2;
	String L2UserAnswer2;
	String L2ActualAnswer2;
	String L2Question3;
	String L2UserAnswer3;
	String L2ActualAnswer3;
	String L2Question4;
	String L2UserAnswer4;
	String L2ActualAnswer4;
	String L2Question5;
	String L2UserAnswer5;
	String L2ActualAnswer5;
	String L2Question6;
	String L2UserAnswer6;
	String L2ActualAnswer6;
	String L2Question7;
	String L2UserAnswer7;
	String L2ActualAnswer7;
	String L2Question8;
	String L2UserAnswer8;
	String L2ActualAnswer8;
	String L2Question9;
	String L2UserAnswer9;
	String L2ActualAnswer9;
	String L2Question10;
	String L2UserAnswer10;
	String L2ActualAnswer10;
	String L2Question ="";
	String a;
	String b;
	String c;
	String d;
	String L2UserAnswer;
	String L2ActualAnswer;
	int Attempt;
	
	public void L2QuestionSet(Scanner sc){
		if (Attempt ==0) 
		{
			Attempt++;
			L2Marks =0;
			set1Quetion1(sc);
			L2Question1 = L2Question;
			L2ActualAnswer1 = L2ActualAnswer;
			L2UserAnswer1 = L2UserAnswer;
			System.out.println(L2Marks);
			set1Quetion2(sc);
			L2Question2 = L2Question;
			L2ActualAnswer2 = L2ActualAnswer;
			L2UserAnswer2 = L2UserAnswer;
			set1Quetion3(sc);
			L2Question3 = L2Question;
			L2ActualAnswer3 = L2ActualAnswer;
			L2UserAnswer3 = L2UserAnswer;
			System.out.println(L2Marks);
			set1Quetion4(sc);
			L2Question4 = L2Question;
			L2ActualAnswer4 = L2ActualAnswer;
			L2UserAnswer4 = L2UserAnswer;
			System.out.println(L2Marks);
			set1Quetion5(sc);
			L2Question5 = L2Question;
			L2ActualAnswer5 = L2ActualAnswer;
			L2UserAnswer5 = L2UserAnswer;
			set1Quetion6(sc);
			L2Question6 = L2Question;
			L2ActualAnswer6 = L2ActualAnswer;
			L2UserAnswer6 = L2UserAnswer;
			set1Quetion7(sc);
			L2Question7 = L2Question;
			L2ActualAnswer7 = L2ActualAnswer;
			L2UserAnswer7 = L2UserAnswer;
			set1Quetion8(sc);
			L2Question8 = L2Question;
			L2ActualAnswer8 = L2ActualAnswer;
			L2UserAnswer8 = L2UserAnswer;
			set1Quetion9(sc);
			L2Question9 = L2Question;
			L2ActualAnswer9 = L2ActualAnswer;
			L2UserAnswer9 = L2UserAnswer;
			set1Quetion10(sc);
			L2Question10 = L2Question;
			L2ActualAnswer10 = L2ActualAnswer;
			L2UserAnswer10 = L2UserAnswer;
			
		}
		else if(Attempt ==1) 
		{
			Attempt++;
			L2Marks =0;
			set2Quetion1(sc);
			L2Question1 = L2Question;
			L2ActualAnswer1 = L2ActualAnswer;
			L2UserAnswer1 = L2UserAnswer;
			set2Quetion2(sc);
			L2Question2 = L2Question;
			L2ActualAnswer2 = L2ActualAnswer;
			L2UserAnswer2 = L2UserAnswer;
			set2Quetion3(sc);
			L2Question3 = L2Question;
			L2ActualAnswer3 = L2ActualAnswer;
			L2UserAnswer3 = L2UserAnswer;
			set2Quetion4(sc);
			L2Question4 = L2Question;
			L2ActualAnswer4 = L2ActualAnswer;
			L2UserAnswer4 = L2UserAnswer;
			set2Quetion5(sc);
			L2Question5 = L2Question;
			L2ActualAnswer5 = L2ActualAnswer;
			L2UserAnswer5 = L2UserAnswer;
			set2Quetion6(sc);
			L2Question6 = L2Question;
			L2ActualAnswer6 = L2ActualAnswer;
			L2UserAnswer6 = L2UserAnswer;
			set2Quetion7(sc);
			L2Question7 = L2Question;
			L2ActualAnswer7 = L2ActualAnswer;
			L2UserAnswer7 = L2UserAnswer;
			set2Quetion8(sc);
			L2Question8 = L2Question;
			L2ActualAnswer8 = L2ActualAnswer;
			L2UserAnswer8 = L2UserAnswer;
			set2Quetion9(sc);
			L2Question9 = L2Question;
			L2ActualAnswer9 = L2ActualAnswer;
			L2UserAnswer9 = L2UserAnswer;
			set2Quetion10(sc);
			L2Question10 = L2Question;
			L2ActualAnswer10 = L2ActualAnswer;
			L2UserAnswer10 = L2UserAnswer;	
		}
		L2Menu(sc);
		
	}
	public void set1Quetion1(Scanner sc){
		try 
		{
			L2Question = "What does DDL stand for in the context of databases?";
			a = "a. Data Description Language";
			b = "b. Database Design Language";
			c = "c. Data Definition Language";
			d = "d. Database Description Language";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = c;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set1Quetion1(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set1Quetion1(sc);
		}
	}
	
	public void set1Quetion2(Scanner sc){
		try 
		{
			L2Question = "Which DDL command is used to change the structure of an existing table?";
			a = "a. MODIFY";
			b = "b.  ALTER";
			c = "c. CHANGE";
			d = "d. UPDATE";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = b;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set1Quetion2(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set1Quetion2(sc);
		}
	}
	public void set1Quetion3(Scanner sc){
		try 
		{
			L2Question = "Which DDL statement is used to remove a primary key constraint from a table?";
			a = "a.  REMOVE PRIMARY KEY";
			b = "b. DELETE PRIMARY KEY";
			c = "c. DROP PRIMARY KEY";
			d = "d. ALTER PRIMARY KEY";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = c;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set1Quetion3(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set1Quetion3(sc);
		}
	}
	
	public void set1Quetion4(Scanner sc){
		try 
		{
			L2Question = "In DDL, what is the purpose of the UNIQUE constraint?";
			a = "a. To ensure the uniqueness of values in a column";
			b = "b. To specify a default value for a column";
			c = "c. To enforce a condition on the values entered into a column";
			d = "d. To allow null values in a column";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = a;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set1Quetion4(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set1Quetion4(sc);
		}
	}	
	
	public void set1Quetion5(Scanner sc){
		try 
		{
			L2Question = "Which DDL command is used to rename a column in a table?";
			a = "a. MODIFY COLUMN";
			b = "b. RENAME COLUMN";
			c = "c. CHANGE COLUMN";
			d = "d. ALTER COLUMN";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = b;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set1Quetion5(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set1Quetion5(sc);
		}
	}
	
	public void set1Quetion6(Scanner sc){
		try 
		{
			L2Question = "In SQL, what does the COMMIT statement do?";
			a = "a.  Rolls back the current transaction.";
			b = "b.  Saves the current transaction to the database.";
			c = "c.  Adds a new record to a table.";
			d = "d.  Deletes records from a table.";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = b;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set1Quetion6(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set1Quetion6(sc);
		}
	}
	
	public void set1Quetion7(Scanner sc){
		try 
		{
			L2Question = "What is the purpose of the TRUNCATE TABLE statement in DDL?";
			a = "a. To delete all records from a table without removing the table structure";
			b = "b. To drop a table from the database";
			c = "c. To remove a column from a table";
			d = "d. To alter the data type of a column";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = a;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set1Quetion7(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set1Quetion7(sc);
		}
	}
	
	public void set1Quetion8(Scanner sc){
		try 
		{
			L2Question = "In SQL, how many columns can you make foreign keys for using the ALTER TABLE statement?";
			a = "a. Only one column per ALTER TABLE statement";
			b = "b. Multiple columns in a single ALTER TABLE statement";
			c = "c. Unlimited columns in a single ALTER TABLE statement";
			d = "d. Depends on the database management system (DBMS) used";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = b;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set1Quetion8(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set1Quetion8(sc);
		}
	}
		
	public void set1Quetion9(Scanner sc){
		try 
		{
			L2Question = "Add Discount coloumn in market table. which one is correct?";
			a = "a. MODIFY TABLE MARKET ADD DISCOUNT NUMBER(100) NULL;";
			b = "b. UPDATE TABLE MARKET ADD DISCOUNT NUMBER(100) NULL;";
			c = "c. RENAME TABLE MARKET ADD DISCOUNT NUMBER(100) NULL;";
			d = "d. ALTER TABLE MARKET ADD DISCOUNT NUMBER(100) NULL;";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = d;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set1Quetion9(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set1Quetion9(sc);
		}
	}
	
	public void set1Quetion10(Scanner sc){
		try 
		{
			L2Question = "Syntax of DROP?";
			a = "a. MODIFY TABLE TABLENAME DROP CONSTRAINTS CONSTRAINT-REFERNCE-NAME; ";
			b = "b. ALTER TABLE TABLENAME DROP CONSTRAINTS CONSTRAINT-REFERNCE-NAME; ";
			c = "c. CREATE TABLE TABLENAME DROP CONSTRAINTS CONSTRAINT-REFERNCE-NAME;";
			d = "d. UPDATE TABLE TABLENAME DROP CONSTRAINTS CONSTRAINT-REFERNCE-NAME;";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = b;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set1Quetion10(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set1Quetion10(sc);
		}
	}
		
// ----------------------------------------------------------------------------------------------------------------------------------------
		// L2QuestionSet2
		
	public void set2Quetion1(Scanner sc){
		try 
		{
			L2Question = "Which DDL command is used to change the data type of a column?";
			a = "a. MODIFY COLUMN";
			b = "b. ALTER COLUMN";
			c = "c. CHANGE COLUMN";
			d = "d. MODIFY DATA TYPE";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = a;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set2Quetion1(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set2Quetion1(sc);
		}
	}
	
	
	public void set2Quetion2(Scanner sc){
		try 
		{
			L2Question = "Which DDL command is used to revoke permissions from a user?";
			a = "a. REVOKE";
			b = "b. DENY";
			c = "c. REMOVE";
			d = "d. CANCEL";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = a;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set2Quetion2(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set2Quetion2(sc);
		}
	}
	
	public void set2Quetion3(Scanner sc){
		try 
		{
			L2Question = "What is the purpose of the TRUNCATE TABLE statement in DDL?";
			a = "a. To delete all records from a table without removing the table structure";
			b = "b. To drop a table from the database";
			c = "c. To remove a column from a table";
			d = "d. To alter the data type of a column";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = c;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set2Quetion3(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set2Quetion3(sc);
		}
	}
	
	public void set2Quetion4(Scanner sc){
		try 
		{
			L2Question = "L2Question: Which DDL statement is used to grant permissions to a user?";
			a = "a. GRANT";
			b = "b. ALLOW";
			c = "c. GIVE";
			d = "d. PERMIT";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = a;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set2Quetion4(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set2Quetion4(sc);
		}
		
	}	

	public void set2Quetion5(Scanner sc){
		try 
		{
			L2Question = "L2Question: Which DDL command is used to add a new column to an existing table? ";
			a = "a. ADD";
			b = "b. INSERT";
			c = "c. APPEND";
			d = "d. EXTEND";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = a;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set2Quetion5(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(NumberFormatException e) {
			System.out.println("Something is wrong");
			set2Quetion5(sc);
		}
		
	}	

	public void set2Quetion6(Scanner sc){
		try 
		{
			L2Question = "What is the purpose of the SQL MERGE statement?";
			a = "a. To update existing records and insert new records if they do not exist.";
			b = "b. To delete records from a table.";
			c = "c.  To insert a new record into a table.";
			d = "d.  To create a new table by combining data from multiple tables.";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = a;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set2Quetion6(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set2Quetion6(sc);
		}
	}
	
	public void set2Quetion7(Scanner sc){
		try 
		{
			L2Question = "What is the purpose of the SQL INSERT statement?";
			a = "a. To delete records from a table.";
			b = "b. To update existing records.";
			c = "c. To insert new records into a table.";
			d = "d. To create a new table.t";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = c;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set2Quetion7(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set2Quetion7(sc);
		}
	}
	
	public void set2Quetion8(Scanner sc){
		try 
		{
			L2Question = "Which SQL statement is used to remove records from a table?";
			a = "a.  DELETE";
			b = "b.  REMOVE";
			c = "c.  ERASE";
			d = "d.  DROP";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = a;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set2Quetion8(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set2Quetion8(sc);
		}
	}
		
	public void set2Quetion9(Scanner sc){
		try 
		{
			L2Question = "What is the purpose of the SQL TRUNCATE TABLE statement?";
			a = "a. To drop the table from the database.";
			b = "b. To remove all records from a table.";
			c = "c. To delete specific records from a table. ";
			d = "d. To modify the structure of an existing table.";
			
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = b;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set2Quetion9(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set2Quetion9(sc);
		}
	}
	
	public void set2Quetion10(Scanner sc){
		try 
		{
			L2Question = "In SQL, what does the ROLLBACK statement do?";
			a = "a. Removes all records from a table.";
			b = "b. Restores the database to its state before the transaction.";
			c = "c. Updates existing records in a table.";
			d = "d.  Adds a new record to a table.";
			System.out.println("L2Question: "+L2Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L2ActualAnswer = b;
			System.out.println(L2ActualAnswer);
			if(input =='a' || input =='A') {
				L2UserAnswer = a;
			}
			else if(input =='b' || input =='B') {
				L2UserAnswer = b;
			}
			else if(input =='c' || input =='C') {
				L2UserAnswer = c;
			}
			else if(input =='d' || input =='D') {
				L2UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				set2Quetion10(sc);
			}
			System.out.println(L2UserAnswer);
			if (this.L2ActualAnswer.equals(L2UserAnswer)) {
				System.out.println("Your answer is correct!");
				L2Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			set2Quetion10(sc);
		}
	}	
	
	
	public void L2viewAnswers(Scanner sc) {
		try {
			if(Attempt==0) {
				System.out.println("You didn't play game yet!!!");
				System.out.println("Press 1 for Play Game");
				System.out.println("Press 2 for Go back to previous menu");
				System.out.println("Press 3 for Main Menu");
				String s = sc.next();
				int input = Integer.parseInt(s);
				if(input ==1) {
					L2QuestionSet(sc);
				}
				else if(input ==2) {
					L2Menu(sc);
				}
				else if(input ==3) {
					level(sc, CurrentLevel, L2Marks);;
				}
				else {
					System.err.println("Input is Incorrect!");
					L2viewAnswers(sc);
				}
				
			}
			
			else{
				System.out.println("=================================================================");
				System.out.println("1: "+L2Question1);
				System.out.println("Selected Answers: "+ L2UserAnswer1);
				System.out.println("Correct Answers: "+ L2ActualAnswer1);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("2: "+L2Question2);
				System.out.println("Selected Answers: "+ L2UserAnswer2);
				System.out.println("Correct Answers: "+ L2ActualAnswer2);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("3: "+L2Question3);
				System.out.println("Selected Answers: "+ L2UserAnswer3);
				System.out.println("Correct Answers: "+ L2ActualAnswer3);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("4: "+L2Question4);
				System.out.println("Selected Answers: "+ L2UserAnswer4);
				System.out.println("Correct Answers: "+ L2ActualAnswer4);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("5: "+L2Question5);
				System.out.println("Selected Answers: "+ L2UserAnswer5);
				System.out.println("Correct Answers: "+ L2ActualAnswer5);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("6: "+L2Question6);
				System.out.println("Selected Answers: "+ L2UserAnswer6);
				System.out.println("Correct Answers: "+ L2ActualAnswer6);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("7: "+L2Question7);
				System.out.println("Selected Answers: "+ L2UserAnswer7);
				System.out.println("Correct Answers: "+ L2ActualAnswer7);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("8: "+L2Question8);
				System.out.println("Selected Answers: "+ L2UserAnswer8);
				System.out.println("Correct Answers: "+ L2ActualAnswer8);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("9: "+L2Question9);
				System.out.println("Selected Answers: "+ L2UserAnswer9);
				System.out.println("Correct Answers: "+ L2ActualAnswer9);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("10: "+L2Question10);
				System.out.println("Selected Answers: "+ L2UserAnswer10);
				System.out.println("Correct Answers: "+ L2ActualAnswer10);
				System.out.println("=================================================================");
			}
		}
		catch (NumberFormatException nfe) {
			System.out.println("something is wrong!");
			L2viewAnswers(sc);
		}
	}
	
	public void L2score(Scanner sc) {
		try {
			if(L2Marks ==0) {
				L2viewAnswers(sc);
			}
			else if(L2Marks>=5) {
				System.out.println("Congratulations, "+name);
				System.out.println("Congratulations, you completed the LeveL2");
				System.out.println("Your Score is "+ L2Marks+ "/10");
				System.out.println("1. Play Next Level");
				System.out.println("2. Play Again");
				System.out.println("3. View Answer");
				System.out.println("4. Go to Main Menu");
				String s = sc.next();
				int input = Integer.parseInt(s);
				if(input ==1) {
				}
				else if(input ==1) {
					L2QuestionSet(sc);
				}
				else if(input ==2) {
					L2viewAnswers(sc);
				}
				else if(input ==4) {
					level(sc, CurrentLevel, L2Marks);
				}
				else {
					System.err.println("Incorrect Input");
					L2score(sc);
				}
			}
			else
			{
				
				System.out.println("Opps! "+ name);
				System.out.println("Your Failed to Complete!!!");
				System.out.println("your Score is "+ L2Marks+ "/10");
				if(L2Marks <5) {
					System.out.println("1. Play Again");
					System.out.println("2. View Answer");
					System.out.println("3. Go to Main Menu");
					String s = sc.next();
					int input = Integer.parseInt(s);
					if(input ==1) {
						L2QuestionSet(sc);
					}
					else if(input ==2) {
						L2viewAnswers(sc);
					}
					else if(input ==3) {
						level(sc, CurrentLevel, L2Marks);
					}
					else {
						System.err.println("Incorrect Input");
						L2score(sc);
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
						
					}
					else if(input ==2) {
						L2QuestionSet(sc);
					}
					else if(input ==3) {
						L2viewAnswers(sc);
					}
					else if(input ==4) {
						this.CurrentLevel = "LeveL2";
						level(sc, CurrentLevel, L2Marks);
					}
					else {
						System.err.println("Incorrect input");
						L2score(sc);
					}
				}
			}
		}
		catch(NumberFormatException nfe) {
			System.err.println("Something is wrong.");
			L2score(sc);
		}
	}
	public void L2Menu(Scanner sc) {
		try {
			System.out.println("---------------");
			System.out.println("Level 2");
			System.out.println("---------------");
			System.out.println("1. Play");
			System.out.println("2.Check your score");
			System.out.println("3. View your answers");
			String s = sc.next();
			int input = Integer.parseInt(s);
			switch (input) {
			case 1: L2QuestionSet(sc);
				break;
			case 2: L2score(sc);
				break;
			case 3: L2viewAnswers(sc);
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + input);
			}
		}
		catch(NumberFormatException nfe) {
			System.err.println("Invalid input!!!");
			L2Menu(sc);
		}
	}
}
