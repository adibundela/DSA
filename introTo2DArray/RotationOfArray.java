package introTo2DArray;

//     rotate 90 degree

//    Transpose of  a 2d array and swap the rows = 90 degre



public class RotationOfArray {
      static void swap(int arr[][]){
            
       for(int j=0;j<=arr.length-1;j++) {        
      for(int i=0;i<=arr.length-1;i++){
            int fi=0;
           int li = arr.length-1;
           if(fi<li){
           int temp =arr[j][fi];
           arr[j][fi]=arr[j][li];
           arr[j][li]=temp;
           fi++;
           li--;
           }
            
        }}

            }

                               
                          
                        

                  
          

      
    
      static void transvers(int arr[][]){
            for(int i=0;i<arr[0].length;i++){
                  for(int j=0;j<i;j++){
                        int temp = arr[i][j];
                         arr[i][j]=arr[j][i];
                         arr[j][i]=temp;
                  }
            }
      }
      static void Printarray(int arr[][]){
            for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                  System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
      }
      public static void main(String[] args) {
        
        int [][]arr = { {1,2,3}, {4,5,6}, {7,8,9} };

        System.out.println("given array");

            Printarray(arr);
        
        transvers(arr);

        System.out.println("after transverse");

            Printarray(arr);
        System.out.println("after swap it is comlite rotation");

           swap(arr);
         

         Printarray(arr);
       

      }  

}
