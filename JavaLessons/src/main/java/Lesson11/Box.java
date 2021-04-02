package Lesson11;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> arrayList = new ArrayList<>();

    public void add(T fruit) {
        arrayList.add(fruit);
    }

    public T getFruit() {
        return arrayList.remove(0);
    }

    public int getWeight() {
        int weight = 0;
        for (T f : arrayList) {
            weight += f.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }
}