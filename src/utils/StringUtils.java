package utils;

/**
 * Created by SlavaKhonin on 11/21/2015.
 */
public class StringUtils {
    public static String sayHello (String name){

        String sayHello = "Hello " + name;
        return sayHello;

        
    }

    public static String longestWord (String[] words){
        String longestWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (longestWord.length() < words[i].length()){
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static String shortestWord (String[] words){
        String shortestWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (shortestWord.length() > words[i].length()){
                shortestWord = words[i];
            }
        }
        return shortestWord;
    }


    public static int howManyChars (char[] characters, char character){
        int sum = 0;
        for (int i = 0; i < characters.length; i++) {
            if(characters[i] == character)
            {
                sum++;
            }
        }

        return sum;
    }
    public static String[] replaceBadWord (String sentence, String badWord){
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(badWord)){
                words[i] = "Censored";
            }

        }

        return words;
    }

    public static String[] wordsToUpperCase(String[] words){
        for (int i = 0; i < words.length; i++) {
            words[i] = toUpperCase(words[i]);
        }
        return words;
    }

    private static String toUpperCase(String word){
        char [] letters = word.toCharArray();
        letters[0] = Character.toUpperCase(letters[0]);

        word = "";

        charArrayToString(letters);
        return word;
    }

    public static String charArrayToString (char[] letters){

        String word = "";

        for (int i = 0; i < letters.length; i++) {
            word += letters[i];
        }
        return word;
    }

    public static String stringArrayToString (String[] words){
        String sentence = "";
        for (int i = 0; i < words.length; i++) {
            sentence += words[i] + " ";
        }
        return sentence;
        }

}