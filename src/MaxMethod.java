public class MaxMethod {

    public static void main(String[] args) {

        int[] array = {1, 444488, 0, 5854, -5400005};
        System.out.println("Max value of the array is " + max(array));
    }

    /**
     * Defines max value in the given array.
     */
    public static int max(int[] array) {
        int max = array[0];
        for (int z = 1; z < array.length; z++) {
            if (array[z] > max) {
                max = array[z];
            }
        }
        return max;
    }
}

