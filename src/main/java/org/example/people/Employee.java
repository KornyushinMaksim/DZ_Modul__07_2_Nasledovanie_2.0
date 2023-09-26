package org.example.people;

abstract public class Employee {
    private String name;
    private String surname;
    protected double salary;
    protected double tax;
    protected double salaryTax;
    private int child;
    protected double salaryChild;
    protected double courseTugr;
    private boolean ofshor;

    public Employee() {
    }

    public Employee(String name, String surname, int child) {
        this.name = name;
        this.surname = surname;
        this.child = child;
        this.courseTugr = 6;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getChild() {
        return child;
    }

    public boolean getOfshor() {
        return ofshor;
    }

    public void setOfshor(boolean ofshor) {
        this.ofshor = ofshor;
    }

    public double takeSalary(){
        return 0;
    }

    public double takeSalaryTax(){
        return 0;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public abstract String myToStringSalary();

    public abstract String myToStringTax();
}
