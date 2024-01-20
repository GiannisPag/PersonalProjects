public abstract class Employee {
    
    private String name;
    private String afm;

    public Employee() {
        name = null;
        afm = null;
    }

    public Employee(String n, String a) {
        name = n;
        afm = a;
    }

    public void setName(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }

    public void setAfm(String a) {
        afm = a;
    }

    public String getAfm() {
        return afm;
    }

    public abstract int payment();
}
