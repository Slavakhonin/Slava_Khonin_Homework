import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created by vkhonin on 11/16/2015.
 * 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение,если число делится на 7 нацело.
 */
public class Homework4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number, if it will be divided by 7 we will return number that is multiple on itself:");
        int number = scanner.nextInt();

        if (number % 7 == 0){
            int multiplication = (int)pow(number,2);
            System.out.println("Your number multiplication on it self is: " + multiplication);
        }else{
            System.out.println("This number is not divided by 7");
        }
    }
}
