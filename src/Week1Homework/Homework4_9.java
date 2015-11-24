package Week1Homework;

import java.util.Scanner;

/**
 * Created by vkhonin on 11/17/2015.
 * Посчитать сколько раз встречается символ 5 в заданном числе, которое вводит юзер
 435  -   1
 505  -   2
 555  -   3
 305    - 1
 */
public class Homework4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 digit numbers:");
        int number = scanner.nextInt();

        int digit_one = number % 100;
        int digit_two = (number % 100) / 10;
        int digit_three = number % 10;
        int counter = 0;

        if (digit_one == 5){
            counter++;
        }else if (digit_two == 5){
            counter++;
        }else if(digit_three == 5){
            counter++;
        }

        System.out.println("You number contains " + counter +  " numbers 5");


    }
}
