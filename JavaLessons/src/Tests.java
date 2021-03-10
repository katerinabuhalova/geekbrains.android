import java.util.Random;

public class Tests {
    public static void main(String[] args) {
        int number1 = randomNumber();
        int number2 = randomNumber();
        int sumNumber = addSumNumbers(number1, number2);
        printSumNumbers(sumNumber);
    }

    public static void printSumNumbers(int sumNumber) {
        System.out.println(sumNumber);
    }

    public static int addSumNumbers(int number1, int number2) {
        int sumNumber = number1 + number2;
        return (sumNumber);
    }

    public static int randomNumber() {
        Random rand = new Random();
        int a = rand.nextInt(100);
        return (a);
    }
}