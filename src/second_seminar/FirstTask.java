package first_seminar.second;

import java.util.Scanner;

//1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
//приложения,вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class FirstTask {
    public static void main(String[] args) {

        System.out.println(RepostNumber());
    }

    public static float RepostNumber() {


        float result;
        while (true) {
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Введите дробное число: ");
                result = input.nextFloat();
                input.close();
                break;
            } catch (Exception e) {
                System.out.println("Ошибка ввода, ведите дробное число.");
            }
        }
        return result;
    }
}
