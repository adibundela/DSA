// package greek&greek_practice;

/*        wave= arr[0]>=arr[1]<=arr[2]>=arr[3]<=
 * 
 * 
 */

public class wavesInArray {
    static void swap(int arr[],int i,int j){
              int  temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

    }
    static void wave(int arr[] ,int n){
       
        for(int i=0;i<n;  i++){
         
            if(  i%2==0){
                
                swap(arr,i,i+1);
                
                
                
                


            }
          
           


        
        }
    
    }
   static void printarray(int arr[],int n){
         for(int i=0;i<n;i++){
            System.out.print(arr[i]);
         }
   }
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5,};
        wave(arr, n);
        printarray(arr,n);
    }
}
