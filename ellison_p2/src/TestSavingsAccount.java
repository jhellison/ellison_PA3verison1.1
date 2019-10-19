public class TestSavingsAccount {
    public static void main(String[] args)
    {
        //create objects first and allocate space for them
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        System.out.println("Setting the Interest Rate to 4.0%");
        SavingsAccount.modifyInterestRate(4.0);
        System.out.println(" Month\t\t Saver1\t\t Saver2");
        for(int i=1; i<=13; i++)
        {
            if(i<13)
            {
                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();
                System.out.print("Month " + i + ":\t");
                saver1.printSavingsAccountBalance();
                System.out.print("\t");
                saver2.printSavingsAccountBalance();
                System.out.println();
            }

            else
            {
                System.out.println();
                System.out.println("Now setting the Interest Rate to 5.0%\n");

                SavingsAccount.modifyInterestRate(5.0);

                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();

                System.out.print("Month 13: \t");
                saver1.printSavingsAccountBalance();
                System.out.print("\t");
                saver2.printSavingsAccountBalance();
                System.out.println();
            }
        }

    }
}
