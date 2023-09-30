package org.example.people;

public class EmployeeRate extends Employee{
//    private double rate;

    public EmployeeRate() {
        super();
    }

    public EmployeeRate(String name, String surname, double oplata) {
        super(name, surname, oplata);
        this.tax = 0.20;
        this.workTime *= 8;
    }

//    public double getRate() {
//        return rate;
//    }
//
//    public void setRate(double rate) {
//        this.rate = rate;
//    }

//    @Override
//    public double takeSalary() {
//        return this.rate;
//    }

//    @Override
//    public double takeSalaryTax() {
//        if (!super.getOfshor()) {
//            if (super.getChild() > 0) {
//                this.salaryTax = this.salary - (this.salary * this.tax);
//            } else {
//                this.tax += 0.05;
//                this.salaryTax = this.salary - (this.salary * this.tax);
//            }
//            getBonus();
//        } else {
//            this.tax = 0;
//            this.salaryTax = this.salary;
//        }
//        return this.salaryTax;
//    }

    @Override
    public String toString() {
        return super.toString() + "\t\t\tставка\t\t\t" + this.salary;
    }

    @Override
    public String myToStringSalary(){
        return super.toString() + "\t\t\tставка\t\t\t" + this.salary;
    }

    @Override
    public String myToStringTax(){
        return super.toString() + "\t\t\t" + this.tax + "\t\t\t" + this.salary + "\t\t\t" + (this.salary -
                this.salary * this.tax);
    }
}
