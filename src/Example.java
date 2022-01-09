import java.util.Arrays;

public class Example {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}};

        int[][] b = {
                {7, 8},
                {9, 10},
                {11, 12}};

        int[][] c = new int[a.length][b[b.length - 1].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[b.length - 1].length; j++) {
                for (int q = 0; q < b.length; q++) {
                    c[i][j] += a[i][q] * b[q][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(c).replace("],", "]\n"));
    }
}



















