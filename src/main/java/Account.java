public class Account {
    private int ID_Account;
    private Customer customer;
    private double Balance = 0.0;


    //Construtor
    public Account(int ID_Account, Customer customer, double balance) {
        this.ID_Account = ID_Account;
        this.customer = customer;
        this.Balance = balance;
    }

    public Account(int ID_Account, Customer customer) {
        this.ID_Account = ID_Account;
        this.customer = customer;
    }

    //Metodo

    public int getID_Account() {
        return ID_Account;
    }

    public void setID_Account(int ID_Account) {
        this.ID_Account = ID_Account;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account deposit(double ammount)
    {

        this.Balance = Balance + ammount;
        return this;

    }
}
