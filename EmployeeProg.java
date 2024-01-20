public class EmployeeProg {

    public static void main(String[] args) {
        
        SalariedEmployee ob1 = new SalariedEmployee();
        HourlyEmployee ob2 = new HourlyEmployee();

        ob1.setName("John");
        ob1.setAfm("123456789");
        ob1.setSalary(1000);

        ob2.setName("Maria");
        ob2.setAfm("987654321");
        ob2.setHoursWorked(200);
        ob2.setHourlyPayment(5);
        
        Employee[] employees = new Employee[2];
        employees[0] = ob1;
        employees[1] = ob2;

        System.out.println("================================");

        for (Employee currentEmployee : employees) 
        {
            System.out.println("Name: " + currentEmployee.getName());
            System.out.println("Afm: " + currentEmployee.getAfm());

            if (currentEmployee instanceof SalariedEmployee) {
                SalariedEmployee employee = (SalariedEmployee)currentEmployee;
                System.out.println("Salary: " + employee.payment());              
            }
            
            if (currentEmployee instanceof HourlyEmployee) {
                HourlyEmployee employee = (HourlyEmployee)currentEmployee;
                System.out.println("Salary: " + employee.payment());
            }
            System.out.println("================================");
        }

        for (int i = 0; i <employees.length; i++) {
            System.out.printf("Employee[%d] is a %s\n", i, employees[i].getClass().getName());
        }
    }
}
