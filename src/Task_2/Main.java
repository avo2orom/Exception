package Task_2;

import Task_2.Program;

public class Main {
    public static void main(String[] args) {
        Integer elem = 8;
        Integer[] arr = {1,5,6,3,7,8,6};

        System.out.println(Program.ErrorMessage(Program.findElement(arr,elem)));
    }
}
