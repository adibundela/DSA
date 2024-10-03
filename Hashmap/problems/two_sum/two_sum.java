import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class two_sum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        // declaring Array
        int[] arr = new int[n];
        for (int i : arr) {
          arr[i]=sc.nextInt();
        }
        // input target element 
        System.out.print("Enter the target value:");
        int t = sc.nextInt();

        // creat a hash map whare key = arr[i] & value = i
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
          map.put(arr[i],i);
        }
        // creat a array to display result 
        int[] result =new int[2];

        // if current == target ;
        for(int i=0; i<n;i++){
          if(arr[i]==t && map.containsKey(0)){
            result[0]=i;
            result[1]= map.get(0);

          }
          else if(map.containsKey(t-arr[i])){
              // check elemant is non repetable 
              if(map.get(t-arr[i])>i){
                  result[0]=i;
                  result[1]= map.get(t-arr[i]);
                  break;
              }

          }
        }
        System.out.println(" Element present on the index whose sum is :"+t+"these are indexes:"+Arrays.toString(result));

     }
    
}