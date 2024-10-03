/*
 *          2^64===>  2^32*2^32
 *          2^65===>  2*2^64
 * 
 * 
 */



import java.util.Scanner;
  
  

public class powerOfnumApproach2 {
    static int power (int a ,int b ){
    
        if(b==1){
            return a;
        }

            
           int result = a*power(a,b/2);
        int finalresult= result*result;
        
        if (b%2==0){
            return finalresult;
        }
      
         return a*finalresult;
        
    
        }
   
     
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the base:");
        int a=sc.nextInt();
         System.out.print("Enter the power");
        int b=sc.nextInt();

        int res= power(a, b);
        System.out.println("power "+b+"of"+a+"is:"+res);


    }
}
