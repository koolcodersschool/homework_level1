package office_hours_8;

public class FizzBuzz {
	/**
	Create a class and name it  FizzBuzz.
	Write a program which finds out the given number is FizzBuzz number or Fizz Number or Buzz Number
	For example your program should check numbers between 1 - 20
	Within given range above your program should check each number and:
	if the number divides by 3 and 5 without remainder it is FizzBuzz number
	if the number divides by 3 without remainder it is Fizz number
	if the number divides by 5 without remainder it is Buzz number
	Your output should look like this within 1 - 20 range:
	0 is FizzBuzz number
	3 is Fizz number
	5 is Buzz number
	6 is Fizz number
	9 is Fizz number
	10 is Buzz number
	12 is Fizz number
	15 is FizzBuzz number
	18 is Fizz number
	20 is Buzz number
	Submit your code as usual
	*/
	public static void main(String[] args) {
		int number = 1;
		while(number <= 20) {
			if(number % 3 == 0 && number % 5 == 0) {
				System.out.println(number + " is FizzBuzz number");
			}else if(number % 3 == 0) {
				System.out.println(number + " is Fizz number");
			}else if(number % 5 == 0) {
				System.out.println(number + " is Buzz number");
			}
			number++;
		}
		
	}

}
