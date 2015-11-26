package Week2Homework;

import static utils.ArrayUtils.createRandomArray;
import static utils.ArrayUtils.findMaximumInArray;
import static utils.ArrayUtils.findMinimunInArray;

/**
 * Created by vkhonin on 11/24/2015.
 * 1) Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class Homework1 {
    public static void main(String[] args) {
        int [] randomArray = createRandomArray(10,100);
        int minValueOfArray = findMinimunInArray(randomArray);
        int maxValueOfArray = findMaximumInArray(randomArray);

        System.out.println("The minimum value is: " + minValueOfArray);
        System.out.println("The maximum value is: " + maxValueOfArray);

    }
}
