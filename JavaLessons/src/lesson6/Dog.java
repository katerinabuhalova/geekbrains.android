package lesson6;

public class Dog extends Animal {
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    void run(int distanceRun) {
        if (distanceRun > MAX_RUN_DISTANCE) {
            System.out.println("Собака не может столько много пробежать.");
        } else {
            System.out.println("Собака " + name + " пробежала " + distanceRun + " м.");
        }
    }

    void swim(int distanceSwim) {
        if (distanceSwim > MAX_SWIM_DISTANCE) {
            System.out.println("Собака не может столько много проплыть.");
        } else {
            System.out.println("Собака " + name + " проплыла " + distanceSwim + " м.");
        }
    }
}
