package office_hours_6;

import java.util.Scanner;

public class CheckFirstAndLastLetter {
	
	/*
	Create a class and name it CheckFirstAndLastLetter
	Given a String str that can have different values. 
	Get first and last letters.
	Then check if they are same or not.
	If they are same print "Looks like polindrome"
	otherwise "Definitely NOT polindrome"

	Submit your code as usual.
	*/
	public static void main(String[] args) {
		System.out.print("Enter the word: ");
		Scanner keyboard = new Scanner(System.in);
		String str = keyboard.next();
		char firstLetter = str.toLowerCase().charAt(0);
		char lastLetter = str.toLowerCase().charAt(str.length() - 1);
		if(firstLetter == lastLetter) {
			System.out.println("Looks like polindrome");
		}else {
			System.out.println("Definitely NOT polindrome");
		}
	}

}
