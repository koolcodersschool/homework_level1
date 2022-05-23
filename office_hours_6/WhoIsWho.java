package office_hours_6;

import java.util.Scanner;

public class WhoIsWho {
	/**
	Create a class and name it WhoIsWho
	Write a program which prints following based on the beginning of the given String

	For example:
	given String is "Mr. John Doe" your program should print "Man"
	given String is "Mrs. Barbara Liskov" your program should print "Woman"
	given String is "Ms. Ada Lovelace" your program should print "Woman"
	given String is "Dr. Ghassan Atiyeh" your program should print "Doctor"
	given String is "Prof. Walter Levin" your program should print "Professor"

	Submit your code as usual.
	*/
	public static void main(String[] args) {
		System.out.println("Please enter full name");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		if(name.contains("Mr.")) {
			System.out.println("Man");
		}else if(name.contains("Mrs.")) {
			System.out.println("Woman");
		}else if(name.contains("Ms.")) {
			System.out.println("Woman");
		}else if(name.contains("Dr.")) {
			System.out.println("Doctor");
		}else if(name.contains("Prof.")) {
			System.out.println("Professor");
		}else {
			System.out.println("Sorry!! We didn't find any match in our database");
		}
		
	}

}
