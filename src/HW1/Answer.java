package HW1;

public class Answer {
    public static void arrayOutOfBoundsException() {
        int [] array = new int [5];
        int elem = array[10];

    }

    public static void divisionByZero() {
        int a = 10;
        int result = a / 0;

    }

    public static void numberFormatException() {
        String string = "abc";
        int number = Integer.parseInt(string);

    }
}
