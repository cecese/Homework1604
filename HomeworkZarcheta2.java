package Homework1604;

import java.util.Random;

public class HomeworkZarcheta2 {
    public static void main(String[] args) {
        int min = 1;
        int max = 6;

        Random random = new Random();

        for (int i = 1; i <= 2; i++) {
            int value = random.nextInt( ((max-min) + min));
            int newValue = random.nextInt(((max-min)+min));
            int sum = value + newValue;
            System.out.println(value + " " + newValue + " " + "The sum is" + " " + sum);


        }
        System.out.println("The winner is" + " " );

 //       int value = random.nextInt( ((max-min) + min));
 //       System.out.println(value);
    }
}
