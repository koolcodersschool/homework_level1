package office_hours_2;

public class CentsToDollars {
	/**
	*Convert cents to dollars:

	Create a class and name it CentsToDollars

	* 1. Create a int variable and name it cent

	* 2. Create another int variable and name it dollar

	* 3. Create another int variable and name it remainingCents

	* 4. write a code of how convert cents to dollars and assign the result of calculation to dollar variable

	* 5. write a code of how to find remaining cents and assign the result of calculation to remainingCents variable

	* 6. print dollar variable

	* 7. print remainingCents variable

	* little tip: you can use "%" to find remaining cents. % operator gives us remainder. For example if you type:
	int result = 9 % 7;
	System.out.println(result);
	It will print 2, because 2 remains when divide 9 to 7.

	After you write your code please run it and see the results and upload your file as usual. 

	*/
	public static void main(String[] args) {
		int cent = 125;
		int dollar;
		int remainingCents;
		dollar = cent / 100;
		remainingCents = cent % 100;
		System.out.println("dollar = " + dollar);
		System.out.println("remainingCents = " + remainingCents);
		
	}

}
