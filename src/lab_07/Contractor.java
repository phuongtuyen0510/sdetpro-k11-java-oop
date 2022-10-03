package lab_07;

public class Contractor extends Employee {
    private int contractSalary = 40000;

    @Override
    public int getSalary() {
        return contractSalary;
    }
}
