package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final String EMPTY = " ";
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(map)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(map)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    public static boolean checkWin(char[][] arr) {
        if (checkLine(arr) || checkLine1(arr) || checkLine2(arr) || checkLine3(arr)) {
            return true;
        }

        return false;
    }

    public static boolean checkLine(char[][] arr) {
        int checkCounter = 0;
        for (int i = 0; i < map.length - 1; i++) {
            for (int j = 0; j < map.length - 1; j++) {
                if (i == j) {
                    if (arr[i][j] != DOT_EMPTY && arr[i][j] == arr[i + 1][j + 1]) {
                        checkCounter++;
                        if (checkCounter >= DOTS_TO_WIN - 1) {
                            return true;
                        }
                    } else {
                        checkCounter = 0;
                    }
                }
            }
        }

        return false;
    }

    public static boolean checkLine1(char[][] arr) {
        int checkCounter = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map.length - 1 - i == j) {
                    if (arr[i][j] != DOT_EMPTY && arr[i][j] == arr[map.length - 1 - i][map.length - 1 - j]) {
                        checkCounter++;
                        if (checkCounter >= DOTS_TO_WIN - 1) {
                            return true;
                        }
                    } else {
                        checkCounter = 0;
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkLine2(char[][] arr) {
        for (int i = 0; i < map.length; i++) {
            int checkCounter = 0;
            for (int j = 0; j < map.length - 1; j++) {
                if (arr[i][j] != DOT_EMPTY && arr[i][j] == arr[i][j + 1]) {
                    checkCounter++;
                    if (checkCounter >= DOTS_TO_WIN - 1) {
                        return true;
                    }
                } else {
                    checkCounter = 0;
                }
            }
        }
        return false;
    }

    public static boolean checkLine3(char[][] arr) {
        for (int j = 0; j < map.length; j++) {
            int checkCounter = 0;
            for (int i = 0; i < map.length - 1; i++) {
                if (arr[i][j] != DOT_EMPTY && arr[i][j] == arr[i + 1][j]) {
                    checkCounter++;
                    if (checkCounter >= DOTS_TO_WIN - 1) {
                        return true;
                    }
                } else {
                    checkCounter = 0;
                }
            }
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }

        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + EMPTY + (y + 1) + "");
        map[x][y] = DOT_0;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Ход человека.\nВведите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }


    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + EMPTY);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + EMPTY);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
        System.out.println();
    }
}

