package org.example.people;

public class EmployeeRate extends Employee{

    public EmployeeRate() {
        super();
    }

    public EmployeeRate(String name, String surname, double oplata) {
        super(name, surname, oplata);
        this.tax = 0.20;
        this.workTime *= 8;
    }

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
        return String.format("%s\t\t|\t%.2f\t|\t%.2f\t|\t%.2f",
                super.toString(), this.tax, this.salary, this.salary - this.salary * this.tax);
    }
}
