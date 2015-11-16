import java.util.Scanner;

/**
 * Created by vkhonin on 11/16/2015.
 * 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */
public class Homework4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a float number:");
        float number = scanner.nextFloat();

        if (number > 0 && number < 1) {
            System.out.println("Your number is between 0 and 1");
        }else{
            System.out.println("Your number is bigger than 1 or smaller than 0");
        }
    }
}
