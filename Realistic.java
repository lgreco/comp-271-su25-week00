import java.util.Arrays;

public class Realistic {

    /**
     * Scan the entire array to find its smallest value
     * @param arr int[] array to explore
     * @return int with the smallest value in array arr
     */
    public static int getSmallest(int[] arr) {
        int smallest_index = 0; // Assume smallest is first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[smallest_index]) {
                smallest_index = i; // found new smallest, update index
            } 
        } // when loop is done, smallest_index points to smallest element
        int result = arr[smallest_index];
        // Reduce the input array to omit smallest element about to return
        int[] temporary = new int[arr.length -1];

        /* Using two for loops 
        for (int i = 0; i < smallest_index; i++) {
            temporary[i] = arr[i];
        }
        for (int i = smallest_index+1; i < arr.length; i++) {
            temporary[i-1] = arr[i];
        } */

        /* Using a while loop */
        int temp_index = 0;
        int arr_index = 0;
        while (arr_index < arr.length) {
            if ( arr_index != smallest_index) {
                temporary[temp_index] = arr[arr_index];
                temp_index++;
            }
            arr_index++;
        }

        arr = temporary; // input array shorted by 1 (removing smallest elem)
        return result; // smallest element
        
    } // method getSmallest

    public static void main(String[] args) {
        int[] testArray = {10, -5, 11, 2};
        System.out.println(getSmallest(testArray));
        System.out.println(Arrays.toString(testArray));
    }
}