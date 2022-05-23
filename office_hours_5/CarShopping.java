package office_hours_5;

import java.util.Scanner;

public class CarShopping {
	/**
	Create a class and name it CarShoppingWithScanner  

	* Let's say user have a budget $35000 and user wants to buy one of the following car models:
	* BMW, Honda, Toyota, Tesla
	* When you run your code in the consol it should say "Welcome to my program"
	* In the new line it should say "You will enter car model, price and we will tell you if you can afford it or not and it's good car model option for you or not"
	* In the new line it should say "Enter car model"
	* Then user should enter "car model" (for example BMW) from keyboard and press enter
	* Then it should say "Enter price"
	* Then user should enter "price" (for example 29000) from keyboard and press enter
	* Then in the consol it should say "BMW is the best option for you."
	* In the new line it should say "You can afford it. Go for it"
	* In the new line it should say "If you want to check another option please run your code again"
	* In the new line it should say "Thank you for using koolCoder's program"
	* Let's say you run your program again and entered Tesla and 50000
	* Then in the consol it should say "Tesla is the best option for you."
	* In the new line it should say "Unfortunately you can't afford it. Check another option."
	* In the new line it should say "If you want to check another option please run your code again"
	* In the new line it should say "Thank you for using koolCoder's program"
	* Let's say you run your program again and entered Audi and 10000
	* Then in the consol it should say "Audi is NOT the best option for you. Check another option."
	* In the new line it should say "If you want to check another option please run your code again"
	* In the new line it should say "Thank you for using koolCoder's program"
	Once you done upload your file as usual and turn in the assignment

	*/
	
	public static void main(String[] args) {
		System.out.println("Welcome to my program");
		System.out.println("You will enter car model, price and we will tell you if you can afford it or not and it's good car model option for you or not");
		System.out.println("Enter car model");
		Scanner keyboard = new Scanner(System.in);
		String carModel = keyboard.next();
		System.out.println("Enter price");
		double price = keyboard.nextDouble();
		double budget = 35000;
		
		if(price <= budget && (carModel.equalsIgnoreCase("BMW"))) {
			System.out.println("BMW is the best option for you");
			System.out.println("You can afford it. Go for it");
		}else if(price <= budget && (carModel.equalsIgnoreCase("Honda"))) {
			System.out.println("Honda is the best option for you");
			System.out.println("You can afford it. Go for it");
		}else if(price <= budget && (carModel.equalsIgnoreCase("Toyota"))) {
			System.out.println("Toyota is the best option for you");
			System.out.println("You can afford it. Go for it");
		}else if(price <= budget && (carModel.equalsIgnoreCase("Tesla"))) {
			System.out.println("Tesla is the best option for you");
			System.out.println("You can afford it. Go for it");
		}else if(price > budget) {
			System.out.println("Sorry you don't have enough money to buy any car");
		}else {
			System.out.println(carModel + " is not best option for u");
		}
		
		System.out.println("If you want to check another option please run your code again");
		System.out.println("Thank you for using koolCoder's program");
	}

}
