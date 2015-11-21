package Week1Homework;

import java.util.Scanner;


public class Homework4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 digit number(like 356):");
        int number = sc.nextInt();

        int firstdigit = number / 100;
        int second_digit = (number % 100) / 10;
        int third_digit = number %10;

        int max_number;
        int min_number;

        if (number > 100 && number < 999) {

            if (firstdigit > second_digit) {
                max_number = firstdigit;
                min_number = second_digit;
            } else {
                max_number = second_digit;
                min_number = firstdigit;
            }
            if (third_digit > max_number) {
                max_number = third_digit;
            } else if (third_digit < min_number) {
                min_number = third_digit;
            }
            System.out.println("The biggest number from this digits is " + max_number);
            System.out.println("The smallest number from this digits is " + min_number);
        } else {
            System.out.println("Number must be between 100 and 999");
        }


    }
}
