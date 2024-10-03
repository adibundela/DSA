/*  note 1. At every altration we get smallest eliment at exterem left corner 
 *       2. time complaxity--o(n^2)
 *       3. space complaxity --o(1)
 *       4. more swap ---> bubble sort 
 *          single swap in each altr.---->slectation sort
 * 
 */
import java.util.Arrays;


public class selection_sort
 {
    static void Selection_sort(int[] arr)
    {
        for(int i=0;i<=arr.length-1;i++){
            
            int min_idx=i;
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }

            }
            // swap(arr[min_idx],arr[i])
            
            if(min_idx !=i)
            {int temp = arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
            }

        }
    }
    public static void main(String[] args) 
    {
        int[] arr={23,5,65,32,4,53,21};
        Selection_sort(arr);
        System.out.println("sorted list is :");
        System.out.println(Arrays.toString(arr));

    }

}
