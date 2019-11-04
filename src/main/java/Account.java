public class Account {
    private String ID_Account;
    private String Name;
    private int Balance;


    //Construtor
    public Account(String ID_Account, String Name, int Balance) {

        this.ID_Account = ID_Account;
        this.Name = Name;
        this.Balance = Balance;
    }

    //Metodos


    public String getID_Account() {
        return ID_Account;
    }

    public String getName() {
        return Name;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public int Credit(int amount) {

        int Total;
        Total = Balance + amount;
        return Total;
    }

    public int Debit(int amount)
    {
        int Total = 0;
        if (amount <= Balance)
        {
            Total = Balance - amount;


        } else {
            System.out.println("Amount exceeded balance");
        }
        return Total;
    }

    public int transferTo(Account conta, int amount)
    {
        int Total = 0;
        if (amount <= conta.getBalance())
        {
            Total = Balance + amount;

            conta.setBalance(conta.getBalance() - amount);

        } else {
            System.out.println("Amount exceeded balance");
        }
        return Total;
    }


    public String toString() {
        return "Account{id="+ID_Account+"name="+Name+"Balance="+Balance+"Credit="+Credit(50)+"Debit="+Debit(1000)+"}";
    }
}
