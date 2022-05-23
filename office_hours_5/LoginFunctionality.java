package office_hours_5;

import java.util.Scanner;

public class LoginFunctionality {
	/**
	Create a class and name it LoginFunctionality
	Let's say in your database you have 1 username and 1 password for that username:

	Username: koolcoders
	Password: KoolCoders2021!

	Write a program which does following actions:
	if user enters valid username and password program should print in the consol
	"You logged in successfully. Welcome to koolcoders."
	if user enters valid username and invalid password program should print in the consol
	"You entered invalid password. Try again."
	if user enters invalid username and valid password program should print in the consol
	"You entered invalid username. Try again."
	if user enters invalid username and invalid password program should print in the consol
	"You entered invalid username and password. Try again."
	Once you done upload your file as usual and turn in the assignment.

	*/
	public static void main(String[] args) {
		System.out.println("Enter username:");
		Scanner keyboard = new Scanner(System.in);
		String username = keyboard.next();
		
		System.out.println("Enter password:");
		String password = keyboard.next();
		
		if(!username.equals("koolcoders") && !password.equals("KoolCoders2021!")) {
			System.out.println("You entered invalid username and password. Try again.");
		}else if(username.equals("koolcoders") && password.equals("KoolCoders2021!")) {
			System.out.println("You logged in successfully. Welcome to koolcoders.");
		}else if (username.equals("koolcoders") && !password.equals("KoolCoders2021!")) {
			System.out.println("You entered invalid password. Try again.");
		}else if(!username.equals("koolcoders") && password.equals("KoolCoders2021!")) {
			System.out.println("You entered invalid username. Try again.");
		}
	}

}
