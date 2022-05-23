package office_hours_7;


public class PrintTheWordBetweenSquareBrackets {
	/**
	Create a class and name it 
	PrintTheWordBetweenSquareBrackets
	Write a program prints the word between square brackets [] in the given sentence.
	Given sentence_1 is: I am a [java] programmer.
	Your program should print: java
	Given sentence_2 is: I am a [javascript] programmer.
	Your program should print: javascript
	Given sentence_2 is: I am a [python] programmer.
	Your program should print: python


	*/
	public static void main(String[] args) {
		String sentence = "I am a [java] programmer.";
		
		String outPut = sentence.substring(sentence.indexOf("[")+1, sentence.indexOf("]"));
		
		System.out.println(outPut);
		
		
	}

}
