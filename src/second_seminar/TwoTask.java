package second_seminar;
//2) Если необходимо, исправьте данный код

//Задание 2
//        try {
//       int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }
//
//

public class TwoTask {

    public static void main(String[] args) {

        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Индекс за пределами массива");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Catching exception : " + e);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Wat's is Wrong!: " + e);
        }
    }
}