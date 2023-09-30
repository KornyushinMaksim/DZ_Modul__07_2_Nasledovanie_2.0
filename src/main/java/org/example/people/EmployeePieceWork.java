package org.example.people;

public class EmployeePieceWork extends Employee {
//    private double pieceWorkSalary;
//    private int quantityWork;

    public EmployeePieceWork() {
    }

    public EmployeePieceWork(String name, String surname, double oplata) {
        super(name, surname, oplata);
        this.tax = 0.15;
    }

//    public double getPieceWorkSalary() {
//        return pieceWorkSalary;
//    }
//
//    public void setPieceWorkSalary(double pieceWorkSalary) {
//        this.pieceWorkSalary = pieceWorkSalary;
//    }
//
//    public int getQuantityWork() {
//        return quantityWork;
//    }
//
//    public void setQuantityWork(int quantityWork) {
//        this.quantityWork = quantityWork;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public void quantityAndHours(int quantityWork, int hours){
//        this.quantityWork = quantityWork;
//        this.workHours = hours;
//    }

//    @Override
//    public double takeSalary() {
//        this.salary = this.pieceWorkSalary * this.quantityWork;
//        return this.salary;
//    }

//    @Override
//    public double takeSalaryTax() {
//        if(!super.getOfshor()) {
//            if (super.getChild() > 0) {
//                this.salaryTax = this.salary - (this.salary * this.tax);
//            } else {
//                this.tax += 0.05;
//                this.salaryTax = this.salaryChild = this.salary - (this.salary * this.tax);
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
        return super.toString() + "\t\tсдельная\t\t" + this.salary;
    }

    public String myToStringSalary(){
        return super.toString() + "\t\tсдельная\t\t" + this.salary;
    }

    public String myToStringTax(){
        return super.toString() + "\t\t" + this.tax + "\t\t\t\t" + this.salary  + "\t\t\t" + (this.salary -
                this.salary * this.tax);
    }
}
