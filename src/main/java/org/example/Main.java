package org.example;//      Разработать и протестировать набор классов для решения задачи
//        подсчета зароботной платы сотрудников некоторой фирмы.
//        На фирме есть несколько способов оплаты труда:
//        ■ ставка – указывается, сколько сотрудник получает за рабочий день;
//        для каждого сотрудника записывается, сколько дней он отработал в месяце;
//        ■ почасовая – указывается, сколько сотрудник получает в час, для каждого сотрудника;
//        записывается, сколько часов он отработал в месяце
//        ■ сдельная – указывается, сколько сотрудник получит за выполненную работу;
//        для каждого сотрудника записываются суммы для каждой работы, что он успел сделать за месяц.

import org.example.firm.Firm;
import org.example.people.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Firm firm = new Firm();

        ArrayList<Employee> workers = new ArrayList<>();
        EmployeeRate ivan = new EmployeeRate("Иван", "Фурман", 32000);
        EmployeeHourly prohor = new EmployeeHourly("Прохор", "Авдотин", 312);
        EmployeePieceWork dima = new EmployeePieceWork("Дмитрий", "Осипов", 12876);
        EmployeeRate petr = new EmployeeRate("Пётр", "Петров", 28000);
        EmployeeHourly andre = new EmployeeHourly("Андрей", "Шатилов", 292);
        EmployeePieceWork vasya = new EmployeePieceWork("Василий", "Стрипо", 14540);

        firm.addEmployee(ivan);
        firm.addEmployee(prohor);
        firm.addEmployee(dima);
        firm.addEmployee(petr);
        firm.addEmployee(andre);
        firm.addEmployee(vasya);

        dima.setOfshor(true);
        vasya.setOfshor(true);
        ivan.setChild(2);
        andre.setChild(1);

        ivan.setWorkTime(1);
        prohor.setWorkTime(210);
        dima.setWorkTime(4);
        petr.setWorkTime(1);
        andre.setWorkTime(234);
        vasya.setWorkTime(5);

        for (int i = 0; i < firm.getEmployees().size(); i++){
            firm.getEmployees().get(i).takeSalary();
            firm.getEmployees().get(i).takeTax();
        }

        System.out.println();
        System.out.println(firm.myToStringSalary());
        System.out.println();
        System.out.println(firm.myToStringTax());
    }

}
