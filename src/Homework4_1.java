import java.util.Scanner;


public class Homework4_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter what time of day is[0-23]:");
            int day_hour = scanner.nextInt();

            if (day_hour>24 || day_hour<0)
            {
                System.out.println("Time of the day can only be from 0 to 23");

            }else if (day_hour > 9 && day_hour < 18) {
                System.out.println("I am at work");
            }
            else {
                System.out.println("I am at home now");
            }
        }
    }
