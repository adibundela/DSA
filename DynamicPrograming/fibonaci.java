import java.util.HashMap;
import java.util.Map;

public class fibonaci {

    // creat hasmap
    public static Map<Integer,Long> memo = new HashMap();
        
    ///////////////////////////////////////////////////////////
    public static int fibo(int n){
        // base case condition 
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);

        /// took long time 
    }
    /////////////////////////////////////////////////////////
    // impliment dynamic programing
    // time complecxity - O(n)
    // space c = stack space + has table
    public static long fibMemo(int n ){
        // base case condition 
        if (n<=1){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        long fibVal = fibMemo(n-1)+fibMemo(n-2);
        memo.put(n, fibVal);
        return fibVal;

    }
    /////////////////////////////////////////////////
    // Tabuation approch of DYNAMIC PROGRAMING 
    public static long fiboTab(int n){
        long[] fib = new long[n+1];
        fib[0] =0;
        fib[1] = 1;
        for(int i=2;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];

    }
    /////////////////////////////////////////////////////
    // more optimal approch in tabulation by using variable 
    // time c = O(n) same 
    // space c = O(constent)  redused

    public static long fiboTabOpt(int n){
        long first =0;
        long second =1;
        for(int i =2;i<=n;i++){
            long third =first+second;
            first =second;
            second=third;

        }
        return second;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibo(n));
        /// by DP we can calculate fibo series of 100 
        System.out.println(fibMemo(100));
        // DP by Tabuation 
        System.out.println(fiboTab(100));
        // most optimal approch
        System.out.println(fiboTabOpt(100));
    }
} 