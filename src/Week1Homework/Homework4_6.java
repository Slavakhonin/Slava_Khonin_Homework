package Week1Homework;

import java.util.Scanner;

/**
 * Created by vkhonin on 11/17/2015.
 * 4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
 */
public class Homework4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers one:");
        int number_one = scanner.nextInt();
        System.out.println("Please enter numbers two:");
        int number_two = scanner.nextInt();


        if (number_one + number_two >11 && number_two + number_one <19){
            System.out.println("Your number addition is in range between 11 and 19 and is: " + (number_one + number_two));
        }else{
            System.out.println("Your numbers addition is out of range 11 and 19");
        }
    }
}
