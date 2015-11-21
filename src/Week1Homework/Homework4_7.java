package Week1Homework;

import java.util.Scanner;

/**
 * Created by vkhonin on 11/17/2015.
 * 4.7. Вводим два числа, если одно из них делиться на другое без остатка,
 то выводим true и показываем результат деления (целую часть от деления  и остачу)
 в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
 */
public class Homework4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers one:");
        int number_one = scanner.nextInt();
        System.out.println("Please enter numbers two:");
        int number_two = scanner.nextInt();

        if (number_one % number_two == 0){
            System.out.println("TRUE, division is :" + (number_one / number_two));
        }else{
            System.out.println("FALSE, this numbers will not be divided without something left, whats left is:" + (number_one % number_two));
        }

    }
}
