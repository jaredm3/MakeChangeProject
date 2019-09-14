import java.util.Scanner;

public class MakeChangeApp {

	static double itemPrice; // static so methods can read
	static double amountTendered; // variables
	static double difference;
	static int penny = 0, nickel = 0, dime = 0, quarter = 0;
	static int twentyDollar = 0, oneDollar = 0, fiveDollar = 0, tenDollar = 0;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the price of the item: "); // gets input
		itemPrice = keyboard.nextDouble();

		System.out.print("Enter the amount tendered: "); // gets input
		amountTendered = keyboard.nextDouble();

		difference = amountTendered - itemPrice; // used to print amount of change

		boolean isChangeDue = calculateChange(itemPrice, amountTendered); // is change due?

		if (isChangeDue) {
			printResults(); // prints the results
		}

		keyboard.close();

	}

	public static boolean calculateChange(double itemPrice, double amountTendered) {
		// calculates change due
		// returns true if change is due, false if no change is due

		double changeDue = amountTendered - itemPrice;
		int subChangeDue = 0;

		if (changeDue == 0.0) {
			System.out.println("You provided the exact amount! Thank you come again!");
			return false;
		} else if (changeDue < 0) {
			System.out.println("Thats not enough. Please insert more money.");
			return false;
		} else if (changeDue > 0) { // starts at highest denom. & works down to lowest

			while (changeDue >= 20) {
				changeDue -= 20;
				twentyDollar++;
			}
			while (changeDue >= 10) {
				changeDue -= 10;
				tenDollar++;
			}
			while (changeDue >= 5) {
				changeDue -= 5;
				fiveDollar++;
			}
			while (changeDue >= 1) {
				changeDue -= 1;
				oneDollar++;
			}

			// fixes rounding issues in the 100th place holder
			changeDue = changeDue + 0.001;

			// Takes changeDue(0.xx) and casts it to an int subChangeDue(xx)
			subChangeDue = (int) (changeDue * 100);

			while (subChangeDue >= 25) {
				subChangeDue -= 25;
				quarter++;
			}
			while (subChangeDue >= 10) {
				subChangeDue -= 10;
				dime++;
			}
			while (subChangeDue >= 5) {
				subChangeDue -= 5;
				nickel++;
			}
			while (subChangeDue >= 1) {
				subChangeDue -= 1;
				penny++;
			}
		}
		return true;
	}

	public static void printResults() {
		// prints results
		System.out.print("\nChange due: $");
		System.out.printf("%.2f", difference);
		System.out.println("\n" + "--------------------");

		printMonies(twentyDollar, "Twenty Dollar Bill");
		printMonies(tenDollar, "Ten Dollar Bill");
		printMonies(fiveDollar, "Five Dollar Bill");
		printMonies(oneDollar, "One Dollar Bill");
		printMonies(quarter, "Quarter");
		printMonies(dime, "Dime");
		printMonies(nickel, "Nickel");
		printMonies(penny, "Penny");

		System.out.println("--------------------\n" + "Thank you come again!");
	}

	public static void printMonies(int amount, String type) {
		if (type.equals("Penny")) {
			if (amount > 1) {
				System.out.println(amount + " Pennies");
			} else if (amount > 0) {
				System.out.println(amount + " Penny");
			}
			return;
		}
		if (amount > 1) {
			System.out.println(amount + " " + type + "s");
		} else if (amount > 0) {
			System.out.println(amount + " " + type);
		}
	}
}