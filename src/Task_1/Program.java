package Task_1;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
в качестве кода ошибки, иначе - длину массива.
 */

public class Program {
    public static Integer checkArray(Integer[] args, Integer min) {
        if (min < args.length){
            return args.length;
        }
        return -1;
    }
}
