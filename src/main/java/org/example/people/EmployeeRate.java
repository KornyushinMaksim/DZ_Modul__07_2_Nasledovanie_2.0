package org.example.people;

public class EmployeeRate extends Employee{
    private double rate;

    public EmployeeRate() {
        super();
    }

    public EmployeeRate(String name, String surname, int child, double rate) {
        super(name, surname, child);
        this.rate = rate;
        this.tax = 0.20;
        this.workHours = 26 * 8;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double takeSalary() {
        return this.rate;
    }

    @Override
    public double takeSalaryTax() {
        if (!super.getOfshor()) {
            if (super.getChild() > 0) {
                this.salaryTax = this.rate - (this.rate * this.tax);
            } else {
                this.tax += 0.05;
                this.salaryTax = this.rate - (this.rate * this.tax);
            }
            getBonus();
        } else {
            this.tax = 0;
            this.salaryTax = this.salary;
        }
        return this.salaryTax;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t\tставка\t\t\t" + rate;
    }

    @Override
    public String myToStringSalary(){
        return super.toString() + "\t\t\tставка\t\t\t" + rate;
    }

    @Override
    public String myToStringTax(){
        return super.toString() + "\t\t\t" + this.tax + "\t\t\t\t" + this.rate + "\t\t\t" + this.salaryTax;
    }
}
