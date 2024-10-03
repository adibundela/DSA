public class imp_maxHeap {
    // time comp = O(n)

    
    public static void hepiphy(int[] arr,int n,int i){
        // assume lasrgest element is your root element 
        int largest = i;
        int leftidx =2*i+1;
        int rightidx =2*i+2;
        if(leftidx<n && arr[leftidx]>arr[largest]){
            largest =leftidx;
        }
        if(rightidx<n && arr[rightidx]>arr[largest]){
            largest = rightidx;
        }
        if(i!=largest){
            int temp = arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            //appliying recursion in downword direction
            hepiphy(arr, n,largest);
        }
    }
    public static void buildHeap(int[] arr,int n){
        // this is last non leaf element idx
        int stidx =n/2 -1;
        for(int i=stidx;i>=0;i--){
            // function calling
            hepiphy(arr,n,i);
        }
    }
    public static void display(int[] arr ,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,6,13,10,9,8,15,17};
        int n =arr.length;
        System.out.print("displaying the cbt in array form: ");
        display(arr, n);
        // turn cbt into max heap
        buildHeap(arr,n);
        System.out.print("displaying the heap in array form: ");
        display(arr,n);
    }
}
