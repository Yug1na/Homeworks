package ru.gb.lesson2;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] persons = new Employee[5];
        persons[0] = new Employee("Иванов И.И.", 35, "менеджер", "men@gmail.com", "89523657412", 52365.45);
        persons[1] = new Employee("Смирнова Е.А.", 49, "бухгалтер", "el@gmail.com", "89259873614", 72458.32);
        persons[2] = new Employee("Петров В.Р.", 37, "водитель", "man@gmail.com", "89142597863", 35478.12);
        persons[3] = new Employee("Ким М.С.", 29, "секретарь", "kim@gmail.com", "89645872316", 34126.58);
        persons[4] = new Employee("Сергеев П.В.", 50, "директор", "dir@gmail.com", "89259634578", 103542.54);
        System.out.println();
        System.out.printf("СОТРУДНИК ВОЗРАСТ ДОЛЖНОСТЬ   EMAIL        ТЕЛЕФОН     ЗАРПЛАТА\n");
        System.out.println();
        persons[0].print();
        persons[1].print();
        persons[2].print();
        persons[3].print();
        persons[4].print();

        System.out.println();
        System.out.println("СОТРУДНИКИ СТАРШЕ 40 лет: ");

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age > 40) {
                persons[i].print();
            }

        }
    }
}
