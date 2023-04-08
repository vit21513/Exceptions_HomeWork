package first_seminar;

public class secondTask {

    public static void main(String[] args) {

        int[] firstArray = {5, 7, 99, 9, 11, 8, 15};
        int[] secondArray = {1, 5, 1, 8, 1, 0, 2};
        System.out.println("Fist Array");
        printArray(firstArray);
        System.out.println("Second Array");
        printArray(secondArray);
        System.out.println("Summa first and second Arrays");
        printArray(sumTwoArray(firstArray, secondArray));
    }

    public static int[] sumTwoArray(int[] first, int[] second) {
        if (first.length != second.length) {
            throw new RuntimeException("The length of the arrays is different");
        } else {
            int lenAray = first.length;
            int[] summArray = new int[lenAray];
            for (int i = 0; i < first.length; i++) {
                summArray[i] = first[i] + second[i];
            }
            return summArray;
        }
    }

    public static void printArray(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        System.out.println(result);
    }


}
