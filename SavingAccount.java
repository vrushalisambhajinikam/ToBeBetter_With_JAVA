public class SavingAccount 
{    
    private static double annualInterrestRate;
    private double savingsBalance;

    public SavingAccount(double savingsBalance)
    {
        this.savingsBalance=savingsBalance;
    }

    public void calculateMonthlyInterest()
    {
        double montlyInterest=(savingsBalance*annualInterrestRate/12);
        savingsBalance+=montlyInterest;
       // System.out.println(savingsBalance);
    }

    public static void modifyInterestRate(double newRate)
    {
        annualInterrestRate=newRate;
    }

    public double getSavingBalance()
    {
        return savingsBalance;
    }

    public static void main(String[] args) 
    {
        SavingAccount saver1=new SavingAccount(2000);
        SavingAccount saver2=new SavingAccount(3000);

        SavingAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("saver 1 bal:"+saver1.getSavingBalance());
        System.out.println("saver 2 bal:"+saver2.getSavingBalance());

         
        SavingAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("saver 1 bal:"+saver1.getSavingBalance());
        System.out.println("saver 2 bal:"+saver2.getSavingBalance());

        
    }
} 
