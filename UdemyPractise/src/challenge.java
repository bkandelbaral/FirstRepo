
public class challenge {
	public static void main(String[] args) {

		double myFirstValue = 20.00;
		double mySecondValue = 81.00;
		double myTotalValue = ((myFirstValue + mySecondValue) * 100);
		System.out.println("Total value = " + myTotalValue);
		double myRemainder = myTotalValue % 40.00;
		System.out.println("My remainder value = " + myRemainder);

		boolean isRemainderZero = false;

		if (myRemainder == 0) {
			isRemainderZero = true;
		}

		if (myRemainder != 0) {
			System.out.println("Got some remainder");
		}
	}
}