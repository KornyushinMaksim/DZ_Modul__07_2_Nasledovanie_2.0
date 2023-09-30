package org.example.firm;

import org.example.people.Employee;
import java.util.ArrayList;

public class Firm {
    public static int courseTugr = 6;
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

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        String str = "ФИО\t\t\t\t\tВид оплаты\t\tСумма\n";
        str += "--------------------------------------------------------------";
        for (int i = 0; i < employees.size(); i++){
            str += employees.get(i).toString() + "\n";
        }
        str += "--------------------------------------------------------------";
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
        String str = "";
        str += "--------------------------------------------------------------------\n";
        str += "ФИО\t\t\t\t|\tНДС%\t|\tСумма\t\t|\t" + str();
        str += "--------------------------------------------------------------------\n";
        for (int i = 0; i < employees.size(); i++){
            str += employees.get(i).myToStringTax() + "\n";
        }
        str += "--------------------------------------------------------------------\n";
        return str;
    }

    private String str (){
        return "Сумма с НДС\n\t\t\t\t|\t\t\t|\t\t\t\t|\t(руб/тугрики)\n" +
                "\t\t\t\t|\t\t\t|\t\t\t\t|\tКурс 1/" + Firm.courseTugr + "\n";
    }

}

