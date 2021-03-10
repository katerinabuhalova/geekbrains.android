package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        userAnswer();
    }

    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10);
    }

    public static boolean checkNumber(int answer, int target) {
        if (answer == target) {
            return true;
        } else if (answer < target) {
            System.out.print("Вы ввели слишком маленькое число.");
        } else if (answer > target) {
            System.out.println("Вы ввели слишком большое число.");
        }

        return false;
    }

    public static void userAnswer() {
        int randomNumber = getRandomNumber();
        int maxTryCount = 3;
        Scanner sc = new Scanner((System.in));
        System.out.println("Начинаем игру Угадайка!\nЧтобы угадать число, у вас есть три попытки.\nВведите число от 0 до 9 : ");

        for (int tryCount = 1; tryCount <= maxTryCount; tryCount++) {
            int userAnswer = sc.nextInt();
            boolean checkResult = checkNumber(userAnswer, randomNumber);
            if (checkResult) {
                System.out.println("Вы угадали!");
            } else {
                if (tryCount < maxTryCount) {
                    System.out.println("Попробуйте еще раз.");
                } else {
                    System.out.println("Вы проиграли!");
                }
            }

            if (checkResult || tryCount == maxTryCount) {
                System.out.println("Хотите продолжить еще игру?\nЕсли да, введите цифру 1,если нет введите 0. ");
                int userAnswer2 = sc.nextInt();
                if (userAnswer2 == 1) {
                    System.out.println("Начинаем игру сначала.\nЧтобы угадать число, у вас есть три попытки.\nВведите число от 0 до 9 : ");
                    tryCount = 0;
                } else {
                    System.out.println("Игра закончена!\nСпасибо, что были с нами!");
                }
            }
        }
        sc.close();
    }
}