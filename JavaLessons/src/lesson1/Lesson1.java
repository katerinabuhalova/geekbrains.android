package lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        int a = 6;
        double b = 9.4;
        char c = 'r';
        boolean d = true;
        String f = "Helloy!";
    }

    public static double expression(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 || sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkNumberSign(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное!");
        }
    }

    public static boolean returnNumbers(int a) {
        if (a < 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void displayName(String name){
        System.out.println("Привет " + name + "!");
    }

    public static void displayLeapYear(int year) {
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println("Високосный");
        }
        else
        {
            System.out.println("Не високосный");
        }
    }
}