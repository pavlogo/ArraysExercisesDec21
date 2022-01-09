
class Spiral {

    public static void main(String[] args) {


        int[][] spiral = Spiral.spiral(7, 4);

        for (
                int i = 0;
                i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }

    /**
     * Transforms 2D array into spiral form.
     */

    public static int[][] spiral(int rows, int columns) {

        int[][] mat = new int[rows][columns];


        int[] arr = new int[]{1, 2, 3, 4, 5, 6,
                7, 8, 9, 10, 11, 12,
                13, 14, 15, 16, 17, 18,
                19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30};

        int top = 0,
                bottom = rows - 1,
                left = 0,
                right = columns - 1;

        int index = 0;

        while (true) {
            if (left > right)
                break;

            for (int i = left; i <= right; i++)
                mat[top][i] = arr[index++];
            top++;

            if (top > bottom)
                break;

            for (int i = top; i <= bottom; i++)
                mat[i][right] = arr[index++];
            right--;

            if (left > right)
                break;

            for (int i = right; i >= left; i--)
                mat[bottom][i] = arr[index++];
            bottom--;

            if (top > bottom)
                break;

            for (int i = bottom; i >= top; i--)
                mat[i][left] = arr[index++];
            left++;
        }
        return mat;
    }
}