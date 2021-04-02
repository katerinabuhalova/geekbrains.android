package lesson14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 9, 6, 8};
        int[] arr2 = {1, 1, 4, 3, 6};
        int[] arr3 = {1, 1, 4, 4 };
        try {
            System.out.println(Arrays.toString(returnNewArray(arr)));
        } catch (RuntimeException e){
            e.printStackTrace();
        }

    }

    public static int[] returnNewArray(int[] arr) throws RuntimeException {
        int[] newArray = new int[0];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                newArray = new int[arr.length - i - 1];
                System.arraycopy(arr, i + 1, newArray, 0, arr.length - i - 1);
                return newArray;
            }
        }

        throw new RuntimeException();


    }


    public static boolean checkNumber(int[] arr) {
        boolean hasOne = false;
        boolean hasFore = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                hasOne = true;
            }
            if(arr[i] == 4) {
                hasFore = true;
            }
        }
        return hasOne && hasFore;
    }
}
