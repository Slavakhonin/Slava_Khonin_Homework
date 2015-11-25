package Week2Homework;

import static utils.ArrayUtils.createRandomArray;
import static utils.ArrayUtils.findArrayAverage;

/**
 * Created by vkhonin on 11/25/2015.
 */
public class Homework6 {
    public static void main(String[] args) {
        int[] arrayInt = createRandomArray(10,100);
        System.out.println("Array avarage is: " + findArrayAverage(arrayInt));
    }
}
