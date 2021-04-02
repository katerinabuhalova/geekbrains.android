package lesson6;

public class Main {
    public static void main(String[] args) {

        AnimalsFactory factory = new AnimalsFactory();

        Cat cat = factory.createCat("Мурзик");
        Dog dog = factory.createDog("Барсик");
        Cat cat1 = factory.createCat("Рыжик");
        Cat cat2 = factory.createCat("Васька");
        Dog dog1 = factory.createDog("Мухтар");

        cat.run(600);
        cat.swim(380);
        dog.run(300);
        dog.swim(5);

        System.out.println("Всего котов: " + factory.getCatsCount());
        System.out.println("Всего собак: " + factory.getDogsCount());
        System.out.println("Всего животных: " + factory.getAnimalsCount());
    }
}
