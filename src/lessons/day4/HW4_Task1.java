package lessons.day4;

import java.util.Random;
import java.util.Scanner;

public class HW4_Task1 {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int [] matrix = new int [input];

        int moreThanEight = 0;
        int equalToOne = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        for (int i = 0; i < matrix.length; i++ ){
            matrix [i] = rand.nextInt(10);
            System.out.print(matrix [i] + " ");

            if (matrix [i] > 8)
                moreThanEight++;
            if (matrix[i] == 1)
                equalToOne++;
            if (matrix[i] % 2 == 0 && matrix[i] != 0)
                even++;
            if (matrix[i] % 2 != 0)
                odd++;

            sum +=  matrix[i];
        }

        System.out.println();
        System.out.println("Длина массива: " + matrix.length);
        System.out.println("More than 8: " + moreThanEight);
        System.out.println("Equal to 1: " + equalToOne);
        System.out.println("Even: "+ even);
        System.out.println("Odd: "+ odd);
        System.out.println("Summary: "+sum);



    }
}
