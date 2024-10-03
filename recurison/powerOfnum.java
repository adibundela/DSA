/*
 *          time comp---O(b)
 * 
 * 
 */

import java.util.Scanner;

public class powerOfnum {
   static int power(int a ,int b){
      if(b==1){
        return a;
      }
      return a*power(a, b-1);
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base:");
        a=sc.nextInt();
         System.out.print("Enter the power");
        b=sc.nextInt();

        int res= power(a, b);
        System.out.println("power "+b+"of"+a+"is:"+res);
    }
}
