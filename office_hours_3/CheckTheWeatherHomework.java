package office_hours_3;

import java.util.Scanner;

public class CheckTheWeatherHomework {
	/**
	Create a class and name it CheckTheWeatherHomework
	Write a code based on the following requirements.
	Once you done coding upload your file like always. If you forget how to upload file you can watch the video under day 3 assignment.

	* When you run your code in the consol it should say "Welcome to my program"

	* In the new line it should say "You will enter temperature and we will tell you it is nice day or not"

	* In the new line it should say "Enter temperature"

	* Then user should enter temperature from keyboard and press enter

	* If user enters "more than 70" from keyboard

	* Then in the consol it should say "It is a nice day. You should go outside and take a deep breath. Don't forget to come back, you need to study too)"

	* if user enters "less than 70" from keyboard

	* Then in the consol it should say "It is kind of cold today. Please stay at home and study))"

	* In the new line it should say "If you want to check another temperature please run your code again"

	* In the new line it should say "Thank you for using koolCoder's program"

	*/
	public static void main(String[] args) {
		System.out.println("Welcome to my program");
		System.out.println("You will enter temperature and we will tell you it is nice day or not");
		System.out.println("Enter temperature");

		Scanner keyboard = new Scanner(System.in);
		int temperature = keyboard.nextInt();

		if(temperature > 70) {
			System.out.println("It is a nice day. You should go outside and take a deep breath. Don't forget to come back, you need to study too");
		}else {
			System.out.println("It is kind of cold today. Please stay at home and study");
		}

		System.out.println("If you want to check another temperature please run your code again");
		System.out.println("Thank you for using koolCoder's program");
	}

}
