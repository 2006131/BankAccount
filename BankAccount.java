
/**
 * Abstract class BankAccount - write a description of the class here
 *
 * @author Zach and Cooper
 * @version (version number or date here)
 */
public abstract class BankAccount
{
    private double balance;
    private int numDeposits;
    private int numWithdrawals;
    private double interestRate;
    private double monthlyCharge;
    
    public BankAccount(double balance, double interestRate)
    {
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public void deposit(double deposit)
    {
        
    }
}
