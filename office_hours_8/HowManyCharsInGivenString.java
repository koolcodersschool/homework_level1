package office_hours_8;

public class HowManyCharsInGivenString {
	/**
	Given a character for example "o"
	Write a program which finds how many times "o" appears in the given String.
	Let's say given char myChar = 'o';
	given sentences is: "We are kool coders";
	Your program should print: "There are 3 [o] in the <We are kool coders>"
	Submit your code as usual.
	*/
	public static void main(String[] args) {
		char myChar = '0';
		String sentence = "We are kool coders";
		int index = 0;
		int count = 0;
		while(index < sentence.length()) {
			if(sentence.charAt(index) == myChar) {
				count++;
			}
			index++;
		}
		String result = "There are 3 [" + myChar + "] in the <" + sentence + ">";
		System.out.println(result);
	}

}
