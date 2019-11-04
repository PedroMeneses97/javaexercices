public class Main {

    public static void main(String args[]) {

        Customer cust1 = new Customer(1,"Pedro",30);
        System.out.println(cust1.toString());

        Invoice inv1 = new Invoice(1,cust1,1000);
        System.out.println(inv1.toString());
    }
}
