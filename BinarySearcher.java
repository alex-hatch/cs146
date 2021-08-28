package cs146;

/**
 * A class for executing binary searches in an array.
 */
public class BinarySearcher {
    /**
     * Finds a value in a range of a sorted array, using the binary
     * search algorithm.
     *
     * @param a     the array in which to search
     * @param low   the low index of the range
     * @param high  the high index of the range
     * @param value the value to find
     * @return the index at which the value occurs, or -1
     * if it does not occur in the array
     */
    public static int search(int[] a, int low, int high, int value) {
        // Continue recursion while the pointers have not crossed (still elements to look at)
        if (high >= low) {
            // calculate the new "middle" index of array
            int mid = (low + high) / 2;

            // We have successfully found the value we are searching for so return the index of that value
            if (a[mid] == value)
                return mid;

            // if our value is less than the value at the mid point, search the lower half of the array
            if (a[mid] > value)
                return search(a, low, mid - 1, value);

            // implied else, value must be greater than the number at middle index so search top half of list
            return search(a, mid + 1, high, value);
        }
        // unsuccessful search; return -1
        return -1;
    }
}


