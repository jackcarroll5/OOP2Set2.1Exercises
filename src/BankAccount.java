import javax.swing.*;

/*This program will write a class definition for  a bank account that will feature
 a person, a name and an account number
 */
public class BankAccount implements transActable {
    private int accNum;
    private double balance;

    public BankAccount()
    {
      setAccNum(0);
      setBalance(0);
    }


    public BankAccount(int accNum,double balance)
    {
      setAccNum(accNum);
      setBalance(balance);
    }

    public void setAccNum(int accNum)
    {
        this.accNum = accNum;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }


    public int getAccNum()
    {
        return accNum;
    }

    public double getBalance()
    {
        return balance;
    }

    @Override
    public void lodge(double amount)
    {
      setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw()
    {
       double amount;

      amount = Integer.parseInt(JOptionPane.showInputDialog("How much money do you want to withdraw?:"));
      setBalance(balance - amount);
    }

    public String toString()
    {
       return "Account Number: " + getAccNum() + "\nBalance: € " + getBalance();
    }

}