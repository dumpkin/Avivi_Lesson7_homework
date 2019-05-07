//Створити interface Зарплата, в якому передбачити метод зарплата().
//Створити клас Працівник з погодинною зарплатою, та Працівник з фіксованою щомісячною зарплатою .
//Формула розрахунку зарплати працівника є довільною.
//Вивести на екран скільки заробляють перший і другий працівники.


package com.dumpkin.avivi;

public class Main {

    public static void main(String[] args) {
        System.out.println("lesson7");
        System.out.println("________________________________\n");

        // create two employeeobjects

        Employee manager = new Employee();
        Worker worker = new Worker();
int workhour=309;
int workMonth =10;
        //setinngs attributes for manager

        manager.name = "Mykola";

        manager.setForHour(60);
        manager.timeCount(workhour);
        System.out.println("менеджер " + manager.name + " заробив " + manager.salary() + " грн. за "+workhour+
                " відпрацьованих годин");


        System.out.println("________________________________\n");

        //setinngs attributes for worker


        worker.name = "Vasiliy";
        worker.setForMonth(7688);
        worker.setMonthCount(workMonth);
        System.out.println("Робытник " + worker.name + " заробив " + worker.salary() + " грн.за "+workMonth+
                " відпрацьованих місяців");


    }
}
