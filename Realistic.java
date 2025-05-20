import java.util.Arrays;

public class Realistic {

    /**
     * Scan the entire array to find its smallest value
     * @param arr int[] array to explore
     * @return int with the smallest value in array arr
     */
    public static int getSmallest(int[] arr) {
        // Assume that the first element is the smallest
        int index_smallest = 0;
        // Loop through the rest of the array to find something smaller
        for (int i = 1; i < arr.length; i++) {
            // check if current element at position [i] is smaller
            if (arr[i] < arr[index_smallest]) {
                index_smallest = i;
            }
        }
        return arr[index_smallest];
    } // method getSmallest

    public static void main(String[] args) {
        int[] testArray = {10, -5, 11, 2};
        System.out.println(getSmallest(testArray));
        System.out.println(Arrays.toString(testArray));
    }
}