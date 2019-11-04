public class Employee {
    private int ID_Employee;
    private String firstName;
    private String lastName;
    private int Salary;


    //Construtor
    public Employee(int ID_Employee,String firstName,String lastName,int Salary) {

        this.ID_Employee = ID_Employee;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Salary = Salary;
    }


    //Métodos
    public String toString(){
        return "Employee[ id="+ID_Employee+" name="+firstName+" apelido="+lastName+" salario="+Salary+" Salario Anual="+GetAnnualSalary()+" Aumento de Salário="+raiseSalary(10)+"]";
    }

    public int getID_Employee() {
        return ID_Employee;
    }

    public void setID_Employee(int ID_Employee) {
        this.ID_Employee = ID_Employee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int GetAnnualSalary(){
        int SalarioAnual;

        SalarioAnual = Salary * 12;
        return SalarioAnual;
    }

    public int raiseSalary(int percent){

        int Perttotal,Total;
        Perttotal = Salary * percent/100;
        Total = Salary + Perttotal;
        return Total;
    }
}
