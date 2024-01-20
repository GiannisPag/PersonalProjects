public class SalariedEmployee extends Employee{

    private int salary;

    public SalariedEmployee() {
        super();
        salary = 0;
    }

    public SalariedEmployee(String n, String a, int sal) {
        super(n, a);
        setSalary(sal);
    }
    
    public void setSalary(int pay) {
        if (pay > 0) {
            salary = pay; //na to tsekarw
        }
        else
        {
            salary = 0;
        }
    }

    public int payment() {
        return salary;
    }
}