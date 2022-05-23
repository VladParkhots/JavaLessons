package lessons.day4;

import java.util.Arrays;
import java.util.Random;

public class HW4_Task2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int [] array = new int [100];

        for (int i = 0 ; i < array.length; i++){
            array [i] = rand.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int max = 0;
        int min = 10000;

        int counter = 0;
        int sumZeroNot = 0;

        for (int i : array){
            if (i > max)
                max = i;
            if (i < min)
                min = i;
            if (i % 10 == 0)
                counter++;
            if (i % 10 != 0)
                sumZeroNot += i;
        }

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        System.out.println("Counter: " + counter);
        System.out.println("Other sum: " + sumZeroNot);

    }
}
