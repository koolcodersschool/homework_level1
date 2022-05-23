package office_hours_5;

import java.util.Scanner;

public class SeasonFinder {
	
	/**
	Write a program which tells to the user Season based on month number
	Create a class and name it SeasonFinder

	When you run your program it should say "Welcome to my program"
	In the new line it should say "You will enter month number (from 1 to 12) and we will tell you which season is it"
	In the new line it should say "Enter month number"
	Then user enters month number like "4" and presses enter
	Then in the consol it should say "It is Spring"
	In the new line it should say "If you want to check another option please run your code again"
	In the new line it should say "Thank you for using koolCoder's program"
	if user enters month number like "12" and presses enter
	Then in the consol it should say "It is Winter" and etc.
	        If you user enters 13 and presses enter
	        Then in the consol it should say "Just enter correct month number :)"
	        Once you done upload your file as usual and turn in the assignment.

	*/
	
	public static void main(String[] args) {
		System.out.println("Welcome to my program");
		System.out.println("You will enter month number (from 1 to 12) and we will tell you which season is it");
		System.out.println("Enter month number");
		Scanner keyboard = new Scanner(System.in);
		int monthNumber = keyboard.nextInt();
		switch(monthNumber) {
		case 1:
			System.out.println("It is winter");
			break;
		case 2:
			System.out.println("It is winter");
			break;
		case 3:
			System.out.println("It is spring");
			break;
		case 4:
			System.out.println("It is spring");
			break;
		case 5:
			System.out.println("It is spring");
			break;
		case 6:
			System.out.println("It is summer");
			break;
		case 7:
			System.out.println("It is summer");
			break;
		case 8:
			System.out.println("It is summer");
			break;
		case 9:
			System.out.println("It is fall");
			break;
		case 10:
			System.out.println("It is fall");
			break;
		case 11:
			System.out.println("It is fall");
			break;
		case 12:
			System.out.println("It is winter");
			break;
		default:
			System.out.println("Just enter correct month number :)");
		}
	}

}
