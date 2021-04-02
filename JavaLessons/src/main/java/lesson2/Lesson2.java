package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        replaceNumber();
        fillIn();
        cycle();
        squareArray();
        maxMin(new int[]{7, 6, 8, 12, 78, -6});

    }

    public static void replaceNumber() {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void fillIn() {
        int[] gin = new int[8];
        for (int i = 0; i < gin.length; i++) {
            gin[i] = i * 3;
        }
    }

    public static void cycle() {
        int[] hot = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int o : hot) {
            if (o < 6) {
                o *= 2;
            }
        }
    }

    public static void squareArray() {
        int[][] tip = new int[4][4];
        for (int i = 0; i < tip.length; i++) {
            for (int j = 0; j < tip.length; j++) {
                if (i == j || tip.length - 1 - i == j) {
                    tip[i][j] = 1;
                } else {
                    tip[i][j] = 0;
                }

                System.out.print(tip[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void maxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Max :" + max);
        System.out.println("Min :" + min);
    }
}
