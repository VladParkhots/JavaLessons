package lectures.hello;

import java.util.Random;

public class RandomInt {
    public static void main(String[] args) {
        Random rand = new Random();


        for (int i = 0; i < 10; i++){
            System.out.print(Math.round(Math.random()*10)+" ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++){
            System.out.print(rand.nextInt(10));
        }
    }
}
