package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java extends MainMenu {
	int Level1Marks;
	int Level2Marks;
	int Level3Marks;
	int Level4Marks;
	int Level5Marks;
	String CurrentLevel = "Level 1";;
	
	public void JavaLevels(Scanner sc) 
	{
		try 
		{
			System.out.println("Level 1");
			System.out.println("Level 2");
			System.out.println("Level 3");
			System.out.println("Level 4");
			System.out.println("Level 5");
			int input = sc.nextInt();
			sc.nextLine();
			System.out.println("HELLO");
			SqlLevel1 ref1 = new SqlLevel5();
			if(input==1) 
			{
				CurrentLevel = "Level 1";
				ref1.L1Menu(sc);
				System.out.println("Level1 Marks: "+ref1.L1Marks);
				// Updation of Level1 Highest Score
				if(Level1Marks<ref1.L1Marks) 
				{
					Level1Marks = ref1.L1Marks;
					CurrentLevel = "Level 2";
				}
			//-------------------------------------------------------------------------
			// Level1 Ended
				
			//-------------------------------------------------------------------------
			//Level2
				// Unlocked next Level2
				if (ref1.L1Marks>=5) {
					SqlLevel2 ref2 = (SqlLevel2) ref1; //Down-Casting 
					ref2.L2Menu(sc);
					// Score Updation
					if(Level2Marks<ref2.L2Marks) 
					{
						Level2Marks = ref2.L2Marks;
						CurrentLevel = "Level 3";
					}
			//-------------------------------------------------------------------------
			// Level2 Ended
					
			//--------------------------------------------------------------------------
			//Level3
					// Unlocked next Level2
					if (ref2.L2Marks>=5) {
						SqlLevel3 ref3 = (SqlLevel3) ref2; //Down-Casting 
						ref3.L3Menu(sc);
						
						if(Level3Marks<ref3.L3Marks) 
						{
							Level3Marks = ref3.L3Marks;
							CurrentLevel = "Level 4";	
						}
						if(Level3Marks>=5) {
							SqlLevel4 ref4 = (SqlLevel4) ref3; //Down-Casting 
							ref4.L4Menu(sc);
							if(Level4Marks<ref4.L4Marks) 
							{
								Level4Marks = ref4.L4Marks;
								CurrentLevel = "Level 5";
							}
							if (ref4.L4Marks>=5) {
								SqlLevel5 ref5 = (SqlLevel5) ref4; //Down-Casting 
								ref5.L5Menu(sc);
								
								if(Level5Marks<ref5.L5Marks) 
								{
									Level5Marks = ref5.L5Marks;
									CurrentLevel = "Level 6";	
								}
							}
						}
					}
				}
				
			}
			else if(input ==2) 
			{
				if(Level1Marks<ref1.L1Marks) 
				{
					Level1Marks = ref1.L1Marks;
					CurrentLevel = "Level 2";
				}
			//-------------------------------------------------------------------------
			// Level1 Ended
				
			//-------------------------------------------------------------------------
			//Level2
				// Unlocked next Level2
				if (ref1.L1Marks>=5) {
					SqlLevel2 ref2 = (SqlLevel2) ref1; //Down-Casting 
					ref2.L2Menu(sc);
					// Score Updation
					if(Level2Marks<ref2.L2Marks) 
					{
						Level2Marks = ref2.L2Marks;
						CurrentLevel = "Level 3";
					}
			//-------------------------------------------------------------------------
			// Level2 Ended
					
			//--------------------------------------------------------------------------
			//Level3
					// Unlocked next Level2
					if (Level2Marks>=5) {
						SqlLevel3 ref3 = (SqlLevel3) ref2; //Down-Casting 
						ref3.L3Menu(sc);
						
						if(Level3Marks<ref3.L3Marks) 
						{
							Level3Marks = ref3.L3Marks;
							CurrentLevel = "Level 4";	
						}
						if(Level3Marks>=5) {
							SqlLevel4 ref4 = (SqlLevel4) ref3; //Down-Casting 
							ref4.L4Menu(sc);
							if(Level4Marks<ref4.L4Marks) 
							{
								Level4Marks = ref4.L4Marks;
								CurrentLevel = "Level 5";
							}
							if (ref4.L4Marks>=5) {
								SqlLevel5 ref5 = (SqlLevel5) ref4; //Down-Casting 
								ref5.L5Menu(sc);
								
								if(Level5Marks<ref5.L5Marks) 
								{
									Level5Marks = ref5.L5Marks;
									CurrentLevel = "Level 6";	
								}
								

							}
							
						}
					}
				}
				else 
				{
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					JavaLevels(sc);
				}
			}
			
			else if(input==3) {
				if (Level2Marks>=5) {
					SqlLevel3 ref3 = (SqlLevel3) ref1; //Down-Casting 
					ref3.L3Menu(sc);
					
					if(Level3Marks<ref3.L3Marks) 
					{
						Level3Marks = ref3.L3Marks;
						CurrentLevel = "Level 4";	
					}
					if(Level3Marks>=5) {
						SqlLevel4 ref4 = (SqlLevel4) ref3; //Down-Casting 
						ref4.L4Menu(sc);
						if(Level4Marks<ref4.L4Marks) 
						{
							Level4Marks = ref4.L4Marks;
							CurrentLevel = "Level 5";
						}
						if (ref4.L4Marks>=5) {
							SqlLevel5 ref5 = (SqlLevel5) ref4; //Down-Casting 
							ref5.L5Menu(sc);
							
							if(Level5Marks<ref5.L5Marks) 
							{
								Level5Marks = ref5.L5Marks;
								CurrentLevel = "Level 6";	
							}
						}
						
					}
				}
				else {
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					JavaLevels(sc);
				}
			}
			else if(input ==4)
			{
				if(Level3Marks>=5) {
					SqlLevel4 ref4 = (SqlLevel4) ref1; //Down-Casting 
					ref4.L4Menu(sc);
					if(Level4Marks<ref4.L4Marks) 
					{
						Level4Marks = ref4.L4Marks;
						CurrentLevel = "Level 5";
					}
					if (Level4Marks>=5) {
						SqlLevel5 ref5 = (SqlLevel5) ref4; //Down-Casting 
						ref5.L5Menu(sc);
						
						if(Level5Marks<ref5.L5Marks) 
						{
							Level5Marks = ref5.L5Marks;
							CurrentLevel = "Level 6";	
						}
					}
					
				}
				else {
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					JavaLevels(sc);
				}
			}
			else if(input ==5) {
				if (Level4Marks>=5) {
					SqlLevel5 ref5 = (SqlLevel5) ref1; //Down-Casting 
					ref5.L5Menu(sc);
					
					if(Level5Marks<ref5.L5Marks) 
					{
						Level5Marks = ref5.L5Marks;
						CurrentLevel = "Level 6";	
					}
					if(Level5Marks>=5) {
						SqlLevel6 ref6 = (SqlLevel6) ref5; //Down-Casting 
						ref6.L6Menu(sc);
					
					}
				}
				else {
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					JavaLevels(sc);
					
				}
				
			}
			
			else {
				System.err.println("Incorrect Input, please Re-try!!!");
				JavaLevels(sc);
			}
			
			
		}
		catch(InputMismatchException ime) {
			
		}
	}
	
	public void level(Scanner sc, String CurrentLevel, int Marks){
		this.CurrentLevel = CurrentLevel;
		if(CurrentLevel.equals("Level 1")) {
			Level1Marks = Marks;
		}
		else if(CurrentLevel.equals("Level 2")) {
			Level2Marks = Marks;
		}
		else if(CurrentLevel.equals("Level 3")) {
			Level3Marks = Marks;
		}
		else if(CurrentLevel.equals("Level 4")) {
			Level4Marks = Marks;
		}
		else if(CurrentLevel.equals("Level 5")) {
			Level5Marks = Marks;
		}
		mainMenu(sc);
	}
}
