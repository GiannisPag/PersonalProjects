public class FullTime extends EmployeeAbst{
    private double pay;

    public FullTime () {
        super();
        pay = 0.0;
    }

    public FullTime(String fn, String sn, int ag, int id, double money) {
        super(fn, sn, ag, id);
        setPay(money);
    }

    public void setPay(double salary) {
        if(salary > 0) {
            pay = salary;
        }
        else {
            pay = 0;
        }
    }

    public double calculateSalary() {
        return pay;
    }
}
