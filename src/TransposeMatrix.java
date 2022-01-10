
import java.util.Arrays;

public class TransposeMatrix {

    /**
     * Transposes 2D array by diagonal (swaps raws and columns).
     */
    public static int[][] transpose(int[][] matrix) {

        int[][] newMatrix = new int[matrix[matrix.length - 1].length][matrix.length];

        for (int i = 0; i < matrix[matrix.length - 1].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                newMatrix[i][j] = matrix[j][i];
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 4, 5},
                {7, 11, 33, 44},
                {55, 66, 77, 88},
                {55, 66, 77, 88},
                {55, 66, 77, 88}};

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}