package lessons.day3;

import java.util.Scanner;

public class HW3_Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++ ){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if (y==0){
                System.out.println("������� �� 0");
                continue;
            }
            System.out.println(x/y);
        }
    }
}
