package lesson9;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "7", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        try {
            System.out.println(sumTwoDimensionalArr(arr));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    protected static int sumTwoDimensionalArr(String arr[][]) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("array is broken at position " + i + " " + j);
                }
            }
        }
        return sum;
    }
}