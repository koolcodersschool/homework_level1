package office_hours_3;

import java.util.Scanner;

public class ProductScanHomework {
	/**
	Create a class and name it ProductScanHomework
	And write a code based on the following requirements:
	Once you done coding upload your file like always. If you forget how to upload file you can watch the video under day 3 assignment.

	* When you run your code in the consol it should say "Welcome to my program"

	* In the new line it should say "You will enter product name and we will tell you it is healthy or not"

	* In the new line it should say "Enter product name"

	* Then user should enter product name from keyboard and press enter

	* If user enters "milk" from keyboard

	* Then in the consol it should say "milk is healthy"

	* if user enters anything else

	* Then in the consol it should say "We don't have such product in our system. Please add it"

	* In the new line it should say "If you want to check another product please run your code again"

	* In the new line it should say "Thank you for using koolCoder's program"

	*/
	public static void main(String[] args) {
		System.out.println("Welcome to my program");
		System.out.println("You will enter product name and we will tell you it is healthy or not");
		System.out.println("Enter product name");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.next();
		if(name.equals("milk")) {
			System.out.println(name + " is healthy");
		}else {
			System.out.println("We don't have such product in our system. Please add it");
		}

		System.out.println("If you want to check another product please run your code again");
		System.out.println("Thank you for using koolCoder's program");
	}

}
