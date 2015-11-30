package Week2Homework;

import static utils.ArrayUtils.createRandomArray;
import static utils.ArrayUtils.showArray;
import static utils.ArrayUtils.sumAllArrayElements;

/**
 * Created by vkhonin on 11/25/2015.
 * 7) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 */
public class Homework8 {
    public static void main(String[] args) {
        int[] array1 = createRandomArray(10,100);
        int[] array2 = createRandomArray(10,100);

        for (int i = 0; i <array1.length ; i++) {
            array1[i] += array2[2];
        }

        showArray(array1);


    }
}
