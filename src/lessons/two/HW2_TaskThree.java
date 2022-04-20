package lessons.two;

import java.util.Scanner;

public class HW2_TaskThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        int b = s.nextInt();
        int a = c + 1;


        if (a < b){
            while (a < b){
                if (a % 5 == 0 && a % 10 != 0){
                    System.out.print(a + " ");
                }
                a++;
            }
        }else {
            System.out.println("Некорректный ввод");
        }
    }
}
