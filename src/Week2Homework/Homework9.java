package Week2Homework;

import static utils.ArrayUtils.GenerateRandomDigit;

/**
 * Created by vkhonin on 11/26/2015.
 * Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
 */
public class Homework9 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        fillArray25To75(array1);
        fillArray25To75(array2);

        if (checkHowMuchPairNumber(array1) > checkHowMuchPairNumber(array2)){
            System.out.println("First array has more pair numbers");
        }else{
            System.out.println("Second array has more pair numbers");
        }




    }

    public static int[] fillArray25To75 (int[] array){
       int random = 0;

        for (int i = 0; i < 10; i++) {
            while (true){
                random = GenerateRandomDigit(75);
                if(random >= 25 & random <= 75){
                    array[i] = random;
                    break;
                }
            }

        }
        return array;
    }

    public static int checkHowMuchPairNumber (int[] array){
        int pair = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0){
                pair++;
            }
        }
        return pair;
    }
}
