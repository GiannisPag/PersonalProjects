// Ypalilos.java - the class used for the project

public class Ypalilos {
    
    // declaration of the variables used
    private double salary;
    private double contribution;
    private double finalSalary;

    // main constructor fot the class
    public Ypalilos() {
        salary = 0;
        contribution = 0;
        finalSalary = 0;
    }

    // salary setters and getters

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    // contribution setters and getters

    public void setContribution(double c) {
        contribution = c;
    }

    public double getContribution() {
        return contribution;
    }

    //final salary setters and getters

    public void setFinalSalary(double f) {
        finalSalary = f;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    // declaration of the calculateFinalSalary function
    public void calculateFinalSalary() {
        finalSalary = salary - contribution;   // calculate final salary
    }
}
