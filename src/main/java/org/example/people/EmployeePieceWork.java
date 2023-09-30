package org.example.people;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class EmployeePieceWork extends Employee {

    public EmployeePieceWork() {
    }

    public EmployeePieceWork(String name, String surname, double oplata) {
        super(name, surname, oplata);
        this.tax = 0.15;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tсдельная\t\t" + this.salary;
    }

    public String myToStringSalary(){
        return super.toString() + "\t\tсдельная\t\t" + this.salary;
    }

    public String myToStringTax(){
        return String.format("%s\t|\t%.2f\t|\t%.2f\t|\t%.2f",
                super.toString(), this.tax, this.salary, this.salary - this.salary * this.tax);
    }
}
