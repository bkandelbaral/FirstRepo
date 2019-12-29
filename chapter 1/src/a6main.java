import java.util.Scanner;

public class a6main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int userMeters;
		int sentinel = 4;
		int userOption = 0;

		do {
			System.out.println("Please, enter a distance in meters greater than 0");
			userMeters = keyboard.nextInt();
		}while(userMeters < 0);
		
		while (userOption != sentinel) {
			menu();
			System.out.println("Enter your choice: ");
			userOption = keyboard.nextInt();
			if (userOption == 1) {
				showKilometers(userMeters);
			} else if (userOption == 2) {
				showInches(userMeters);
			} else if (userOption == 3) {
				showFeet(userMeters);
			} else if (userOption == 4) {
				System.out.println("Bye!");
				sentinel = 4;
				return;
			}else {
				System.out.println("Please select one of the options");
			}
		}

	}

	public static void menu() {
		System.out
				.println("1. Convert to kilometers\n2. Convert to Inches\n3. Convert to feet\n4. Quit the program \n");

	}

	public static void showKilometers(int userMeters) {
		double kiloMeters = userMeters * 0.001;

		System.out.println(userMeters + " meters is " + kiloMeters + " kilometers");
	}

	public static void showInches(int userMeters) {
		double inches = userMeters * 39.37;
		System.out.println(userMeters + " meters is " + inches + " inches");
	}

	public static void showFeet(int userMeters) {
		double feet = userMeters * 3.281;
		System.out.println(userMeters + " meters is " + feet + " feet");

	}

}
