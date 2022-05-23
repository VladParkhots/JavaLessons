package lessons.day4;

import java.util.Random;

public class HW4_Task3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int [][] array = new int[12][8];

        int sum = 0;
        int newSum = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++){
            for (int w = 0; w < array [i].length; w++){
                array [i][w] = rand.nextInt(50);

                newSum += array [i][w];
            }
            if (newSum >= sum){
                sum = newSum;
                index = i;
            }
            newSum = 0;
        }
        System.out.println(index);
        System.out.println(sum);

    }
}
