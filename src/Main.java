
public class Main {

    public static void main(String[] args) {

        // range is [33;333], 5 random numbers

        int a = (int) (Math.random() * 301 + 33);
        int b = (int) (Math.random() * 301 + 33);
        int c = (int) (Math.random() * 301 + 33);
        int d = (int) (Math.random() * 301 + 33);
        int e = (int) (Math.random() * 301 + 33);
        int[] array = {a, b, c, d, e};
        System.out.println("5 random numbers in the range [33;333] are: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ".");

        int max = array[0];
        for (int z = 1; z < array.length; z++) {
            if (array[z] > max) {
                max = array[z];
            }
        }
        System.out.println("Max value of the array is " + max + ".");

        int min = array[0];
        for (int z = 1; z < array.length; z++) {
            if (array[z] < min) {
                min = array[z];
            }
        }

        System.out.println("Min value of the array is " + min + ".");
    }
}

