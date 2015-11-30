package week3.day1HomeWork;

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
        System.out.println(toUpperCase("alala"));

    }



    public static String toUpperCase(String word){
        char [] letters = word.toCharArray();
        letters[0] = Character.toUpperCase(letters[0]);

        word = "";

        for (int i = 0; i < letters.length; i++) {
            word += letters[i];
        }
        return word;
    }
}
