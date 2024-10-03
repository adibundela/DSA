//  Combination --> order does not matters 
//      selection
//    k---------> combinatation of k
import java.util.*;


public class combinaton {
    public static void backtracking(List<List<Integer>> result,List<Integer> comb,int start,int n,int k)
    {
        if(comb.size()==k){
            result.add(new ArrayList<>(comb));
            return;
        }
        for(int i=start;i<=n;i++){
            comb.add(i);
            backtracking(result, comb, i+1, n, k);
            comb.remove(comb.size()-1);
        }
    }
    public static List<List<Integer>> combina(int n ,int k )
    {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result,new ArrayList<>(),1,n,k);
        return result;
    }

    public static void main(String[] args) 
    {
        int[] nums ={1,2,3};
        List<List<Integer>> result = combina(4, 2);
        System.out.println(result);
    }
}
