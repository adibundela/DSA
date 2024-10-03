public class lower_bound {
    //   tc- O(logN)

    public static int checkLowerBound(int[] arr,int target){
        
        int low =0;
        int high =arr.length-1;
        int result =-1;
        while (low<=high) {
            int mid =low+(high-low)/2;
            if(arr[mid]==target){
                result =mid;
                // traverse to left side
                high = mid-1;
            }
            else if(arr[mid]>target){
                // traverse to the left side 
                high=mid-1;
            }
            else{
                // traverse to right side
                low = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,4,5,5,6,7,7}; ///          sorted array  let our target is 7 then we have to return lower bound of accurance is 6 not 7
        System.out.println("index of lower ocurrance of targate:"+checkLowerBound(arr, 5));
    }
}
