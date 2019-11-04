public class Invoice {
    private String ID_Invoice;
    private String desc;
    private int Quantity;
    private double unitPrice;

    //Construtor
    public Invoice(String ID_Invoice, String desc, int quantity, double unitPrice)
    {
        this.ID_Invoice = ID_Invoice;
        this.desc = desc;
        this.Quantity = quantity;
        this.unitPrice = unitPrice;
    }

    //Métodos


    public String getID_Invoice() {
        return ID_Invoice;
    }

    public void setID_Invoice(String ID_Invoice) {
        this.ID_Invoice = ID_Invoice;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return unitPrice * Quantity;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "ID_Invoice='" + ID_Invoice + '\'' +
                ", desc='" + desc + '\'' +
                ", Quantity=" + Quantity +
                ", unitPrice=" + unitPrice +
                ", Total=" + getTotal() +
                '}';
    }
}
