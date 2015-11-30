package week3.day1HomeWork;

import static utils.ArrayUtils.showArray;
import static utils.StringUtils.replaceBadWord;

/**
 * Created by SlavaKhonin on 11/30/2015.
 * Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой».
 */
public class Homework2 {
    public static void main(String[] args) {
        String str = "I was pretty fucked up.";

        showArray(replaceBadWord(str, "fucked"));
    }

}
