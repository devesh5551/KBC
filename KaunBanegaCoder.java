package KaunBanegaCoder;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.source.tree.WhileLoopTree;

public class KaunBanegaCoder implements User {

	String name;
	private String Email;
	private String Password;
	private long PhoneNo;
	static int i =0;

	private int  OTP;
	public long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getEmail() {
		return Email;
	}
	public int getOTP() {
		return OTP;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		KaunBanegaCoder ref1 = new KaunBanegaCoder();
		try {
			System.out.println("Press 1 for SignUp");
			System.out.println("Press 2 for Login");
			System.out.println("Press 3 for Cancel");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) 
			{
			case 1: ref1.signUp(sc);
				break;
			case 2: ref1.login(sc);
				break;
			case 3: System.out.println("Thank you for visit!");
				System.exit(0);
				break;
			default:{
				System.out.println("Incorrect Input, please re-try");
				main(null);
				break;
				}	
			}
			MainMenu ref2 = new MainMenu();
			ref2.mainMenu(sc);
			
		} //ending try block
		//catch block
		catch(InputMismatchException ime) {
			System.err.println("Invalid type of input, Please enter valid input");
			main(null);
		} //ending catch block
		/*catch(Exception e) {
			System.err.println("Something is wrong, we can fix this bug");
		}*/
		finally {
			sc.close();
		}
		
	}
	@Override
	public void signUp(Scanner sc) {
		try {
			System.out.print("Enter your name: ");
			this.name = sc.nextLine();
			Email(sc);
			phoneNo(sc);
			generateOTP();
			OTP(sc);
			sc.nextLine();
			System.out.print("Enter Password: ");
			this.Password = sc.nextLine();
			login(sc);
		}
		catch(InputMismatchException ime) {
			System.err.println("Invalid input, please retry");
			signUp(sc);
			
		}
	}
	@Override
	public void login(Scanner sc) {
		try {
				System.out.println("Press 1 for Email & Password");
				System.out.println("Press 2 for Phone No & Password");
				System.out.println("Press 3 for SignUp");
				String n = sc.next();
				int input =Integer.parseInt(n);
				sc.nextLine();
				if (input==1)
				{
					System.out.println("Enter your Email: ");
					String Email = sc.nextLine();
					System.out.println("Enter your Password");
					String Password = sc.nextLine();
					if (this.Password.equals(Password) && this.Email.equals(Email))
					{
						System.out.println("Login Successfull");
					}
					else
					{
						System.err.println("Invalid Credientials!! Please try again");
						login(sc);
					}
				}
				else if (input==2)
				{
					System.out.println("Enter your Phone no: ");
					
					long phoneNO = sc.nextLong();
					sc.nextLine();
					System.out.println("Enter your Password");
					String Password = sc.nextLine();
					if (this.Password.equals(Password) && this.PhoneNo == phoneNO)
					{
						System.out.println("Login Successfull");
					}
					else
					{
						System.err.println("Invalid Credientials!! Please try again");
						login(sc);
					}
				}
				else if (input==2) {
					signUp(sc);
				}
				else {
					System.err.println("Incorrect Input!!!");
					login(sc);
				}
		
		} 
		catch (NullPointerException npe) {
	        System.out.println("You haven't created an account.");
	        login(sc);
	    } 
		catch(NumberFormatException nfe) {
			System.err.println("Input is invlid, please insert input in number(eg.1)");
			login(sc);
		}
		//
		catch (Exception e) {
			System.err.println("Something is wrong");
			main(null);
		}
	}
	
	public void OTP(Scanner sc) {
		try {
			System.out.print("Enter OTP: ");
			String input= sc.next();
			int OTP = Integer.parseInt(input);
			if (OTP == this.OTP) {
				
				}
			else {
				System.out.println("OTP is Incorrect!!!");
				System.out.println("Please re-try");
				OTP(sc);
			}
		}
		catch(NumberFormatException nfe) {
				System.out.println("Invalid type of Input, OTP should be in numeric (eg. 1234)");
				OTP(sc);
			}
		
	}
	public void generateOTP() {
		Random r = new Random();
		OTP = r.nextInt(10000);
		if (OTP > 999) {
			System.err.println("Message from SBI Bank");
			System.out.println(OTP + " is your OTP to validate your number with KBC.");
			System.out.println("Use this to verify and reset secret Password.");
			System.out.println("                                   Team KBC");
		}
		else {
			System.err.println("Try Again!");
			generateOTP();
		}
	}
	public void phoneNo(Scanner sc) {
		try {
			System.out.print("Enter Phone no: ");
			String input = sc.next();
			long PhoneNo = Integer.parseInt(input);
			if (PhoneNo>999999999 && PhoneNo<10000000001L) {
				System.out.println("Valid Phone No: " + PhoneNo);
				setPhoneNo(PhoneNo);
			}
			else {
				System.err.println("Incorrect no, Phone no should be 10 digit!!!");
				phoneNo(sc);
			}
		}
		catch(InputMismatchException ime) {
			System.err.println("Invalid type of Input, input type should be number (eg.1000000000)");
			phoneNo(sc);
		}
		catch(Exception e) {
			System.err.println("Something is wrong, please try again!!!");
			phoneNo(sc);
		}
		
	}
	public void Email(Scanner sc) {
		System.out.print("Enter email address: ");
        String Email = sc.nextLine();

        // Regular expression for basic email validation
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(Email);

        if (matcher.matches()) {
            System.out.println("Valid email: " + Email);
            setEmail(Email);
            
        } else {
            System.out.println("Invalid email format. Please enter a valid email address.");
            Email(sc);
        }

	}
}
