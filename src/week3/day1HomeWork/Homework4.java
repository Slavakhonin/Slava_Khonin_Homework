package week3.day1HomeWork;

import static utils.ArrayUtils.showArray;
import static utils.StringUtils.charArrayToString;
import static utils.StringUtils.stringArrayToString;

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

        System.out.print("How it was before: ");
        System.out.println(str);
        System.out.println("How it became after: ");
        System.out.println(brakeYourBrain(words));


    }

    public static String brakeYourBrain (String[] words){
            String[] revWord = new String[words.length];
        for (int i = 0; i < words.length; i++) {

            if (i == 0){
                revWord[i] = revertWord(words[i]);
            }else if (i % 2 == 0){
                revWord[i] = revertWord(words[i]);
            }else{
                revWord[i] =  removePairLetters(words[i]);
            }
        }

        return stringArrayToString(revWord);
    }

    public static String removePairLetters(String word){
        char[] letters = new char[word.length()];
        letters = word.toCharArray();
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
            }else if (i % 2 == 0){
               halfLetters[j] = letters[i];
                j++;
            }

        }
        return charArrayToString(halfLetters);
    }

    public static String revertWord (String word){
        char[] letters = new char[word.length()];
        letters = word.toCharArray();
        char temp;
            for (int i = 0; i < letters.length / 2; i++) {
                temp = letters [i];
                letters[i] = letters[letters.length - i - 1];
                letters[letters.length - i - 1] = temp;
            }
        return charArrayToString(letters);
    }


}
