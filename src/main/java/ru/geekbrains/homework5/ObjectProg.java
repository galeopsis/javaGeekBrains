package ru.geekbrains.homework5;

public class ObjectProg {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Арнольд Иванович Шварцнеггер", "Киноактёр", "arni2021@gmail.com", "+1-555-822-14-41", 1000000, 70);
        empArray[1] = new Employee("Иоанн Васильевич Грозный", "Царь", "i.grozny@gov.ru", "8-800-000-00-01", 1, 36);
        empArray[2] = new Employee("Владимир Владимирович Путин", "Президент", "vvputin@gov.ru", "8-001", 1, 70);
        empArray[3] = new Employee("Василий Семёнович Пупкин", "зам.директора", "sam_zam@gmail.com", "+7-913-122-10-20", 150000, 39);
        empArray[4] = new Employee("Доктор Аристархович Айболит", "Ветеринар", "animal_911@gmail.com", "+7-965-111-12-13", 120000, 73);

        System.out.println("Список сотрудников старше 40 лет:");
        olderThan40(empArray);
    }


    private static void olderThan40(Employee[] empArray) {
        for (Employee employee : empArray) {
            if (employee.getAge() > 40) {
                employee.empInfo();
            }
        }
    }
}
