package lectures.hello;

public class Multidimensional_Arrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        for(int[] i: matrix) {
            for(int k: i) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
