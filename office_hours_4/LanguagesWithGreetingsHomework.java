package office_hours_4;

public class LanguagesWithGreetingsHomework {
	
	/**
	Create a class and name it LanguagesWithGreetingsHomework
	Write a code When you run your code based on what option you choose it should print language and greeting in that language.

	Options are the following:

	String language = "";

	String greeting = "";

	int option = 1;

	1 -> language is "English" and greeting is "Hello!""

	2 -> language is "Spanish" and greeting is "Hola!"

	3 -> language is "French" and greeting is "Bonjour!"

	4 -> language is "Azeri" and greeting is "Salam!"

	5 -> language is "Russian" and greeting is "Privet!"

	6 -> language is "Turkish" and greeting is "Merhaba!"

	Any other:

	-> We don't have that option. Please try 1 to 6. Thank you.



	For example if you assign 4 to option variable it should print. "Azeri ---> Salam"

	if you assign 1 to option variable it should print. "English ---> Hello"

	Once you have done coding submit your file.

	*/
	
	public static void main(String[] args) {
		String language = "";
		String greeting = "";
		int option = 3;
		
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
