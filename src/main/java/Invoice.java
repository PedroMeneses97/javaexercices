public class Invoice {
    private int ID_Invoice;
    private Customer cust1;
    private double Amount;

    //Construtor


    public Invoice(int ID_Invoice, Customer cust1, double amount) {
        this.ID_Invoice = ID_Invoice;
        this.cust1 = cust1;
        this.Amount = amount;
    }


    //Metodos

    public int getID_Invoice() {
        return ID_Invoice;
    }

    public void setID_Invoice(int ID_Invoice) {
        this.ID_Invoice = ID_Invoice;
    }

    public Customer getCust1() {
        return cust1;
    }

    public void setCust1(Customer cust1) {
        this.cust1 = cust1;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String CustomerName(){
        return cust1.getName();
    }

    public double getAmountAfterDiscount(){
        double Total;
        Total = Amount - (Amount * this.cust1.getDiscount()) / 100;
        return Total ;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "ID_Invoice=" + ID_Invoice +
                ", cust1=" + cust1 +
                ", Amount=" + Amount +
                ", Customer Name=" + CustomerName() +
                ", Amount after Discount=" + getAmountAfterDiscount() +
                '}';
    }
}
