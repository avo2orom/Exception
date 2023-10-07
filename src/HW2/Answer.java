package HW2;

public class Answer {
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        if(a.length != b.length){
            return new int[]{0};
        }
        else {
            int [] result = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] - b[i];
            }
            return result;
        }

    }
}
