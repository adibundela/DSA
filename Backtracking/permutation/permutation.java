
// Permutation --> arrangements of order
//   -order matters 

import java.util.ArrayList;
import java.util.List;

//  Q-> given an array or n distinct num. make all possible permutation 


public class permutation{
    public static void Backtrack(List<List<Integer>> result ,List<Integer> perm,int[] nums){
        if(perm.size()==nums.length){
            result.add(new ArrayList<>(perm));
            return;
        }
        for(int i=0 ;i<nums.length;i++){
        if(perm.contains(nums[i]))
            continue;
        perm.add(nums[i]);
        Backtrack(result, perm, nums);
        perm.remove(perm.size()-1);
        }
    }

    public static List<List<Integer>> Permutation(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Backtrack(result,new ArrayList<>(),nums);
        return result;
    }
    public static void main(String[] args) {
        List<List<Integer>> ans =new ArrayList<>();
        int[] p ={1,2,3};
        ans = Permutation(p);
        System.out.println(ans);
        
    }
}