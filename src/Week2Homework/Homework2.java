package Week2Homework;
import utils.ArrayUtils;

import static utils.ArrayUtils.*;

/**
 * Created by vkhonin on 11/24/2015.
 */
public class Homework2 {
    public static void main(String[] args) {
        int[] array = createRandomArray(10,100);
        int minValue = findMinimunInArray(array);
        int maxValue = findMaximumInArray(array);
        int minIndex = indexOfArray(array,minValue);
        int maxIndex = indexOfArray(array,maxValue);

        showArray(array);

        array[minIndex] = maxValue;
        array[maxIndex] = minValue;

        showArray(array);


    }
}
