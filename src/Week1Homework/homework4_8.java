package Week1Homework;

import java.util.Scanner;

/**
 * Created by vkhonin on 11/17/2015.
 * 4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
 124    4    -   true
 1456   567  -   false
 1      2    -   false
 18     98   -   true
 */
public class homework4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers one:");
        int number_one = scanner.nextInt();
        System.out.println("Please enter numbers two:");
        int number_two = scanner.nextInt();

        if (number_one % 10 == number_two % 10){
            System.out.println("True");
        }else{
            System.out.println("False");
        }



    }
}
