package office_hours_6;

import java.util.Scanner;

public class BuildAnEmail {
	/*
	Create a class and name it BuildAnEmail
	Given 3 String firstName, lastName and domain variables which can be different values.
	Using these data create an email address.
	Little tip: you will use String concatination here.
	Submit your code as usual.
	*/
	
	public static void main(String[] args) {
		System.out.print("Enter first name: ");
		Scanner keyboard = new Scanner(System.in);
		String firstName = keyboard.next();
		System.out.print("Enter last name: ");
		String lastName = keyboard.next();
		System.out.print("Enter domain: ");
		String domain = keyboard.next();
		String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + domain.toLowerCase() + ".com";
		System.out.println("Hi [" + firstName + " " + lastName + "] this is your email: [" + email + "]");
	}

}
