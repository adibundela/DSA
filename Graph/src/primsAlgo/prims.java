package primsAlgo;
import java.util.*;

public class prims {
    public static void addEdagesforDirected(ArrayList<ArrayList<Integer>> Adj,int u,int v){
        // directed graph
        Adj.get(u).add(v);
        
    }

    public static void main(String[] args) {
        int v =4;
        ArrayList<ArrayList<Integer>> Al = new ArrayList<>(v);
        // initialy array list is empty so it cant work for get(0)
        for(int i =0; i<v;i++){
            Al.add(new ArrayList<>());
        }

        // add edges(arraylist,from,to)

        
        System.out.println(Al);
    }


}
