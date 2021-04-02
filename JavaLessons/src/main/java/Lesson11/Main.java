package Lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.add(new Apple(10));
        appleBox.add(new Apple(11));
        appleBox.add(new Apple(12));

        orangeBox.add(new Orange(10));
        orangeBox.add(new Orange(11));
        orangeBox.add(new Orange(12));

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));

        while (appleBox.getWeight() > 0) {
            appleBox1.add(appleBox.getFruit());
        }
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }

    public static <T> void arrayToArrayList(T[] arr) {
        ArrayList<T> list = new ArrayList<>();
        Collections.addAll(list);
    }
}
