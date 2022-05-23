package office_hours_3;

import java.util.Scanner;

public class GameScoreHomework {
	/**
	Create a class and name it GameScoreHomework
	Write a code based on the following requirements.
	Once you done coding upload your file like always. If you forget how to upload file you can watch the video under day 3 assignment.

	* When you run your code in the consol it should say "Welcome to my program"

	* In the new line it should say "You will enter team scores and we will tell you which team won the game"

	* In the new line it should say "Enter team_1's score"

	* Then user should enter "team_1's score" (for example 5) from keyboard and press enter

	* Then it should say "Enter team_2's score"

	* Then user should enter "team_1's score" (for example 3) from keyboard and press enter

	* Then in the consol it should say "team_1 won the game against team_2. Score was: 5 - 3"

	* In the new line it should say "If you want to check another game please run your code again"

	* In the new line it should say "Thank you for using koolCoder's program"

	*/
	public static void main(String[] args) {
		 System.out.println("Welcome to my program");
		 System.out.println("You will enter team scores and we will tell you which team won the game");
		 System.out.println("Enter team_1's score");
		 Scanner keyboard = new Scanner(System.in);
		 int team1 = keyboard.nextInt();

		 System.out.println("Enter team_2's score");
		 int team2 = keyboard.nextInt();

		 if(team1 > team2) {
			 System.out.println("team_1 won the game against team_2. Score was: " + team1 + " - " + team2);
		 }else {
			 System.out.println("team_2 won the game against team_1. Score was: " + team2 + " - " + team1);
		 }
	}

}
