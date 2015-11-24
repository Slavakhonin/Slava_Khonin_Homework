package Week2Homework;

import static utils.ArrayUtils.createRandomArray;
import static utils.ArrayUtils.showArray;

/**
 * Created by vkhonin on 11/24/2015.
 */
public class Homework3 {
    public static void main(String[] args) {
        int[] firstArray = createRandomArray(10,100);
        int[] secondArray = createRandomArray(10,100);

        for (int i = 0; i <firstArray.length ; i++) {
            secondArray[i] = firstArray[i];
        }
        showArray(firstArray);
        showArray(secondArray);
    }
}
