


public class ArraySum {

    public static void main(String[] args) {
        String[][] arr = {{"6", "7", "4", "4"}, {"5", "8", "7", "2"}, {"9", "6", "11", "52"}, {"3", "7", "15", "12"}};
        try {
            int sum = sumArray(arr);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные  в элементе с индексом  [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

    public static class MyArraySizeException extends RuntimeException {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    public static class MyArrayDataException extends RuntimeException {
        public MyArrayDataException(String message) {
            super(message);
        }
    }
}