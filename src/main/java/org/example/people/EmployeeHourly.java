package org.example.people;


import org.example.firm.Firm;

public class EmployeeHourly extends Employee{

    public EmployeeHourly() {
    }

    public EmployeeHourly(String name, String surname, double oplata) {
        super(name, surname, oplata);
        this.tax = 0.20;
    }


    @Override
    public String toString() {
        return super.toString() + "\t\tпочасовая\t\t" + this.salary;
    }

    public String myToStringSalary(){
        return super.toString() + "\t\tпочасовая\t\t" + this.salary;
    }

    public String myToStringTax(){
        return String.format("%s\t|\t%.2f\t|\t%.2f\t|\t%.2f / %.2f",
                super.toString(), this.tax, this.salary, (this.salary - this.salary * this.tax) / 2,
                (this.salary - this.salary * tax) / (2 * Firm.courseTugr));

    }
}
