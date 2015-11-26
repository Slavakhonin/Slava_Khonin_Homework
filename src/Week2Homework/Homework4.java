package Week2Homework;

import java.util.Scanner;

/**
 * Created by vkhonin on 11/24/2015.
 * 4) Посчитать сколько цифр(цифра задается пользователем) в массиве
 */
public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please initialize the size of array: ");
        int sizeOfArray = sc.nextInt();
        int[] userArray = new int[sizeOfArray];

        for (int i = 0; i <sizeOfArray ; i++) {
            System.out.printf("Please enter the %d element of array: ", i);

            userArray[i] = sc.nextInt();
        }

        System.out.println("There is " + userArray.length + " numbers in array");
    }
}
