package lesson6;

public class AnimalsFactory {
    private int catsCount = 0;
    private int dogsCount = 0;

    public int getCatsCount() {
        return catsCount;
    }

    public int getDogsCount() {
        return dogsCount;
    }

    public int getAnimalsCount() {
        return catsCount + dogsCount;
    }

    public Cat createCat(String name) {
        catsCount++;
        return new Cat(name);
    }

    public Dog createDog(String name) {
        dogsCount++;
        return new Dog(name);
    }
}
