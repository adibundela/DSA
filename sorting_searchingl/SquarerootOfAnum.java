
/*       modification of binary search
           QUESTION---> 
  *             num=16
            mid = (0+16)/2====18

            val=8*8=64

            if==64>num----then high=mid-1;
            if==val<num----then 
            {   

                floor value= low --------------> "store flore value if num is not perfec num then print store flore value"

                low = mid+1;

            }
  */

import java.util.Scanner;


public class SquarerootOfAnum {

    public static int sqroot(int num){
        int low=0,high =num,result=-1;
        while (low<=high) {
            
            int mid = low+(high-low)/2;
            long val= mid*mid;

            if(val==num){
                // perfact sqroot
                  
                return mid;
            }
            else if(val>num){
                     
                high=mid-1;


            }
            else {
                // store the floore value-if num is not per fect sq root value 
                 
               result=mid;
               low = mid+1;
            }

        }
        
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no for sq root");
        n=sc.nextInt();
        
        
       
       int res=  sqroot(n);
       System.out.println("sq root ="+res);

    }
}
