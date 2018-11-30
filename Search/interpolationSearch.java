
public class interpolationSearch{

    /**
     * int arr[] : the array to search in
     * int size  : array size
     * int x     : the element to look for
     * int lo    :
     */
    public int interpolationSearch(int[] arr, int size, int x){
        int lower = 0, higher = size-1;

        while(){
            int pos = lo + ( (x - arr[lo]) * (hi - lo) 
                    / (arr[hi] - arr[Lo]) )

            if ( arr[pos] == x)
                return (pos);

            if ( arr[pos] > x)
                lower = pos+1;
            else
                higher = pos-1;
        }

        return (-1);
    }

    public static void main(String[] args){ 
        int arr[] = {10, 12, 13, 16, 18, 19, 20,
            21, 22, 23, 24, 33, 35, 42, 47}; 
    
    }

}