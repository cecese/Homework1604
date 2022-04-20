package Homework1604;

public class Homework1tablica {
    public static void main(String[] args) {
        int result = sum(5, 1);

    }

    public static int sum( int number, int multiplyBy) {
        if ( multiplyBy <= 10) {

            System.out.println(number + " " + "*" + " " + multiplyBy + " " + "=" + number*multiplyBy);
            sum(number, multiplyBy +1);
            return 1;
        }
        else {
            return 0;
        }
    }
}
