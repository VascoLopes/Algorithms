public class linearSearch{
    
    /**
     * int arr[] : the array to search in
     * int size  : array size
     * int x     : the element to look for
     */
    public static int linearSearch(int[] arr, int size, int x){

        for (int i = 0; i < size; i++) {
            if( arr[i] == x )
                return (i);
        }
        return (-1);
    }
    
    public static void main(String[] args){ 
        int arr[] = {12, 37, 2, 25, 3, 4, 10, 40, 1, 42};

        int index = linearSearch(arr, arr.length, 42);
        System.out.println("Element 42 is in position: "+index);
    }
}
