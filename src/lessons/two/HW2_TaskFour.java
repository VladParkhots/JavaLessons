package lessons.two;

import java.util.Scanner;

public class HW2_TaskFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double x = s.nextDouble();
        double y;

        if (x>=5){
            y = (Math.pow(x, 2) - 10) / (x + 7);
        }else if (-3 < x){
            y = (x + 3) * (Math.pow(x, 2) -2);
        }else {
            y=420;
        }
        System.out.println(y);
    }
}
