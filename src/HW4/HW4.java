package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить
к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class HW4 {

    public static void printfloat() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            float a = getFloat(bufferedReader);
            bufferedReader.close();
            System.out.println(a);
        }
        catch (IOException e){
            System.out.println("Please enter float type of number");
            return;
        }
    }

    public static float getFloat(BufferedReader bufferedReader){
        System.out.print("Enter a float number: ");
        float result;
        try {
            result = Float.parseFloat(bufferedReader.readLine());
        }catch (NumberFormatException e){
            System.out.println("Error with .");
            return getFloat(bufferedReader);
        } catch (Exception e){
            System.out.println("Error with number");
            return getFloat(bufferedReader);
        }

        return result;
    }
}
