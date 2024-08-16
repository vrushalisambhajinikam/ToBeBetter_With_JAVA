package Basics;

class SavingsAccount {
    // Static variable to hold the annual interest rate
    private static double annualInterestRate;

    // Instance variable to hold the savings balance
    private double savingsBalance;

    // Constructor to initialize savings balance
    public SavingsAccount(double initialBalance) {
        this.savingsBalance = initialBalance;
    }

    // Method to calculate monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.printf("Current Balance: Rs %.2f%n", savingsBalance);
    }
}
public class exp4_Employee {


    public static void main(String[] args) {
        // Create two SavingsAccount objects with initial balances of Rs 2000.00 and Rs 3000.00
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set the annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculate the monthly interest and print the new balances for both savers
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Balances after applying 4% interest:");
        saver1.displayBalance();
        saver2.displayBalance();

        // Set the annual interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculate the monthly interest and print the new balances for both savers
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("\nBalances after applying 5% interest:");
        saver1.displayBalance();
        saver2.displayBalance();
    }

}
