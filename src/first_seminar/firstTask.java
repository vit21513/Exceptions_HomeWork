package first_seminar;//
//1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный
//   одномерный массив. Метод должен пройтись по каждому элементу и проверить что он не равен null.
//        А теперь реализуйте следующую логику:
//        Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//        Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

import java.util.ArrayList;
import java.util.List;

public class firstTask {


    public static void main(String[] args) {

        Integer[] test_array = {2, null, 44, 55, null, 55, null, 5};
        checkArray(test_array);
    }


    public static void checkArray(Integer[] arr) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                result.add(i);
            }
        }
        if (result.size() == 0) {
            System.out.println("All elements array is not null");
        } else {
            throw new RuntimeException("Array elements with indexes are equal to null " + result);
        }
    }
}