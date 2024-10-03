/*       
 * 
 *          by using lenear search 
 * 
 * 
 */





import java.util.Scanner;

public class _1st_OccurenseOfElement {
    static int firstOccurence(int[] arr, int x,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }

        }
        return -1;


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
        int x = sc.nextInt();
        int res =firstOccurence(arr,x,n);
        if(res==-1){
            System.out.println("given target is not found");
        }
        else{
            System.out.println("your target is present at this index:"+res);
        }
    }
}
