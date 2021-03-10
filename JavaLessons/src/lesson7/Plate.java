package lesson7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
        if (food < 0) {
            food = 0;
        }
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добавьте еду в тарелку в целом числовом значении: ");
        int add = sc.nextInt();
        System.out.println("Вы добавили " + add + " едениц eды");
        sc.close();
    }
}