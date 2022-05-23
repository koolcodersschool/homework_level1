package office_hours_4;

import java.util.Scanner;

public class CitizenHomeworkWithScanner {
	
	public static void main(String[] args) {
		System.out.println("Enter age: ");
		Scanner keyboard = new Scanner(System.in);
		
		int age = keyboard.nextInt();
		
		if(age >= 60) {
			System.out.println("Senior citizen");
		}else {
			System.out.println("Non senior citizen");
		}
	}

}
