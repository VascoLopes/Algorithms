import java.lang.Math;
public class jumpSearch {

    /**
     * int arr[] : the array to search in
     * int size  : array size
     * int x     : the element to look for
     */
    public static int jumpSearch(int[] arr, int size, int x) {
        int step = (int)Math.floor(Math.sqrt(size)); // step = √(size) 
    
        int prev = 0;
        int curr = step;
        // Perform jumping steps to search for a higher element than x
        while( arr[Math.min(curr,size)-1] < x ){
            prev = step;
            curr += step;
            if (prev >= size){
                return (-1); //Is not on the array
            } 
        }

        while ( arr[prev] < x ){
            prev++;

            if( prev == Math.min(step,size))
                return (-1); //Reached the end of the array 
                            //and element is not present
        }
        // Element is at "prev" index
        if ( arr[prev] == x)
            return (prev);
        return (-1);
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 
            34, 55, 89, 144, 233, 377, 610}; 

            int index = jumpSearch(arr, arr.length, 89);
            System.out.println("Element 89 is in position: "+index);
        
    }
} 