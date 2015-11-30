package week3.day1HomeWork;

import java.util.Scanner;

import static utils.ArrayUtils.*;
import static utils.StringUtils.*;

/**
 * Created by SlavaKhonin on 11/30/2015.
 * 2. Ввести предложение с консоли, найти самое короткое и самое длинное слово.
     Вывести найденные слова и их длину.

 */
public class Homework1 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a new sentence:");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");

        String shortestWord = shortestWord(words);
        String longestWord = longestWord(words);

        System.out.println("The shortest word is: " + shortestWord + " and it is " + shortestWord.length() + " letters long.");
        System.out.println("The longest word is: " + longestWord + " and it is " + longestWord.length() + " letters long.");

        showArray(words);

    }


}
