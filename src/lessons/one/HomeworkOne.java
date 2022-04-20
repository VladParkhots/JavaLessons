package lessons.one;

public class HomeworkOne {
    public static void main(String[] args) {
        //Task 1/2
        int i =0;
        while (i<10){
            System.out.print("JAVA ");
            i++;
        }
        //Task 3
        for (i=0;i<10;i++){
            System.out.println("JAVA"+i);
        }
        //Task 4
        int w =1980;
        while (w<=2020){
            System.out.println("Олимпиада "+w+" года");
            w=w+4;
        }
        //Task 5
        for (i=1980;i<=2020;i=i+4){
            System.out.println("Олимпиада "+i+" года");
        }
        //Task 6
        int k = 3;
        for (i=1;i<=9;i++){
            System.out.println(k+" x "+i+" = "+ i*k);
        }

    }
}
