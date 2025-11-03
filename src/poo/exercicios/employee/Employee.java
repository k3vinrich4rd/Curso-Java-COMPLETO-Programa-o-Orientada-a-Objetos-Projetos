package poo.exercicios.employee;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary += grossSalary * percentage / 100;
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", $ " + String.format("%.2f", netSalary());
    }
}
