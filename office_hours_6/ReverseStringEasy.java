package office_hours_6;

import java.util.Scanner;

public class ReverseStringEasy {
	/*
	Create a class and name it ReverseStringEasy
	Given any 5 letter String for example: Yusif
	Make it all lowercase and reverse it like fisuy
	Submit your code as usual
	*/
	public static void main(String[] args) {
		System.out.print("Enter 5 letter word: ");
		Scanner keyboard = new Scanner(System.in);
		String str = keyboard.next();
		String reversedStr = "" + str.charAt(4) + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);
		System.out.println("The reverse version of [" + str + "] is equal to [" + reversedStr + "]");
	}

}
