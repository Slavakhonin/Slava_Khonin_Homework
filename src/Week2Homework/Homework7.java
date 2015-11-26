package Week2Homework;

import static utils.ArrayUtils.createRandomArray;
import static utils.ArrayUtils.showArray;

/**
 * Created by vkhonin on 11/25/2015.
 * 7) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 */
public class Homework7 {
    public static void main(String[] args) {
        int[] array = createRandomArray(10,100);

        int halfway = array.length/2;
        int middleArifmetic1 = 0;
        int middleArifmetic2 = 0;

        showArray(array);

        for (int i = 0; i < array.length ; i++) {

            if (i < halfway){
                middleArifmetic1 += array[i];
            }else{
                middleArifmetic2 += array[i];
            }
        }
        middleArifmetic1 = middleArifmetic1/halfway;
        middleArifmetic2 = middleArifmetic2/halfway;

        if (middleArifmetic1 > middleArifmetic2){
            for (int i = 0; i < halfway ; i++) {
                System.out.print(array[i] + " ");
            }
            }else{
                for (int i = halfway; i <array.length ; i++) {
                    System.out.print(array[i] + " ");
                }
        }


    }

}
