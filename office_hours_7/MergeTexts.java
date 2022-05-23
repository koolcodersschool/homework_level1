package office_hours_7;

public class MergeTexts {
	
	/**
	Create a class and name it MergeTexts
	Write a program which merges the given word with the given pattern
	Given pattern is: -->[]<--
	Given word is: koolCoders
	Your output in the consol should be: -->[koolCoders]<--
	*/
	
	public static void main(String[] args) {
		String pattern = "-->[]<--";
		String word = "koolcoders";
		String outPut = pattern.substring(0, pattern.indexOf("[")+1) + word + pattern.substring(pattern.indexOf("]"));
		System.out.println(outPut);
	}

}
