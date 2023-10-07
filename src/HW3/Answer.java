package HW3;

/*
Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
и возвращающий новый массив с, каждый элемент которого равен
частному элементов двух входящих массивов в той же ячейке.

Если длины массивов не равны - верните нулевой массив длины 1.

Важно: При выполнении метода единственное исключение, которое пользователь может увидеть
- RuntimeException, т.е. ваше.
 */
public class Answer {
    public int[] divArrays(int[] a, int[] b){
        if(a.length != b.length){
            return new int[]{0};
        }
        else {
            int [] result = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                if (b[i] == 0){
                    throw new RuntimeException("Значение = 0");
                }
                else {
                    result[i] = a[i] / b[i];
                }
            }
            return result;
        }


    }
}
