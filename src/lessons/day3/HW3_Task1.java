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
                case "Милан": case "Рим": case "Турин":
                    System.out.println("Италия");
                    break;
                case "Москва": case "Владивосток": case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Stop":
                    break;
                default:
                    System.out.println("nothing");

            }
        }while (!city.equals("Stop"));


    }
}
