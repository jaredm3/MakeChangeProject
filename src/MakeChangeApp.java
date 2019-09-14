import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double itemPrice, amountTendered, changeDue;
		int penny = 0, nickel = 0, dime = 0, quarter = 0;
		int oneDollar = 0, fiveDollar = 0, tenDollar = 0, twentyDollar = 0;
		int subChangeDue = 0;

		System.out.print("Enter the price of the item: ");
		itemPrice = keyboard.nextDouble();

		System.out.print("Enter the amount tendered: ");
		amountTendered = keyboard.nextDouble();
		
		//calculates change due
		changeDue = amountTendered - itemPrice;

		if (changeDue == 0.0) {
			System.out.println("You provided the exact amount! Thank you come again!");

		} else if (changeDue < 0) {
			System.out.println("Thats not enough. Please insert more money.");
		} else if (changeDue > 0) {    //starts at highest denom. & works down to lowest

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

			while (subChangeDue > 25) {
				subChangeDue -= 25;
				quarter++;
			}
			while (subChangeDue > 10) {
				subChangeDue -= 10;
				dime++;
			}
			while (subChangeDue > 5) {
				subChangeDue -= 5;
				nickel++;
			}
			while (subChangeDue > 0) {
				subChangeDue -= 1;
				penny++;
			}

			System.out.println("Change due:");
			
			//prints results
			if (twentyDollar > 1) {
				System.out.println(twentyDollar + " Twenty Dollar Bills");
			} else if (twentyDollar > 0) {
				System.out.println(twentyDollar + " Twenty Dollar Bill");
			}
			if (tenDollar > 1) {
				System.out.println(tenDollar + " Ten Dollar Bills");
			} else if (tenDollar > 0) {
				System.out.println(tenDollar + " Ten Dollar Bill");
			}
			if (fiveDollar > 1) {
				System.out.println(fiveDollar + " Five Dollar Bills");
			} else if (fiveDollar > 0) {
				System.out.println(fiveDollar + " Five Dollar Bill");
			}
			if (oneDollar > 1) {
				System.out.println(oneDollar + " One Dollar Bills");
			} else if (oneDollar > 0) {
				System.out.println(oneDollar + " One Dollar Bill");
			}
			if (quarter > 1) {
				System.out.println(quarter + " Quarters");
			} else if (quarter > 0) {
				System.out.println(quarter + " Quarter");
			}
			if (dime > 1) {
				System.out.println(dime + " Dimes");
			} else if (dime > 0) {
				System.out.println(dime + " Dime");
			}
			if (nickel > 1) {
				System.out.println(nickel + " Nickels");
			} else if (nickel > 0) {
				System.out.println(nickel + " Nickel");
			}
			if (penny > 1) {
				System.out.println(penny + " Pennies");
			} else if (penny > 0) {
				System.out.println(penny + " Penny");
			}
			System.out.println("Thank you come again!");
		}

	}

}
