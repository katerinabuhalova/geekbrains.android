package lesson5;

public class Lesson5 {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Петров  Василий Иванович", "Стажор", "not@mauil.ru", "76 - 65 - 87", 23000, 56),
                new Employee("Пупкин Александр Иванович", "Фрезеровщик", "Нет", "56 - 87 - 54", 54000, 34),
                new Employee("Скалолаз  Сургей Николаевич", "Стажор", "Нету", "76 - 65 - 87", 23000, 45),
                new Employee("Овощ Лиза Михайловна", "Стажор", "Ftrev@mail.ru", "76 - 65 - 87", 23000, 23),
                new Employee("Майданов Сергей Викторович", "Фрезеровщик", "gop@mail.ru", "56 - 87 - 54", 54000, 29),
        };

        informationPrint(employees);

    }

    public static void informationPrint(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].info();
            }
        }
    }
}


