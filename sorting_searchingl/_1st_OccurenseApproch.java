/*               Time comp==O(logN)
 *               space comp == O(1)
 * 
 * 
 * 
 */





import java.util.Scanner;

public class _1st_OccurenseApproch {
   public static int findFirstOccurence(int arr[],int n,int x){
     
    int low=0, high =arr.length-1;
    int result=-1;
    while (low<=high) {
        int mid=low+(high-low)/2;
       
        if (arr[mid]==x){
            result= mid;
            high = mid-1;
        }
        else if (x<arr[mid]){
            high=mid-1;

        }
        else{
            low = mid+1;
        }

    }
       return result;


    }
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of Array");
         int n =sc.nextInt(); ;
         int[] arr = new int[n];
         System.out.println("Enter the sorted elements of Array");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Give the Target:");

        int x =sc.nextInt();


        int result = findFirstOccurence(arr,n,x);
        if (result==-1){
            System.out.println("Target element is not present in an array");
        }
        else{
            System.out.println("element present at index"+result);
        }



    }
}
