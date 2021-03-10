package lesson7;

import java.util.Scanner;

public class Cat {
    private String name;
    private int appetite;
    protected boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        satiety = appetite <= p.getFood();
        if (satiety) {
            p.decreaseFood(appetite);
        }
    }

    public void satietyInfo() {
        System.out.println("Сытость = " + satiety);
    }

    public void nameInfo() {
        System.out.println(name);
    }
}