package lab_07;

import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {
    public static void main(String[] args) {
        Employee FTE1 = new FTE();
        Employee FTE2 = new FTE();
        Employee FTE3 = new FTE();
        Employee contractor1 = new Contractor();
        Employee contractor2 = new Contractor();

        SalaryCalculator employeeController = new SalaryCalculator();
        int salary = employeeController.caculateSalary(Arrays.asList(FTE1, FTE2, FTE3, contractor1, contractor2));
        System.out.println("Total salary: " + salary);
    }

    public int caculateSalary(List<Employee> employees) {
        int total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }
}
