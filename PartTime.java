public class PartTime extends EmployeeAbst{
    private double hoursWorked;
    private double rate;

    public PartTime() {
        super();
        hoursWorked = 0.0;
        rate = 0.0;
    }

    public PartTime(String f, String s, int age, int id, double hours, double money) {
        super (f, s, age, id);
        setHoursWorked(hours);
        setRate(money);
    }

    public void setHoursWorked(double hours) {
        if(hours > 0) {
            hoursWorked = hours;
        }
        else {
            hoursWorked = 0;
        }
    }
    
    public void setRate(double hourlyRate) {
        if (hourlyRate > 0) {
            rate = hourlyRate;
        }
         else {
            rate = 0;
         }
    }
    
    public double getRate() {
        return rate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double calculateSalary() {
        return hoursWorked * rate;
    }
}
