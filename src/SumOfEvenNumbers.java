
public class SumOfEvenNumbers {

    public static void main(String[] args) {

        int[] array = new int[]{1, 6, 11, 8};

//        if (array == null||array.length==0) {
//            System.out.println(0);
//        } else {
        System.out.println(sum(array));
    }

    /**
     * Adds even numbers from array.
     */
    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        } else {
            int evenSum = 0;
            for (int z = 0; z < array.length; z++) {
                if (array[z] % 2 == 0) {
                    evenSum += array[z];
                }
            }
            return evenSum;
        }
    }
}