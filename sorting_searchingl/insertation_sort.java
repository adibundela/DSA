/*   time complaxity--o(n^2)
 *   space complaxity--o(1)
 * 
 */
import java.util.Arrays;

public class insertation_sort {
    static void insertation_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int j=i;
            while (j>0&&arr[j]<arr[j-1]) {
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr={12,34,7,5,46,34};
        insertation_sort(arr);
        System.out.println("sorted array is :");
        System.out.println(Arrays.toString(arr));
    }
}
