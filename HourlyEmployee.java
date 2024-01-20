public class HourlyEmployee extends Employee{

    private int hoursWorked;
    private int hourlyPayment;

    public HourlyEmployee() {
        super();
        hoursWorked = 0;
        hourlyPayment = 0;
    }

    public HourlyEmployee(String n, String a, int hw, int hp) {
        super(n, a);
        setHoursWorked(hw);
        setHourlyPayment(hp);
    }

    public void setHoursWorked(int hw) {
        if (hw > 9) {
            hoursWorked = hw;
        }
        else
        {
            hoursWorked = 0;
        }
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyPayment(int hp) {
        if (hp > 0) {
            hourlyPayment = hp;
        }
        else
        {
            hourlyPayment = 0;
        }
    }

    public int getHourlyPayment() {
        return hourlyPayment;
    }

    public int payment() {
        return hoursWorked * hourlyPayment;
    }
}