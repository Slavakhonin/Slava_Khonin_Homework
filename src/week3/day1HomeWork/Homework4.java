package week3.day1HomeWork;

import static utils.StringUtils.charArrayToString;

/**
 * Created by vkhonin on 11/30/2015.
 * 5. Ввести предложение с консоли, каждое четное слово инвертировать, в каждом нечетном слове удалить каждую четную букву.
 Результат выводить на консоль.

 Ввод:
 Как решить это задание и не сломать себе голову?

 Вывод:
 каК ршт отэ здне и н ьтамолс сб ?уволог
 */
public class Homework4 {
    public static void main(String[] args) {
        String str = "Как решить это задание и не сломать себе голову?";

        String[] words = str.split(" ");

    }

    public static String removePairLetters(String word){
        char[] letters = new char[word.length()];
        int halfWordLength = 0;
        int j = 1;

        if(word.length() % 2 == 0){
            halfWordLength = word.length() / 2;
        } else {
            halfWordLength = word.length() / 2 + 1;
        }
        char[] halfLetters = new char[halfWordLength];

        for (int i = 0; i < letters.length; i++) {
            if (i == 0){
                halfLetters[0] = letters[i];
            }else if (letters.length % 2 == 0){
               halfLetters[j] = letters[i];
                j++;
            }

        }
        return charArrayToString(halfLetters);
    }

    public static String revertWord (String word){
        char[] letters = new char[word.length()];

        char temp;
            for (int i = 0; i < letters.length / 2; i++) {
                temp = letters [i];
                letters[i] = letters[letters.length - i];
                letters[letters.length - 1] = temp;
            }
        return charArrayToString(letters);
    }


}
