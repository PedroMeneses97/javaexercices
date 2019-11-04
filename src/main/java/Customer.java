public class Customer {
    private int ID_Customer;
    private String Name;
    private int Discount;



    //Construtor

    public Customer(int ID_Customer, String name, int discount) {
        this.ID_Customer = ID_Customer;
        this.Name = name;
        this.Discount = discount;
    }

    //Metodos

    public int getID_Customer() {
        return ID_Customer;
    }

    public void setID_Customer(int ID_Customer) {
        this.ID_Customer = ID_Customer;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }

    public String toString() {
        return "Customer{" +
                "ID_Customer=" + ID_Customer +
                ", Name='" + Name + '\'' +
                ", Discount=" + Discount +
                '}';
    }
}
