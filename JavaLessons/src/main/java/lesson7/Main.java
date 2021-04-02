package lesson7;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(40);

        Cat[] cats = {new Cat("Мурзик", 15, false), new Cat("Бобик", 10, false), new Cat("Лот", 20, false)};

        for (Cat c : cats) {
            c.nameInfo();
            c.eat(plate);
            c.satietyInfo();
            plate.info();
        }

        plate.addFood();
    }
}