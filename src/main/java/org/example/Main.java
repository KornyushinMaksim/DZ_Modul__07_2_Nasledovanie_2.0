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
import org.example.people.EmployeeHourly;
import org.example.people.EmployeePieceWork;
import org.example.people.EmployeeRate;

public class Main {
    public static int courseTugr = 6;

    public static void main(String[] args) {
        Firm firm = new Firm();

        EmployeeRate employeeRate = new EmployeeRate("Иван", "Фурман", 1, 32000);
        EmployeeHourly employeeHourly = new EmployeeHourly(
                "Прохор", "Авдотин", 0, 312, 218
        );
        EmployeePieceWork employeePieceWork = new EmployeePieceWork(
                "Дмитрий", "Осипов", 0, 12876
        );

        firm.addEmployee(employeeRate);
        firm.addEmployee(employeeHourly);
        firm.addEmployee(employeePieceWork);

        employeePieceWork.setOfshor(true);
        employeePieceWork.quantityAndHours(6, 189);

        employeeRate.takeSalary();
        employeeHourly.takeSalary();
        employeePieceWork.takeSalary();

        employeeRate.takeSalaryTax();
        employeeHourly.takeSalaryTax();
        employeePieceWork.takeSalaryTax();

        System.out.println();
        System.out.println(firm.myToStringSalary());
        System.out.println();
        System.out.println(firm.myToStringTax());
    }

}
