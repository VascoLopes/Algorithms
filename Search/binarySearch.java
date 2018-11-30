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
        int [] arr = new int[100];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = (a + 1) * 10;
        }
        
        /*
        Binary Search requires the array to be sorted
        In this example it already is.
        */
        int index = binarySearch(arr, 0, arr.length, 120);
        System.out.println("Element 120 position in array: "+index);
    }
}