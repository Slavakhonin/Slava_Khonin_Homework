package Week2Homework;

import java.util.Scanner;

import static utils.ArrayUtils.GenerateRandomDigit;
import static utils.ArrayUtils.showArray;

/**
 * Created by vkhonin on 11/24/2015.
 * 5) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
 */
public class Homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the range of array: ");
        int arrayRange = sc.nextInt();

        int[] array = new int[arrayRange];

        for (int i = 0; i < arrayRange; i++) {
            if (i % 2 == 0) {
                while (true) {
                    int random = GenerateRandomDigit(100);
                    if (random % 2 == 0) {
                        array[i] = random;
                        break;
                    }
                }

            } else if (i % 2 != 0) {
                while (true) {
                    int random = GenerateRandomDigit(100);
                    if (random % 2 != 0) {
                        array[i] = random;
                        break;
                    }

                }

            }


        }

        showArray(array);

    }
}