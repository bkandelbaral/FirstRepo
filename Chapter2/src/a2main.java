import java.util.Scanner;

public class a2main {

	public static void main(String[] args) {

		Scanner Grade = new Scanner(System.in);
		System.out.println("Enter the grade");
		int Percentage = Grade.nextInt();

		if (Percentage > 90) {
			System.out.println(" you got a A");
		} else if (Percentage > 80) {
			System.out.println("you got B");
		} else if (Percentage > 70) {
			System.out.println("you got c");
		} else if (Percentage > 60) {
			System.out.println("you got c");
		} else {
			System.out.println("you got F");
			
		}
	}
}