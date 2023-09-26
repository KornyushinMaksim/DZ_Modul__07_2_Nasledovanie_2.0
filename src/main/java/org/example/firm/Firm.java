package org.example.firm;

import org.example.people.Employee;

import java.util.ArrayList;

public class Firm {
    private ArrayList<Employee> employees;

    public Firm() {
        this.employees = new ArrayList<>();
    }

    public Firm(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    @Override
    public String toString() {
        String str = "ФИО\t\t\t\t\tВид оплаты\t\tСумма\n";
        for (int i = 0; i < employees.size(); i++){
            str += employees.get(i).toString() + "\n";
        }
        return str;
    }

    public String myToStringSalary(){
        String str = "ФИО\t\t\t\t\tВид оплаты\t\tСумма\n";
        for (int i = 0; i < employees.size(); i++){
            str += employees.get(i).myToStringSalary() + "\n";
        }
        return str;
    }

    public String myToStringTax(){
        String str = "ФИО\t\t\t\t\tНДС%\t\t\tСумма\t\t\tСумма с НДС\n";
        for (int i = 0; i < employees.size(); i++){
            str += employees.get(i).myToStringTax() + "\n";
        }
        return str;

    }
}
