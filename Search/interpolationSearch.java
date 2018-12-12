
public class interpolationSearch{

    /**
     * InterpoaltionSearch needs
     * a sorted array of uniformly distributed values 
     * int arr[] : the array to search in
     * int size  : array size
     * int x     : the element to look for
     * int lo    :
     */
    public static int interpolationSearch(int[] arr, int size, int x){
        int lower = 0, higher = size-1;

        while( (lower < higher) && (x >= arr[lower]) && (x <= arr[higher])){
            int pos = lower + (((higher-lower) / 
            (arr[higher]-arr[lower]))*(x - arr[lower])); 

            if ( arr[pos] == x )
                return (pos);

            if ( arr[pos] < x )
                lower = pos+1;
            else
                higher = pos-1;
        }

        return (-1);
    }

    public static void main(String[] args){ 
        int arr[] = {10, 12, 13, 16, 18, 19, 20,
            21, 22, 23, 24, 33, 35, 42, 47}; 
    
            System.out.println("Element 23 is in position: "+interpolationSearch(arr,arr.length,23));
            
    }

}