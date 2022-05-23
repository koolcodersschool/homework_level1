package office_hours_4;

import java.util.Scanner;

public class LanguagesWithGreetingsHomeworkWithScanner {
	
	public static void main(String[] args) {
		String language = "";
		String greeting = "";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter option:");
		int option = keyboard.nextInt();
		
		if(option == 1) {
			language = "English";
			greeting = "Hello";
		}else if(option == 2) {
			language = "Spanish";
			greeting = "Hola";
		}else if(option == 3) {
			language = "French";
			greeting = "Bonjour";
		}else if(option == 4) {
			language = "Azeri";
			greeting = "Salam";
		}else if(option == 5) {
			language = "Russion";
			greeting = "Privet";
		}else if(option == 6) {
			language = "Turkish";
			greeting = "Merhaba";
		}else {
			System.out.println("We don't have that option. Please try 1 to 6. Thank you.");
		}
		
		System.out.println(language + " --> " + greeting);
	}

}
