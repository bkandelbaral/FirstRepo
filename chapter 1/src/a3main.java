import java.util.Scanner;

public class a3main {

	public static void main(String[] args) {

		Scanner quadractic = new Scanner(System.in);
		System.out.println("Enter the value of A");
		double A = quadractic.nextDouble();

		System.out.println("Enter the value of B");
		double B = quadractic.nextDouble();

		System.out.println("Enter the value of C");
		double C = quadractic.nextDouble();

		double discriminant = B * B - (4 * A * C);

		
		if (A == 0) {
			double value = (-C / B);
			System.out.println("Since, the value of A is 0, the value of X is " + value);
		} else if (discriminant == 0) {
			double value = -B / (2 * A);
			System.out.println("Since the discriminant is 0, value of X is " + value);
		} else {

			double quadracticNumerator1 = (-B + Math.sqrt(B * B - (4 * A * C)));
			double quadracticNumerator2 = (-B - Math.sqrt(B * B - (4 * A * C)));
			double quadracticDenominator = (2 * A);

			double value1 = quadracticNumerator1 / quadracticDenominator;
			double value2 = quadracticNumerator2 / quadracticDenominator;

			System.out.println("The values of X are " + value1 + " and " + value2);

		}

	}

}
