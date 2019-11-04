public class Main {

    public static void main(String args[]) {
        Account ac1 = new Account("1","Pedro",1500);
        System.out.println(ac1.toString());


        Account ac2 = new Account("2","Viana",500);
        ac1.transferTo(ac2, 5);
        System.out.println(ac2.toString());
    }
}
