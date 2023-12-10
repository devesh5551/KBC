package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SQL extends MainMenu {
	int Level1Marks;
	int Level2Marks;
	int Level3Marks;
	int Level4Marks;
	int Level5Marks;
	int Level6Marks;
	int Level7Marks;
	int Level8Marks;
	int Level9Marks;
	int Level10Marks;
	String CurrentLevel = "Level 1";;
	
	public void SqlLevels(Scanner sc) 
	{
		try 
		{
			System.out.println("Level 1: DataBase");
			System.out.println("Level 2: DDL & DML");
			System.out.println("Level 3: DCL & TCL");
			System.out.println("Level 4: DQL Basic");
			System.out.println("Level 5: Operators");
			System.out.println("Level 6: Functions");
			System.out.println("Level 7: Clauses");
			System.out.println("Level 8: SubQuery");
			System.out.println("Level 9: Joins");
			System.out.println("Level 10: PSeudo Column");
			int input = sc.nextInt();
			sc.nextLine();
			System.out.println("HELLO");
			SqlLevel1 ref1 = new SqlLevel10();
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
								if(Level5Marks>=5) {
									SqlLevel6 ref6 = (SqlLevel6) ref5; //Down-Casting 
									ref6.L6Menu(sc);
									
									if(Level6Marks<ref6.L6Marks) 
									{
										Level6Marks = ref6.L6Marks;
										CurrentLevel = "Level 7";	
									}
									if(Level6Marks>=5) {
										SqlLevel7 ref7 = (SqlLevel7) ref6; //Down-Casting 
										ref7.L7Menu(sc);
										
										if(Level7Marks<ref7.L7Marks) 
										{
											Level7Marks = ref7.L7Marks;
											CurrentLevel = "Level 8";	
										}
										if(Level7Marks>=5) {
											SqlLevel8 ref8 = (SqlLevel8) ref7; //Down-Casting 
											ref8.L8Menu(sc);
											
											if(Level8Marks<ref8.L8Marks) 
											{
												Level8Marks = ref8.L8Marks;
												CurrentLevel = "Level 9";	
											}
											if(Level8Marks>=5) {
												SqlLevel9 ref9 = (SqlLevel9) ref8; //Down-Casting 
												ref9.L9Menu(sc);
												if(Level9Marks<ref9.L9Marks) 
												{
													Level9Marks = ref9.L9Marks;
													CurrentLevel = "Level 10";	
												}
												if(Level8Marks>=5) {
													SqlLevel10 ref10 = (SqlLevel10) ref9; //Down-Casting 
													ref10.L10Menu(sc);
												}
											}

										}
									}
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
								if(Level5Marks>=5) {
									SqlLevel6 ref6 = (SqlLevel6) ref5; //Down-Casting 
									ref6.L6Menu(sc);
									
									if(Level6Marks<ref6.L6Marks) 
									{
										Level6Marks = ref6.L6Marks;
										CurrentLevel = "Level 7";	
									}
									if(Level6Marks>=5) {
										SqlLevel7 ref7 = (SqlLevel7) ref6; //Down-Casting 
										ref7.L7Menu(sc);
										
										if(Level7Marks<ref7.L7Marks) 
										{
											Level7Marks = ref7.L7Marks;
											CurrentLevel = "Level 8";	
										}
										if(Level7Marks>=5) {
											SqlLevel8 ref8 = (SqlLevel8) ref7; //Down-Casting 
											ref8.L8Menu(sc);
											
											if(Level8Marks<ref8.L8Marks) 
											{
												Level8Marks = ref8.L8Marks;
												CurrentLevel = "Level 9";	
											}
											if(Level8Marks>=5) {
												SqlLevel9 ref9 = (SqlLevel9) ref8; //Down-Casting 
												ref9.L9Menu(sc);
												if(Level9Marks<ref9.L9Marks) 
												{
													Level9Marks = ref9.L9Marks;
													CurrentLevel = "Level 10";	
												}
												if(Level8Marks>=5) {
													SqlLevel10 ref10 = (SqlLevel10) ref9; //Down-Casting 
													ref10.L10Menu(sc);
												}
											}

										}
									}
								}
							}
							
						}
					}
				}
				else 
				{
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					SqlLevels(sc);
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
							if(Level5Marks>=5) {
								SqlLevel6 ref6 = (SqlLevel6) ref5; //Down-Casting 
								ref6.L6Menu(sc);
								
								if(Level6Marks<ref6.L6Marks) 
								{
									Level6Marks = ref6.L6Marks;
									CurrentLevel = "Level 7";	
								}
								if(Level6Marks>=5) {
									SqlLevel7 ref7 = (SqlLevel7) ref6; //Down-Casting 
									ref7.L7Menu(sc);
									
									if(Level7Marks<ref7.L7Marks) 
									{
										Level7Marks = ref7.L7Marks;
										CurrentLevel = "Level 8";	
									}
									if(Level7Marks>=5) {
										SqlLevel8 ref8 = (SqlLevel8) ref7; //Down-Casting 
										ref8.L8Menu(sc);
										
										if(Level8Marks<ref8.L8Marks) 
										{
											Level8Marks = ref8.L8Marks;
											CurrentLevel = "Level 9";	
										}
										if(Level8Marks>=5) {
											SqlLevel9 ref9 = (SqlLevel9) ref8; //Down-Casting 
											ref9.L9Menu(sc);
											if(Level9Marks<ref9.L9Marks) 
											{
												Level9Marks = ref9.L9Marks;
												CurrentLevel = "Level 10";	
											}
											if(Level8Marks>=5) {
												SqlLevel10 ref10 = (SqlLevel10) ref9; //Down-Casting 
												ref10.L10Menu(sc);
											}
										}

									}
								}
							}
						}
						
					}
				}
				else {
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					SqlLevels(sc);
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
						if(Level5Marks>=5) {
							SqlLevel6 ref6 = (SqlLevel6) ref5; //Down-Casting 
							ref6.L6Menu(sc);
							
							if(Level6Marks<ref6.L6Marks) 
							{
								Level6Marks = ref6.L6Marks;
								CurrentLevel = "Level 7";	
							}
							if(Level6Marks>=5) {
								SqlLevel7 ref7 = (SqlLevel7) ref6; //Down-Casting 
								ref7.L7Menu(sc);
								
								if(Level7Marks<ref7.L7Marks) 
								{
									Level7Marks = ref7.L7Marks;
									CurrentLevel = "Level 8";	
								}
								if(Level7Marks>=5) {
									SqlLevel8 ref8 = (SqlLevel8) ref7; //Down-Casting 
									ref8.L8Menu(sc);
									
									if(Level8Marks<ref8.L8Marks) 
									{
										Level8Marks = ref8.L8Marks;
										CurrentLevel = "Level 9";	
									}
									if(Level8Marks>=5) {
										SqlLevel9 ref9 = (SqlLevel9) ref8; //Down-Casting 
										ref9.L9Menu(sc);
										if(Level9Marks<ref9.L9Marks) 
										{
											Level9Marks = ref9.L9Marks;
											CurrentLevel = "Level 10";	
										}
										if(Level8Marks>=5) {
											SqlLevel10 ref10 = (SqlLevel10) ref9; //Down-Casting 
											ref10.L10Menu(sc);
										}
									}

								}
							}
						}
					}
					
				}
				else {
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					SqlLevels(sc);
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
						
						if(Level6Marks<ref6.L6Marks) 
						{
							Level6Marks = ref6.L6Marks;
							CurrentLevel = "Level 7";	
						}
						if(Level6Marks>=5) {
							SqlLevel7 ref7 = (SqlLevel7) ref6; //Down-Casting 
							ref7.L7Menu(sc);
							
							if(Level7Marks<ref7.L7Marks) 
							{
								Level7Marks = ref7.L7Marks;
								CurrentLevel = "Level 8";	
							}
							if(Level7Marks>=5) {
								SqlLevel8 ref8 = (SqlLevel8) ref7; //Down-Casting 
								ref8.L8Menu(sc);
								
								if(Level8Marks<ref8.L8Marks) 
								{
									Level8Marks = ref8.L8Marks;
									CurrentLevel = "Level 9";	
								}
								if(Level8Marks>=5) {
									SqlLevel9 ref9 = (SqlLevel9) ref8; //Down-Casting 
									ref9.L9Menu(sc);
									if(Level9Marks<ref9.L9Marks) 
									{
										Level9Marks = ref9.L9Marks;
										CurrentLevel = "Level 10";	
									}
									if(Level9Marks>=5) {
										SqlLevel10 ref10 = (SqlLevel10) ref9; //Down-Casting 
										ref10.L10Menu(sc);
									}
								}

							}
						}
					}
				}
				else {
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					SqlLevels(sc);
					
				}
				
			}
			else if(input==6) {
				if(Level5Marks>=5) {
					SqlLevel6 ref6 = (SqlLevel6) ref1; //Down-Casting 
					ref6.L6Menu(sc);
					
					if(Level6Marks<ref6.L6Marks) 
					{
						Level6Marks = ref6.L6Marks;
						CurrentLevel = "Level 7";	
					}
					if(Level6Marks>=5) {
						SqlLevel7 ref7 = (SqlLevel7) ref6; //Down-Casting 
						ref7.L7Menu(sc);
						
						if(Level7Marks<ref7.L7Marks) 
						{
							Level7Marks = ref7.L7Marks;
							CurrentLevel = "Level 8";	
						}
						if(Level7Marks>=5) {
							SqlLevel8 ref8 = (SqlLevel8) ref7; //Down-Casting 
							ref8.L8Menu(sc);
							
							if(Level8Marks<ref8.L8Marks) 
							{
								Level8Marks = ref8.L8Marks;
								CurrentLevel = "Level 9";	
							}
							if(Level8Marks>=5) {
								SqlLevel9 ref9 = (SqlLevel9) ref8; //Down-Casting 
								ref9.L9Menu(sc);
								if(Level9Marks<ref9.L9Marks) 
								{
									Level9Marks = ref9.L9Marks;
									CurrentLevel = "Level 10";	
								}
								if(Level9Marks>=5) {
									SqlLevel10 ref10 = (SqlLevel10) ref9; //Down-Casting 
									ref10.L10Menu(sc);
								}
							}

						}
					}
				}
				else {
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					SqlLevels(sc);
				}
				
			}
			else if(input ==7) {
				if(Level6Marks>=5) {
					SqlLevel7 ref7 = (SqlLevel7) ref1; //Down-Casting 
					ref7.L7Menu(sc);
					
					if(Level7Marks<ref7.L7Marks) 
					{
						Level7Marks = ref7.L7Marks;
						CurrentLevel = "Level 8";	
					}
					if(Level7Marks>=5) {
						SqlLevel8 ref8 = (SqlLevel8) ref7; //Down-Casting 
						ref8.L8Menu(sc);
						
						if(Level8Marks<ref8.L8Marks) 
						{
							Level8Marks = ref8.L8Marks;
							CurrentLevel = "Level 9";	
						}
						if(Level8Marks>=5) {
							SqlLevel9 ref9 = (SqlLevel9) ref8; //Down-Casting 
							ref9.L9Menu(sc);
							if(Level9Marks<ref9.L9Marks) 
							{
								Level9Marks = ref9.L9Marks;
								CurrentLevel = "Level 10";	
							}
							if(Level9Marks>=5) {
								SqlLevel10 ref10 = (SqlLevel10) ref9; //Down-Casting 
								ref10.L10Menu(sc);
							}
						}

					}
				}
				else {
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					SqlLevels(sc);
				}
			}
			else if(input==8) {
				if(Level7Marks>=5) {
					SqlLevel8 ref8 = (SqlLevel8) ref1; //Down-Casting 
					ref8.L8Menu(sc);
					
					if(Level8Marks<ref8.L8Marks) 
					{
						Level8Marks = ref8.L8Marks;
						CurrentLevel = "Level 9";	
					}
					if(Level8Marks>=5) {
						SqlLevel9 ref9 = (SqlLevel9) ref8; //Down-Casting 
						ref9.L9Menu(sc);
						if(Level9Marks<ref9.L9Marks) 
						{
							Level9Marks = ref9.L9Marks;
							CurrentLevel = "Level 10";	
						}
						if(Level9Marks>=5) {
							SqlLevel10 ref10 = (SqlLevel10) ref9; //Down-Casting 
							ref10.L10Menu(sc);
						}
					}

				}
				else {
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					SqlLevels(sc);
				}
			}
			else if(input==9) {
				if(Level8Marks>=5) {
					SqlLevel9 ref9 = (SqlLevel9) ref1; //Down-Casting 
					ref9.L9Menu(sc);
					if(Level9Marks<ref9.L9Marks) 
					{
						Level9Marks = ref9.L9Marks;
						CurrentLevel = "Level 10";	
					}
					if(Level9Marks>=5) {
						SqlLevel10 ref10 = (SqlLevel10) ref9; //Down-Casting 
						ref10.L10Menu(sc);
					}
				}
				else {
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					SqlLevels(sc);
				}
			}
			else if(input ==10) {
				if(Level9Marks>=5) {
					SqlLevel10 ref10 = (SqlLevel10) ref1; //Down-Casting 
					ref10.L10Menu(sc);
				}
				else {
					System.err.println("you didn't complete above level");
					System.err.println("Please complete "+CurrentLevel);
					SqlLevels(sc);
				}
			}
			else {
				System.err.println("Incorrect Input, please Re-try!!!");
				SqlLevels(sc);
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
		else if(CurrentLevel.equals("Level 6")) {
			Level6Marks = Marks;
		}
		else if(CurrentLevel.equals("Level 7")) {
			Level7Marks = Marks;
		}
		else if(CurrentLevel.equals("Level 8")) {
			Level8Marks = Marks;
		}
		else if(CurrentLevel.equals("Level 9")) {
			Level9Marks = Marks;
		}
		else if(CurrentLevel.equals("Level 10")) {
			Level10Marks = Marks;
		}
		mainMenu(sc);
	}
}
