package lesson6;

public class  Cat extends Animal {
    private final int MAX_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
    }

    void run(int distanceRun) {
        if (distanceRun > MAX_RUN_DISTANCE) {
            System.out.println("Кот не может столько пробежать. ");
        } else {
            System.out.println("Кот " + name + " пробежал " + distanceRun + " м.");
        }
    }

    void swim(int distanceSwim) {
        System.out.println("Кот не умеет плавать.");
    }
}
