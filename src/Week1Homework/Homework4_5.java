package Week1Homework;

import java.util.Scanner;

/**
 * Created by vkhonin on 11/17/2015.
 */
public class Homework4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers one:");
        int number_one = scanner.nextInt();
        System.out.println("Please enter numbers two:");
        int number_two = scanner.nextInt();

        if (number_one > number_two)
        {
            System.out.println("Substraction is: " + (number_one - number_two));
        }else if (number_one < number_two){
            System.out.println("Addition is: " + (number_one + number_two));
        }else{
            System.out.println("Your numbers are equal");
        }

    }
}
