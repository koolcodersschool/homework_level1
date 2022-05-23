package office_hours_6;

import java.util.Scanner;

public class CheckThePassword {
	/*
	Create a class and name it CheckThePassword
	Given String password which can have different values
	The requirement of password is:
	it should contain more than 8 characters and less than 16 characters.
	if requirement matches then print -> "You can use this password"
	otherwise print -> "Error: Password should contain more than 8 characters and less than 16 characters"
	Submit your code as usual.
	*/
	
	public static void main(String[] args) {
		System.out.print("Enter your password: ");
		Scanner keyboard = new Scanner(System.in);
		String password = keyboard.next();
		if(password.length() >= 8 && password.length() <= 16) {
			System.out.println("You can use this password");
		}else {
			System.out.println("Error: Password should contain more than 8 characters and less than 16 characters");
		}
	}

}
