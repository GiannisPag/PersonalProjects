public abstract class EmployeeAbst {
    private String fisrtName;
    private String secondName;
    private int age;
    private int employeeID;

    public EmployeeAbst () {
        fisrtName = secondName = null;
        age = 0;
        employeeID = 0;
    }

    public EmployeeAbst (String fn, String sn, int ag, int id) {
        fisrtName = fn;
        secondName = sn;
        age = ag;
        employeeID = id;
    }

    public void setName (String fn, String sn) {
        fisrtName = fn;
        secondName = sn;
    }

    public void displayName () {
        System.out.println(fisrtName + " " + secondName);
    }

    public int getAge () {
        return age;
    }

    public int getID () {
        return employeeID;
    }

    public void setAge (int ag) {
        if (ag >  0) {
            age = ag;
        }
        else {
            age = 0;
        }
    }

    public void setID (int id) {
        if((id > 990) && ( id < 1000)) {
            employeeID = id;
        }
        else {
            employeeID = 0;
        }
    }

    public abstract double calculateSalary ();
    
}
