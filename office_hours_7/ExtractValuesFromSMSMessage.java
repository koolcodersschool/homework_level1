package office_hours_7;

public class ExtractValuesFromSMSMessage {
	
	/**
	Create a class and name it 
	ExtractValuesFromSMSMessage
	Write a program which extracts first name, last name, phone number, message text values from given SMS message
	Given SMS message_1 is: "Sender: [kool coders] From Number<5712202222>, Message: {Hey, kool coders! You are great now! You are going to be even greater!}"
	Your program should print:
	First name: kool
	Last name: coders
	Phone number: 5712202222
	Message: Hey, kool coders! You are great now! You are going to be even greater!
	
	Given SMS message_2 is: "Sender: [Elon Mask] From Number<7032212333>, Message: {Hey, I am going to the Moon! Would you like to join me? Reply YES if you are in.}"
	Your program should print:
	First name: Elon
	Last name: Mask
	Phone number: 7032212333
	Message: Hey, I am going to the Moon! Would you like to join me? Reply YES if you are in.



	*/
	public static void main(String[] args) {
		String messageSMS = "Sender: [kool coders] From Number<5712202222>, Message: {Hey, kool coders! You are great now! You are going to be even greater!}";
		String fullName = messageSMS.substring(messageSMS.indexOf("[") + 1, messageSMS.indexOf("]"));
		String firstName = fullName.substring(0, fullName.indexOf(" "));
		String lastName = fullName.substring(fullName.indexOf(" ") + 1);
		String phoneNumber = messageSMS.substring(messageSMS.indexOf("<") + 1, messageSMS.indexOf(">"));
		String message = messageSMS.substring(messageSMS.indexOf("{") + 1, messageSMS.indexOf("}"));
		
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Message: " + message);
		
	}

}
