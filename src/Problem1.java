import javax.swing.JOptionPane;

public class Problem1 {
    public static void main(String[] args) {

        String[] accounts = new String[2];
        int accountNum = 0,i;
        double balance = 0;
        String name,accountNumString,bal;


        Customer account = new Customer();

        JOptionPane.showMessageDialog(null,account.toString() ,"Account 1",
                JOptionPane.INFORMATION_MESSAGE);

        Customer account2 = new Customer("Geraldine Corker",3245,300.00);
        BankAccount acc2 = new BankAccount(3245,300.00);

           JOptionPane.showMessageDialog(null,account2.toString(),"Account 2",
                   JOptionPane.INFORMATION_MESSAGE);


               acc2.lodge(100);
        JOptionPane.showMessageDialog(null,"\nAccount 2 after lodging is:\n" + acc2.toString(),"Lodging of Money",
                JOptionPane.INFORMATION_MESSAGE);

        for (i = 0; i < accounts.length; i++)
        {



            //accounts[i]
        }

            name = JOptionPane.showInputDialog("Please enter the holder's name: ");

          accountNumString = JOptionPane.showInputDialog("Please enter the amount number:");
            accountNum = Integer.parseInt(accountNumString);

            bal = JOptionPane.showInputDialog("Please enter your balance: ");
            //balance = Double.parseDouble(String.valueOf(balance));
           balance = Double.parseDouble(bal);

        Customer account3 = new Customer(name,accountNum,balance);
        BankAccount acc3 = new BankAccount(accountNum,balance);

        JOptionPane.showMessageDialog(null,account3,"Account 3 Message",
                JOptionPane.INFORMATION_MESSAGE);

         acc3.withdraw();
        JOptionPane.showMessageDialog(null,"\nAccount 3 after withdrawal is: \n" + acc3.toString(),"Withdrawal of Money",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
