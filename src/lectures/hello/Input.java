package lectures.hello;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type");
        String string = sc.nextLine();
        System.out.println("You type " + string);
        int a = sc.nextInt();
        System.out.println("you choose " + a);
    }

}
