


public class Customer extends Person
{
   private int customerNo;
   private BankAccount account;


    public Customer()
    {
        super("No Name");
       setCustomerNo(0);
       setAccount(new BankAccount());
    }

    public Customer(String name,int accNum,double balance)
    {
        super(name);
        setCustomerNo(accNum);
        setAccount(new BankAccount(accNum,balance));
    }

    public void setCustomerNo(int accNum)
    {
      this.customerNo = accNum;
    }

    public int getCustomerNo()
    {
        return customerNo;
    }

    public void setAccount(BankAccount account)
    {
        this.account = account;
    }

    public BankAccount getAccount()
    {
        return account;
    }

    public String toString()
    {
        return (getAccount()).toString() + super.toString();
    }

}