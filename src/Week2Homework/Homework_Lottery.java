package Week2Homework;

import java.util.Scanner;

import static utils.ArrayUtils.indexOfArray;
import static utils.ArrayUtils.showArray;
import static utils.ArrayUtils.sortArray;

/**
 * Created by vkhonin on 11/27/2015.
 */
public class Homework_Lottery {
    public static void main(String[] args) {
        System.out.println("Welcome to our lottery game and thanks for buying a ticket.");
        System.out.println("Please choose six different numbers from 1 to 42:");

        int[] userNumbers = new int[6];
        userNumbersInArray(userNumbers);


        int[] lotteryNumbers = new int[6];
        uniqueArray(lotteryNumbers);

        System.out.print("You have define numbers: ");
        showArray(userNumbers);
        System.out.print("Numbers in lottery: ");
        showArray(lotteryNumbers);
        System.out.printf("You have %d winning numbers.", winningNumbers(userNumbers, lotteryNumbers));
    }

    public static int generateRandomNumber1To42() {
        return (int) (Math.random() * 42 + 1);
    }

    public static int[] userNumbersInArray(int[] userArray) {
        Scanner sc = new Scanner(System.in);

        int[] lotteryArray = new int[6];

        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.printf("Please enter the %d number in ticket: ", i + 1);
                userArray[i] = sc.nextInt();
                if (userArray[i] > 0 && userArray[i] < 43) {
                    if (indexOfArray(lotteryArray, userArray[i]) < 0) {
                        break;
                    } else {
                        System.out.println("You have entered a duplicate number, please note that all numbers must be unique.");
                    }
                } else {
                    System.out.println("You must choose only numbers between 1 and 42");
                }
            }
            lotteryArray[i] = userArray[i];
        }
        sortArray(userArray);
        return lotteryArray;
    }

    public static int[] lotteryNumbersInArray(int[] lotteryArray) {
        for (int i = 0; i < 6; i++) {
            lotteryArray[i] = generateRandomNumber1To42();
        }

        sortArray(lotteryArray);
        return lotteryArray;
    }

    public static int[] uniqueArray(int[] array) {

        while (true) {

            lotteryNumbersInArray(array);
            int counter = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == array[i + 1]) {
                    counter++;
                }

            }
            if (counter == 0) {
                break;
            }
        }
        return array;
    }

    public static int winningNumbers(int[] userArray, int[] lotteryArray) {
        int winningNumbers = 0;

        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                if (userArray[j] == lotteryArray[i]) {
                    winningNumbers++;
                }
            }
        }
        return winningNumbers;
    }
}

