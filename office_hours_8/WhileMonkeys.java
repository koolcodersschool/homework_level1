package office_hours_8;

public class WhileMonkeys {
	/**
	Create a class and name it WhileMonkeys
	print 5 Little Monkeys jumping on the bed with while loop
	*/
	public static void main(String[] args) {
		int monkeyCount = 5;
		while(monkeyCount > 0) {
			System.out.println(monkeyCount + " little monkeys jumping on the bed,");
			System.out.println("One fell down and bumped his head,");
			System.out.println("Mama called the doctor and the doctor said,");
			System.out.println("No more monkeys jumping on the bed!");
			monkeyCount--;
		}
		System.out.println("Put those monkeys right to bed!");
	}

}
