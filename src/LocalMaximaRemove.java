
import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 0, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    /**
     * Removes local max numbers from array.
     */
    public static int[] removeLocalMaxima(int[] array) {

        int[] niu = new int[array.length];

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] <= array[i - 1] || array[i] <= array[i + 1])

                niu[i] = array[i];
        }
        if (array[0] <= array[1])
            niu[0] = array[0];

        if (array[array.length - 1] <= array[array.length - 2])
            niu[niu.length - 1] = array[array.length - 1];

        //System.out.println(Arrays.toString(niu));

        int nonZeroCount = 0;

        for (int i = 0; i < niu.length; i++) {
            if (niu[i] != 0)
                nonZeroCount++;
            if (array[i] == 0)
                nonZeroCount++;
        }

        int[] sorted = new int[nonZeroCount];

        int anotherCount = 0;
        for (int i = 0; i < niu.length; i++) {
            if (niu[i] != 0||array[i]==0)
            {
                sorted[anotherCount] = niu[i];
                anotherCount++;
            }
        }
        return sorted;
    }
}