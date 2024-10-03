// 1. it is a inplace sorting algorithm
// 2. it is a stable sorting algorithm
// 3. it is a comparison based sorting algorithm
// 4. it is a greedy algorithm
// 5. it is not a divide and conquer algorithm 

// In every eltration the right most element is set to be a bigger no.

/*  # compression
 *   (n-i)+(n-2)+(n-3)+.........1 ====> sum of n-1 natural no. -->(n-1)n/2 ------> O(n^2)
 *     |     |      |
 *  1st      2nd
 * altration  altretion
 *  no of     
 * element to 
 * be compare
 */

/*  
 *  if arr[j]>arr[j+1]----->Swap
 *  j++;
 */
//timecomp=====> o(n^2)
// Space comp ===> o(1)
            

import java.util.*;


public class Bubble_sort {
    static void buble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean swap= false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap (arr[j],arr[j+1]);
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap = true;
                    System.out.println();
                }
            }
            if(swap ==false){
                break;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr ={20,15,40,32,21,56};
        buble_sort(arr);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}
