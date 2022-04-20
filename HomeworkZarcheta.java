package Homework1604;

public class HomeworkZarcheta {
    public static void main(String[] args) {
        int zarche1 = 1;
        int zarche2 = 6;
        int range = (zarche2 - zarche1 +1) + zarche1;
        int rand;
        int rand2;

        for ( int i = 0; i < 7; i++) {
            rand = (int) (Math.random()*range) * zarche1;

            for (int j = 0; j == i; j++){
                rand = (int) (Math.random()*range) * zarche1;

            }

            System.out.println(rand + " " + rand);

        }

    }
}
