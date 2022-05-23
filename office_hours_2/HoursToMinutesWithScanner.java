package office_hours_2;

import java.util.Scanner;

public class HoursToMinutesWithScanner {
	/**

	* Create a class and name it HoursToMinutesWithScanner

	* When you run your code in the consol it should say "Welcome to my program"

	* In the new line it should say "You will enter hours and we will convert it to minutes "

	* In the new line it should say "Enter hours "

	* Then user should enter hours from keyboard (for example 2) and press enter

	* Then in the consol it should say " 2 hours = 120 minutes"

	* In the new line it should say "If you want to check another amount please run your code again"

	* In the new line it should say "Thank you for using KoolCoder's program"


	After you write your code please run it and see the results and upload your file as usual. 

	*/
	public static void main(String[] args) {
		System.out.println("Welcome to my program");
		System.out.println("You will enter hours and we will convert it to minutes");
		System.out.println("Enter hours");
		Scanner keyboard = new Scanner(System.in);
		int hours = keyboard.nextInt();
		int minutes = hours * 60;
		System.out.println(hours + " hours = " + minutes + " minutes");
		System.out.println("If you want to check another amount please run your code again");
		System.out.println("Thank you for using KoolCoder's program");
	}

}
