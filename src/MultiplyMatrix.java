import java.util.Arrays;

public class MultiplyMatrix {

    /**
     * Multiplies raws of 1st 2D array and columns of 2nd 2D array.
     * Puts result into new matrix.
     */

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        int[][] res = new int[matrix1.length][matrix2[matrix2.length - 1].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[matrix2.length - 1].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    res[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 8},
                {7, -13, 50}};

        int[][] b = {
                {1, 44},
                {7, -13},
                {-5, 12}};

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}



