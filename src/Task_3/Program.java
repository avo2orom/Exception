package Task_3;

import java.util.Arrays;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения:
метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */
public class Program {

    public static int check_array(Integer[][] arr) {
        if(arr.length != arr[0].length){
            throw new RuntimeException("Массив не квадратный" + arr.length + "x" + arr[0].length);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]> 1 || arr[i][j] < 0){
                    throw new RuntimeException("Значение не удовлетворяют условиям");
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
