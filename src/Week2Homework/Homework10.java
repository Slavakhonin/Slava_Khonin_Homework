package Week2Homework;

import static utils.ArrayUtils.createRandomArray;
import static utils.ArrayUtils.showArray;
import static utils.ArrayUtils.splitArray;

/**
 * Created by vkhonin on 11/26/2015.
 * public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end
 }
 */
public class Homework10 {
    public static void main(String[] args) {

        int[] array = createRandomArray(10,100);
        showArray(array);
        splitArray(array,0,6);

    }
}
