public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;


    //constructor method
    public SavingsAccount(double SavingBalanceValue)
    {
        annualInterestRate = 0.0;
        savingsBalance =  SavingBalanceValue;

    }

    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }

    public void calculateMonthlyInterest()
    {
        double interest;
        interest = ((savingsBalance * (annualInterestRate/100))/12);
        savingsBalance += interest;
    }

    public void printSavingsAccountBalance()
    {
        System.out.printf("$%.2f", savingsBalance);
    }
}
