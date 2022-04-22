package lectures.hello;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        String[] s = new String[3];

        s[0] = "hi";
        s[1] = "hq";
        s[2] = "hz";

        for (String strings:s) {
            System.out.println(strings);
        }

        int[] numb = {1,2,3};
        int sum =0;
        for(int x:numb){
            sum += x;
        }
        System.out.println(sum);
    }
}
