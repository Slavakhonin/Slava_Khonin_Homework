package utils;

/**
 * Created by vkhonin on 11/24/2015.
 */
public class ArrayUtils {
    public static void showArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void showArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createAndFillArray(int size){
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i;
        }
        return numbers;
    }

    public static int[] createRandomArray(int size, int range){
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = getGenerateRandomDigit(range);
        }
        return numbers;
    }

    private static int getGenerateRandomDigit(int range) {
        return (int)(Math.random() * range);
    }

    public static int GenerateRandomDigit(int range){
        return getGenerateRandomDigit(range);
    }



    public static int[] sortArray(int[] array){
        for (int j = array.length; j >=0; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        return array;
    }

    public static int findMinimunInArray(int[] array) {
        int min = array[0];

        for (int i = 0; i <array.length ; i++) {
            if (min > array[i])
            {
                min = array[i];
            }

        }

        return min;
    }

    public static int findMaximumInArray(int[] array) {
        int max = array[0];

        for (int i = 0; i <array.length ; i++) {
            if (max < array[i])
            {
                max = array[i];
            }

        }

        return max;
    }

    public static int indexOfArray (int[] array, int number){
        int index = -1;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] == number){
                index = i;
                break;
            }
        }
        return index;
    }

    public static double findArrayAverage(int[] array){
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            average += array[i];
            }
        return average/array.length;
    }

    public static int sumAllArrayElements(int[] array){
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum += array[i];

        }
        return sum;

        }
}

