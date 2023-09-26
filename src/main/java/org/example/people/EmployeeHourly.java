package org.example.people;

public class EmployeeHourly extends Employee{
    private double hourlySalary;
    private double hours;
    private double salaryTugr;

    public EmployeeHourly() {
    }

    public EmployeeHourly(String name, String surname, int child, double hourlySalary, double hours) {
        super(name, surname, child);
        this.hourlySalary = hourlySalary;
        this.hours = hours;
        this.tax = 0.20;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double takeSalary() {
        this.salary = this.hourlySalary * this.hours;
        return this.salary;
    }

    @Override
    public double takeSalaryTax() {
        if (!super.getOfshor()) {
            if (super.getChild() > 0) {
                this.salaryTax = this.salary - (this.salary * this.tax);
            } else {
                this.tax += 0.05;
                this.salaryTax = this.salaryChild = this.salary - (this.salary * this.tax);
            }
        } else {
            this.tax = 0;
            this.salaryTax = this.salary;
        }
        this.salaryTax /= 2;
        this.salaryTugr = this.salaryTax / this.courseTugr;
        return salaryTax;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tпочасовая\t\t" + this.salary;
    }

    public String myToStringSalary(){
        return super.toString() + "\t\tпочасовая\t\t" + this.salary;
    }

    public String myToStringTax(){
        return super.toString() + "\t\t" + this.tax + "\t\t\t" + this.salary  + "\t\t\t" + this.salaryTax +
                " / " + this.salaryTugr;
    }
}
