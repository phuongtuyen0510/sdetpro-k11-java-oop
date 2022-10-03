package lab_07;

public class FTE extends Employee {
    private int fullTimeSalary = 50000;

    @Override
    public int getSalary() {
        return fullTimeSalary;
    }
}
