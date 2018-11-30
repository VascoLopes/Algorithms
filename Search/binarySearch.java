public class binarySearch{

    /**
     * int arr[] : the array to search in
     * int l     : the left index of the subarray
     * int r     : the right index of the subarray
     * int x     : the element to look for
     * return    : (-1) if not found, (i) otherwise
     */
    public static int binarySearch(int arr[], int l, int r, int x){
        if(l < r){
            int mid = l + (r-l) /2;
            if (arr[mid] == x)
                return (mid);
            
            if (arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);

            return binarySearch(arr, mid+1, r, x);
        }
        return (-1);
    }

    public static void main(String[] args){ 
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 
            34, 55, 89, 144, 233, 377, 610}; 
        
        /*
        Binary Search requires the array to be sorted
        In this example it already is.
        */
        int index = binarySearch(arr, 0, arr.length, 89);
        System.out.println("Element 89 is in position: "+index);
    }
}