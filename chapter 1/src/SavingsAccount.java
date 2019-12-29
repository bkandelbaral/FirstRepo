import java.util.Scanner;

public class SavingsAccount {

	//Instance variable
	public double annualInterestRate;
	public double balance;

	//Constructor
	public SavingsAccount(double startingBalance) {
		balance = startingBalance;
	}

	//Deposit method. Takes in amount
	public void deposit(double userAmount, SavingsAccount account) {
		account.balance = account.balance + userAmount;
	}

	//Withdrawal method. Takes in amount
	public void withdraw(double userAmount, SavingsAccount account) {
		account.balance = account.balance - userAmount;
	}

	//Adding monthly interest rate method
	public double monthlyInterest(double balance, double rate) {
		
		System.out.println("Balance sent:" + balance);
		double interestAmount = ((balance * (rate * 0.01))/12);
		return interestAmount;
	}


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Account Balance");
		double balance = scanner.nextDouble();
		
		System.out.println("Enter the Interest Rate");
		double rate = scanner.nextDouble();
		
		System.out.println("Enter the number of Months");
		int months = scanner.nextInt();
		
		SavingsAccount meroSavingAccount = new SavingsAccount(balance);
		
		double totalDepositAmount = 0;
		double totalWithdrawalAmount = 0;
		double totalInterestAmount = 0;
		
		for(int x = 0; x < months; x++) {
			System.out.println("Enter the amount you deposited in this month");
			double depositAmount = scanner.nextDouble();
			totalDepositAmount = totalDepositAmount + depositAmount;
			meroSavingAccount.deposit(depositAmount, meroSavingAccount);
			
			System.out.println("Enter the amount you withdrawal in this month");
			double withdrawalAmount = scanner.nextDouble();
			totalWithdrawalAmount = totalWithdrawalAmount + withdrawalAmount;
			meroSavingAccount.withdraw(withdrawalAmount, meroSavingAccount);
			
			double interestAmount = meroSavingAccount.monthlyInterest(meroSavingAccount.balance, rate);
			totalInterestAmount = totalInterestAmount + interestAmount;
			System.out.println("Interest Amount for this month " + interestAmount);
			
			meroSavingAccount.deposit(interestAmount, meroSavingAccount);
		}
		
		System.out.println("Account balance :" + meroSavingAccount.balance);
		System.out.println("Total deposit :" + totalDepositAmount);
		System.out.println("Total withdrawal :" + totalWithdrawalAmount);
		System.out.println("Total interest amount earned :" + totalInterestAmount);

	}
}
