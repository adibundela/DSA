import java.util.HashMap;
import java.util.Map;

public class climbingStairs {
    public static Map<Integer,Long> memo =new HashMap<>();

    public static Long climbingstrair(int n){
        if(n==1||n==2){
            return (long)n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        Long clvalue = climbingstrair(n-1)+climbingstrair(n-2);
        memo.put(n,clvalue);
        return clvalue;
        
    }
    public static void main(String[] args) {
        int n=45;
        System.out.println("no of ways:"+climbingstrair(n));

    }
}
