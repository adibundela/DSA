/*          
 *          time com = o(n)
 *          space com =O(1)
 * 
 */






import java.util.Scanner;


public class liniarSearch {

    static void liniar_Search(int[] arr ,int n,int x){

        int idx=-1;
        for(int i=1;i<n;i++){
            if(arr[i]==x){
                idx= i;
                break;
            }
        }
        if(idx==-1){
            System.out.println("The element you wana search is not present in array ");
        }
        else{
            System.out.println("Element "+x+"present at "+idx+"index in array");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of Array:");
         int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element which you want to search in Array :");
        int x =sc.nextInt();
        liniar_Search(arr, n, x);
    }
}
