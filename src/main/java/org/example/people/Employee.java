package org.example.people;

abstract public class Employee {
    private String name;
    private String surname;
    protected double workTime;
    protected double oplata;
    protected double salary;
    protected double tax;
    private int child;
    private boolean ofshor;

    public Employee() {
    }

    public Employee(String name, String surname, double oplata) {
        this.name = name;
        this.surname = surname;
        this.oplata = oplata;
        this.workTime = 0;
        this.child = 0;
        this.ofshor = false;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    public void setOfshor(boolean ofshor) {
        this.ofshor = ofshor;
    }

    public double takeSalary() {
        this.salary = this.oplata * this.workTime;
        if (!this.ofshor) {
            getBonus();
        }
        return this.salary;
    }

    public double takeTax() {
        if (child < 1){
            this.tax += 0.05;
        }
        if (ofshor){
            this.tax = 0;
        }
        return this.tax;
    }

    public void getBonus() {
        if (this.workTime > 200) {
            this.salary += (this.salary * 0.1);
        }
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public String myToStringSalary() {
        return null;
    }

    public String myToStringTax() {
        return null;
    }
}
