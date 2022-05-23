package lessons.day4;

import java.util.Random;

public class HW4_Task4 {
    public static void main(String[] args) {
        int [] matrix = new int[100];

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++){
            matrix[i] = random.nextInt(10000);
        }

        int maxSum = 0;
        int index = 0;

        for (int i = 1; i+1 < matrix.length; i++){
            int sum = matrix[i] + matrix[i-1] + matrix[i+1];
            if (sum > maxSum){
                maxSum = sum;
                index = i-1;
            }
        }

        System.out.println(maxSum);
        System.out.println(index);

    }
}
