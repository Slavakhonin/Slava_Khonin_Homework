package week3.day1HomeWork;

import java.util.Scanner;

import static utils.ArrayUtils.showArray;
import static utils.StringUtils.wordsToUpperCase;

/**
 * Created by SlavaKhonin on 11/30/2015.
 * Верхний регистр.
		Напишите программу, которая позволяет пользователю ввести в консоли строку,
		переводит первый символ слов в верхний регистр и результат выводит в консоль
		Вход:
		иван васильевич
		Выход:
		Иван Васильевич

 */
public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        wordsToUpperCase(words);
        showArray(words);

    }


}
