package lessons.two;

import java.util.Scanner;

public class HW2_TaskOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int stage = s.nextInt();
        if (stage>=9) {
            System.out.println("������������ ���");
        } else if (stage>=5) {
            System.out.println("������������� ���");
        } else if (stage>=1) {
            System.out.println("����������� ���");
        } else {
            System.out.println("������ �����");
        }
    }
}
