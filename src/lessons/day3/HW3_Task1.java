package lessons.day3;

import java.util.Scanner;

public class HW3_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city;

        do {
            System.out.println("Enter city");
            city = scanner.nextLine();

            switch (city) {
                case "�����": case "���": case "�����":
                    System.out.println("������");
                    break;
                case "������": case "�����������": case "������":
                    System.out.println("������");
                    break;
                case "Stop":
                    break;
                default:
                    System.out.println("nothing");

            }
        }while (!city.equals("Stop"));


    }
}
