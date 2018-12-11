public class exponentialSearch {


    /**
     * Exponential Search requires the array to be sorted and is done in two steps:
     * Find a range where X is present ( [i/2, i] )
     * Perform Binary Search in that range
     * @param arr : The array
     * @param n   : Size of the array
     * @param x   : Value to search for
     * @return    : index of X (-1 if not found)
     */
    public static int exponentialSearch(int[] arr, int n, int x){

        if (arr[0] == x) //value is in the first position
            return (0) ;

        int i = 1;
        while (i < n && arr[i] <= x){
            i*=2;
        }
        return ( binarySearch.binarySearch(arr, i/2, i, x) );
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };

        /*
         * Binary Search requires the array to be sorted In this example it already is.
         */
        int index = exponentialSearch(arr, arr.length, 89);
        System.out.println("Element 89 is in position: " + index);
    }
}