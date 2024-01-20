public class Employee2 {

    private String firstName;
    private String lastName;
    private String address;
    private String telephoneNumber;
    private String department;
    private double monthlySalary;

    public Employee2 () {
        firstName = null;
        lastName = null;
        address = null;
        telephoneNumber = null;
        department = null;
        setMonthlySalary(0.0);
    }

    public Employee2 (String name, String surname, String homeAddress, String tel, String dep, double salary) {
        firstName = name;
        lastName = surname;
        address = homeAddress;
        telephoneNumber = tel;
        department = dep;
        setMonthlySalary(salary);
    }

    public void setFirstname(String name) {
        firstName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String surname) {
        lastName = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(String homeAddress) {
        address = homeAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setTelephoneNumber(String tel) {
        telephoneNumber = tel;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setDepartment(String dep) {
        department = dep;
    }

    public String getDepartment() {
        return department;
    }

    public void setMonthlySalary(double salary) {
        if(salary > 0) {
            monthlySalary = salary;
        } else {
            monthlySalary = 0;
        }
    }

    public double getMontlySalary() {
        return monthlySalary;
    } 
    
}