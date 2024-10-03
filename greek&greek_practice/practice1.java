/*     
 * 
 *      F(n)= 1+2*3+4*5*6+7*8*9*10+...........................N
 * 
 * 
 * 
 * 
 * 
*/


import java.util.Scanner;

public class practice1 {
    static long fun(int n){
        long sum=0;
        long count=1;
        for(int i=1;i<=n;i++){
            long multi_res=1;
            for(int j=1;j<=i;j++){
                multi_res = count*multi_res;

                
                count++;
            }
            sum+=multi_res;
           
        }
        
        return sum;
      
    }
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = fun(n);
        System.out.println("F("+n+")"+"is equal to:"+sum);
    }
}
