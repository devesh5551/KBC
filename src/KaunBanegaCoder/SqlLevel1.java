package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SqlLevel1 extends SQL {

	int L1Marks=0;
	String L1Question1;
	String L1UserAnswer1;
	String L1ActualAnswer1;
	String L1Question2;
	String L1UserAnswer2;
	String L1ActualAnswer2;
	String L1Question3;
	String L1UserAnswer3;
	String L1ActualAnswer3;
	String L1Question4;
	String L1UserAnswer4;
	String L1ActualAnswer4;
	String L1Question5;
	String L1UserAnswer5;
	String L1ActualAnswer5;
	String L1Question6;
	String L1UserAnswer6;
	String L1ActualAnswer6;
	String L1Question7;
	String L1UserAnswer7;
	String L1ActualAnswer7;
	String L1Question8;
	String L1UserAnswer8;
	String L1ActualAnswer8;
	String L1Question9;
	String L1UserAnswer9;
	String L1ActualAnswer9;
	String L1Question10;
	String L1UserAnswer10;
	String L1ActualAnswer10;
	String L1Question ="";
	String a;
	String b;
	String c;
	String d;
	String L1UserAnswer;
	String L1ActualAnswer;
	int Attempt;
	
	public void L1QuestionSet(Scanner sc){
		if (Attempt ==0) 
		{
			Attempt++;
			L1Marks =0;
			L1set1Quetion1(sc);
			L1Question1 = L1Question;
			L1ActualAnswer1 = L1ActualAnswer;
			L1UserAnswer1 = L1UserAnswer;
			System.out.println(L1Marks);
			L1set1Quetion2(sc);
			L1Question2 = L1Question;
			L1ActualAnswer2 = L1ActualAnswer;
			L1UserAnswer2 = L1UserAnswer;
			L1set1Quetion3(sc);
			L1Question3 = L1Question;
			L1ActualAnswer3 = L1ActualAnswer;
			L1UserAnswer3 = L1UserAnswer;
			System.out.println(L1Marks);
			L1set1Quetion4(sc);
			L1Question4 = L1Question;
			L1ActualAnswer4 = L1ActualAnswer;
			L1UserAnswer4 = L1UserAnswer;
			System.out.println(L1Marks);
			L1set1Quetion5(sc);
			L1Question5 = L1Question;
			L1ActualAnswer5 = L1ActualAnswer;
			L1UserAnswer5 = L1UserAnswer;
			L1set1Quetion6(sc);
			L1Question6 = L1Question;
			L1ActualAnswer6 = L1ActualAnswer;
			L1UserAnswer6 = L1UserAnswer;
			L1set1Quetion7(sc);
			L1Question7 = L1Question;
			L1ActualAnswer7 = L1ActualAnswer;
			L1UserAnswer7 = L1UserAnswer;
			L1set1Quetion8(sc);
			L1Question8 = L1Question;
			L1ActualAnswer8 = L1ActualAnswer;
			L1UserAnswer8 = L1UserAnswer;
			L1set1Quetion9(sc);
			L1Question9 = L1Question;
			L1ActualAnswer9 = L1ActualAnswer;
			L1UserAnswer9 = L1UserAnswer;
			L1set1Quetion10(sc);
			L1Question10 = L1Question;
			L1ActualAnswer10 = L1ActualAnswer;
			L1UserAnswer10 = L1UserAnswer;
			
		}
		else if(Attempt ==1) 
		{
			Attempt++;
			L1Marks =0;
			L1set2Quetion1(sc);
			L1Question1 = L1Question;
			L1ActualAnswer1 = L1ActualAnswer;
			L1UserAnswer1 = L1UserAnswer;
			L1set2Quetion2(sc);
			L1Question2 = L1Question;
			L1ActualAnswer2 = L1ActualAnswer;
			L1UserAnswer2 = L1UserAnswer;
			L1set2Quetion3(sc);
			L1Question3 = L1Question;
			L1ActualAnswer3 = L1ActualAnswer;
			L1UserAnswer3 = L1UserAnswer;
			L1set2Quetion4(sc);
			L1Question4 = L1Question;
			L1ActualAnswer4 = L1ActualAnswer;
			L1UserAnswer4 = L1UserAnswer;
			L1set2Quetion5(sc);
			L1Question5 = L1Question;
			L1ActualAnswer5 = L1ActualAnswer;
			L1UserAnswer5 = L1UserAnswer;
			L1set2Quetion6(sc);
			L1Question6 = L1Question;
			L1ActualAnswer6 = L1ActualAnswer;
			L1UserAnswer6 = L1UserAnswer;
			L1set2Quetion7(sc);
			L1Question7 = L1Question;
			L1ActualAnswer7 = L1ActualAnswer;
			L1UserAnswer7 = L1UserAnswer;
			L1set2Quetion8(sc);
			L1Question8 = L1Question;
			L1ActualAnswer8 = L1ActualAnswer;
			L1UserAnswer8 = L1UserAnswer;
			L1set2Quetion9(sc);
			L1Question9 = L1Question;
			L1ActualAnswer9 = L1ActualAnswer;
			L1UserAnswer9 = L1UserAnswer;
			L1set2Quetion10(sc);
			L1Question10 = L1Question;
			L1ActualAnswer10 = L1ActualAnswer;
			L1UserAnswer10 = L1UserAnswer;	
		}
		L1score(sc);
		
	}
	public void L1set1Quetion1(Scanner sc){
		try 
		{
			L1Question = "What does the term CRUD stand for in the context of a database?";
			a = "a. Cryptography, Read, Update, Delete";
			b = "b. Create, Retrieve, Update, Destroy";
			c = "c.  Compile, Run, Upload, Delete";
			d = "d. Copy, Read, Update, Duplicate";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = b;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set1Quetion1(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set1Quetion1(sc);
		}
	}
	
	public void L1set1Quetion2(Scanner sc){
		try 
		{
			L1Question = "Which of the following are not types of Database Management Systems (DBMS)?";
			a = "a. RDBMS";
			b = "b. Network DBMS";
			c = "c. Object Oriented DBMS";
			d = "d. SDBMS";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = d;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set1Quetion2(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set1Quetion2(sc);
		}
	}
	public void L1set1Quetion3(Scanner sc){
		try 
		{
			L1Question = "In Char DataType, unused memory will be sent back to RAM for further operation.";
			a = "a. TRUE";
			b = "b. False";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = b;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set1Quetion3(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set1Quetion3(sc);
		}
	}
	
	public void L1set1Quetion4(Scanner sc){
		try 
		{
			L1Question = "L1Question: Number(0,9)  Which one is correct? ";
			a = "a. 0.000";
			b = "b. 0";
			c = "c. Error";
			d = "d. none of these";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = c;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set1Quetion4(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set1Quetion4(sc);
		}
	}	
	
	public void L1set1Quetion5(Scanner sc){
		try 
		{
			L1Question = "Size of CHAR";
			a = "a. 1000";
			b = "b. 2000";
			c = "c. 4000";
			d = "d. 8000";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = b;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set1Quetion5(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set1Quetion5(sc);
		}
	}
	
	public void L1set1Quetion6(Scanner sc){
		try 
		{
			L1Question = "What is Null?";
			a = "a. Constraints";
			b = "b. Data-Type";
			c = "c. Keyword";
			d = "d. condition";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = c;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set1Quetion6(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set1Quetion6(sc);
		}
	}
	
	public void L1set1Quetion7(Scanner sc){
		try 
		{
			L1Question = "Which Statement in Incorrect?  Characterstics of Foreign key:- bn ";
			a = "a. Duplicate object is allowed.";
			b = "b. combination of unique & not null is mandatory";
			c = "c. It is also called as Refrentials Integrity Constraint";
			d = "d. It can have duplicate";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = b;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set1Quetion7(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set1Quetion7(sc);
		}
	}
	
	public void L1set1Quetion8(Scanner sc){
		try 
		{
			L1Question = "What is NotNull?";
			a = "a. Constraints";
			b = "b. Data-Type";
			c = "c. Keyword";
			d = "d. Primary key";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = a;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set1Quetion8(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set1Quetion8(sc);
		}
	}
		
	public void L1set1Quetion9(Scanner sc){
		try 
		{
			L1Question = "What type of data we can store in CHAR Data-Type?";
			a = "a. a-z";
			b = "b. 0-9 ";
			c = "c. A-z";
			d = "d. all the above";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = d;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set1Quetion9(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set1Quetion9(sc);
		}
	}
	
	public void L1set1Quetion10(Scanner sc){
		try 
		{
			L1Question = "Syntax of Date?";
			a = "a. Date; ";
			b = "b. DD-MON-YY ";
			c = "c. DD-MON-YYYY";
			d = "d. all the above";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = a;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set1Quetion10(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set1Quetion10(sc);
		}
	}
		
// ----------------------------------------------------------------------------------------------------------------------------------------
		// L1QuestionSet2
		
	public void L1set2Quetion1(Scanner sc){
		try 
		{
			L1Question = "Which rules followed by DataBase?";
			a = "a. CURD";
			b = "b. CRD";
			c = "c. CRUD";
			d = "d. CRDE";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = c;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A') {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set2Quetion1(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set2Quetion1(sc);
		}
	}
	
	
	public void L1set2Quetion2(Scanner sc){
		try 
		{
			L1Question = "Select which statement is incorrect in EF-code rule.";
			a = "a. Data to be entered by the into cell should be single valued data or atomic data";
			b = "b. To validate the  data we assign datatypes & constraints";
			c = "c. Data-types is mandatory";
			d = "d. Constraint is mandatory";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = c;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set2Quetion2(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set2Quetion2(sc);
		}
	}
	
	public void L1set2Quetion3(Scanner sc){
		try 
		{
			L1Question = "Size of Varchar2";
			a = "a. 1000";
			b = "b. 2000";
			c = "c. 4000";
			d = "d. 8000";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = c;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set2Quetion3(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set2Quetion3(sc);
		}
	}
	
	public void L1set2Quetion4(Scanner sc){
		try 
		{
			L1Question = "L1Question: Maximum Number(2,5)  Which one is correct? ";
			a = "a. 999.99";
			b = "b. 99.999";
			c = "c. 0.0099";
			d = "d. 0.00099";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = d;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set2Quetion4(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set2Quetion4(sc);
		}
		
	}	

	public void L1set2Quetion5(Scanner sc){
		try 
		{
			L1Question = "L1Question: Which one is Incorrect? Types of Data ";
			a = "a. char";
			b = "b. varchar";
			c = "c. int";
			d = "d. Large Object";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = c;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set2Quetion5(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set2Quetion5(sc);
		}
		
	}	

	public void L1set2Quetion6(Scanner sc){
		try 
		{
			L1Question = "What is Check?";
			a = "a. Constraints";
			b = "b. Data-Type";
			c = "c. Keyword";
			d = "d. Others";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = a;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set2Quetion6(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set2Quetion6(sc);
		}
	}
	
	public void L1set2Quetion7(Scanner sc){
		try 
		{
			L1Question = "Which Primary Key Statement in Incorrect?";
			a = "a. Duplicate object is not allowed.";
			b = "b. combination of unique & not null is mandatory";
			c = "c. Only one primary key present inside table";
			d = "d. It can have null object";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = d;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set2Quetion7(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set2Quetion7(sc);
		}
	}
	
	public void L1set2Quetion8(Scanner sc){
		try 
		{
			L1Question = "What is Unique?";
			a = "a. Constraints";
			b = "b. Data-Type";
			c = "c. Keyword";
			d = "d. Primary key";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = a;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set2Quetion8(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set2Quetion8(sc);
		}
	}
		
	public void L1set2Quetion9(Scanner sc){
		try 
		{
			L1Question = "What type of data we can store in Varchar Data-Type?";
			a = "a. a-z";
			b = "b. 0-9 ";
			c = "c. A-z";
			d = "d. all the above";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = d;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set2Quetion9(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set2Quetion9(sc);
		}
	}
	
	public void L1set2Quetion10(Scanner sc){
		try 
		{
			L1Question = "What is Date?";
			a = "a. Constraints";
			b = "b. Data-Type";
			c = "c. Keyword";
			d = "d. Primary key";
			System.out.println("L1Question: "+L1Question);
			System.out.println("options:    " );
			System.out.println("       "+a);
			System.out.println("       "+b);
			System.out.println("       "+c);
			System.out.println("       "+d);
			System.out.println("------------------------------------");
			System.out.println("Select Options: ");
			char input = sc.next().charAt(0);
			this.L1ActualAnswer = b;
			System.out.println(L1ActualAnswer);
			if(input =='a'|| input =='A')  {
				L1UserAnswer = a;
			}
			else if(input =='b'|| input =='B')  {
				L1UserAnswer = b;
			}
			else if(input =='c'|| input =='C')  {
				L1UserAnswer = c;
			}
			else if(input =='d'|| input =='D')  {
				L1UserAnswer = d;
			}
			else {
				System.out.println("Incorrect Input, please enter valid input");
				L1set2Quetion10(sc);
			}
			System.out.println(L1UserAnswer);
			if (this.L1ActualAnswer.equals(L1UserAnswer)) {
				System.out.println("Your answer is correct!");
				L1Marks++;
			}
			else {
				System.out.println("Opps! your answer is incorrect!!!");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Something is wrong");
			L1set2Quetion10(sc);
		}
	}	
	
	
	public void L1viewAnswers(Scanner sc) {
		try {
			if(Attempt==0) {
				System.out.println("You didn't play game yet!!!");
				System.out.println("Press 1 for Play Game");
				System.out.println("Press 2 for Go back to previous menu");
				System.out.println("Press 3 for Main Menu");
				String s = sc.next();
				int input = Integer.parseInt(s);
				if(input ==1)  {
					L1QuestionSet(sc);
				}
				else if(input ==2) {
					L1Menu(sc);
				}
				else if(input ==3) {
					mainMenu(sc);
				}
				else {
					System.err.println("Input is Incorrect!");
					L1viewAnswers(sc);
				}
				
			}
			
			else{
				System.out.println("=================================================================");
				System.out.println("1: "+L1Question1);
				System.out.println("Selected Answers: "+ L1UserAnswer1);
				System.out.println("Correct Answers: "+ L1ActualAnswer1);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("2: "+L1Question2);
				System.out.println("Selected Answers: "+ L1UserAnswer2);
				System.out.println("Correct Answers: "+ L1ActualAnswer2);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("3: "+L1Question3);
				System.out.println("Selected Answers: "+ L1UserAnswer3);
				System.out.println("Correct Answers: "+ L1ActualAnswer3);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("4: "+L1Question4);
				System.out.println("Selected Answers: "+ L1UserAnswer4);
				System.out.println("Correct Answers: "+ L1ActualAnswer4);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("5: "+L1Question5);
				System.out.println("Selected Answers: "+ L1UserAnswer5);
				System.out.println("Correct Answers: "+ L1ActualAnswer5);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("6: "+L1Question6);
				System.out.println("Selected Answers: "+ L1UserAnswer6);
				System.out.println("Correct Answers: "+ L1ActualAnswer6);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("7: "+L1Question7);
				System.out.println("Selected Answers: "+ L1UserAnswer7);
				System.out.println("Correct Answers: "+ L1ActualAnswer7);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("8: "+L1Question8);
				System.out.println("Selected Answers: "+ L1UserAnswer8);
				System.out.println("Correct Answers: "+ L1ActualAnswer8);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("9: "+L1Question9);
				System.out.println("Selected Answers: "+ L1UserAnswer9);
				System.out.println("Correct Answers: "+ L1ActualAnswer9);
				System.out.println("-----------------------------------------------------------------");
				System.out.println("10: "+L1Question10);
				System.out.println("Selected Answers: "+ L1UserAnswer10);
				System.out.println("Correct Answers: "+ L1ActualAnswer10);
				System.out.println("=================================================================");
			}
		}
		catch (InputMismatchException ime) {
			System.out.println("something is wrong!");
			L1viewAnswers(sc);
		}
	}
	
	public void L1score(Scanner sc) {
		try {
			if(L1Marks ==0) {
				L1viewAnswers(sc);
			}
			else if(L1Marks>=5) {
				System.out.println("Congratulations, "+name);
				System.out.println("Congratulations, you completed the Level1");
				System.out.println("Your Score is "+ L1Marks+ "/10");
				System.out.println("1. Play Next Level");
				System.out.println("2. Play Again");
				System.out.println("3. View Answer");
				System.out.println("4. Go to Main Menu");
				String s = sc.next();
				int input = Integer.parseInt(s);
				if(input ==1)  {
				}
				else if(input ==2)  {
					L1QuestionSet(sc);
				}
				else if(input ==3) {
					L1viewAnswers(sc);
				}
				else if(input ==4) {
					mainMenu(sc);;
				}
				else {
					System.err.println("Incorrect Input");
					L1score(sc);
				}
			}
			else
			{
				
				System.out.println("Opps! "+ name);
				System.out.println("Your Failed to Complete!!!");
				System.out.println("your Score is "+ L1Marks+ "/10");
				if(L1Marks <5) {
					System.out.println("1. Play Again");
					System.out.println("2. View Answer");
					System.out.println("3. Go to Main Menu");
					String s = sc.next();
					int input = Integer.parseInt(s);
					if(input ==1)  {
						L1QuestionSet(sc);
					}
					else if(input ==2) {
						L1viewAnswers(sc);
					}
					else if(input ==3) {
						mainMenu(sc);
					}
					else {
						System.err.println("Incorrect Input");
						L1score(sc);
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
						L1QuestionSet(sc);
					}
					else if(input =='c'|| input =='C')  {
						L1viewAnswers(sc);
					}
					else if(input ==4) {
						String CurrentLevel = "Level1";
						level(sc, CurrentLevel, L1Marks);
					}
					else {
						System.err.println("Incorrect input");
						L1score(sc);
					}
				}
			}
		}
		catch(InputMismatchException ime) {
			System.err.println("Something is wrong.");
			L1score(sc);
		}
	}
	public void L1Menu(Scanner sc) {
		try {
			System.out.println("1. Play");
			System.out.println("2.Check your score");
			System.out.println("3. View your answers");
			String s = sc.next();
			int input = Integer.parseInt(s);
			switch (input) {
			case 1: L1QuestionSet(sc);
				break;
			case 2: L1score(sc);
				break;
			case 3: L1viewAnswers(sc);
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + input);
			}
		}
		catch(NumberFormatException nfe) {
			System.err.println("Invalid type input");
			L1Menu(sc);
		}
	}
}
