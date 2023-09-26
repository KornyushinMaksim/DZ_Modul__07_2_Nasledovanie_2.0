package org.example.firm;

import org.example.people.Employee;
import java.util.ArrayList;
import static org.example.Main.courseTugr;

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
        String str = "ФИО\t\t\t\t\tНДС%\t\t\tСумма\t\t\t" + str();
        for (int i = 0; i < employees.size(); i++){
            str += employees.get(i).myToStringTax() + "\n";
        }
        return str;
    }

    private String str (){
        return "Сумма с НДС\n\t\t\t\t\t\t\t\t\t\t\t\t\t(руб/тугрики)\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tКурс 1/" + courseTugr + "\n";
    }

}

