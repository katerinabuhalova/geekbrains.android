package lesson5;

public class Employee {

    protected String fullName;
    protected String position;
    protected String phone;
    protected String email;
    protected int salary;
    protected int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя сотрудника: " + fullName + ","
                + " Занимаемая должность : " + position + ","
                + " Email : " + email + ","
                + " Номер телефона: " + phone + ","
                + " Зарплата : " + salary + ","
                + " Возраст : " + age + ".");
    }
}
