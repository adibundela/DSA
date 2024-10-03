/*      Binary search -----> Array is sorted already
 *          mid value=>(low+high)/2
 *          mid value=> low +(high-low)/2
 *          time com. => O(logN)
 *          space com. => O(1)
 * 
 * */




import java.util.Scanner;

public class BinarySearch {
    public static int Binary_search(int[] arr,int n,int x){
       int  low=0;
        int high=n-1;
         while (low<=high) {
            
         
        int mid = low + (high-low)/2;
         if (arr[mid]==x) {
            return mid;
         }
         else if(arr[mid]<x){
            low=mid+1;  
         }
         else{
            high=mid-1;
         }}
         return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n =sc.nextInt();
        System.out.println("Enter the element of Array:");
        int[] arr =new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target:");
        int x=sc.nextInt();
        int res=Binary_search(arr,n,x);
        if (res==0) {
            System.out.println("The target value is not present in Array");
        }
        else{
            System.out.println("The value presen at this index :"+res);
        }
    }
}
