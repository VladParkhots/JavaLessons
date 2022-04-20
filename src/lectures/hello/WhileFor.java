package lectures.hello;

public class WhileFor {
    public static void main(String[] args) {
        int value = 0;
        while (value < 5) {
            System.out.println("Hello! " + value);
            value++;
        }
        for (int i = 0; i <= 5; i++) {
            System.out.print(" By!"+i);
        }
    }
}
