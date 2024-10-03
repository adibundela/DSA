
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class undirectedGraphs {
    ///////////////////     CYCLE DETECTION FOR DIRECTED GRAPH////////////////////////
    public static boolean dfsforDcycle(int s,boolean[] vis,boolean[] dfsv,ArrayList<ArrayList<Integer>> adj){
        vis[s]=true;
        dfsv[s]=true;
        for (int i :adj.get(s)) 
        {
            /// if dfs get cycle it return true and this if condition send this true to upword
            if(vis[i]==false)
            {
                if(dfsforDcycle(i, vis, dfsv, adj))
                {
                return true;
                }
                
            }
            /// when if condition is not run it means vis[i]=true now check dfsv[i] also true or not 
            else if(dfsv[i]==true)
            {
                return true;
            }
        }
        dfsv[s]=false;
        return false;
    }
    public static boolean iscyleforD(int v,ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v];
        boolean[] dfsv =new boolean[v];
        // we have to call dfs for all nodes if we have dis jointed graph so it work properly
        for(int i=1;i<=v;i++){
           if(dfsforDcycle(i,vis,dfsv,adj)){
             return true;
           }
           
        }
        return false;
    }
    ////////////////// CYCLE DETECTION ///////////
    public static boolean dfsforcyl(int s,int p,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[s]=true;

        // call dfs on connection
        for (int i:adj.get(s)) {
           if(vis[i]==false){
             if(dfsforcyl(i, s, vis, adj)==true){
                return true;
             }
           }
           else if(vis[i]==true&& p!=i){
            return true;
           }
        }
        return false;
    }
    public static boolean iscyle(int v , ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v];
        if(dfsforcyl(0,-1,vis,adj)==true){
            return true;
        }
        else{
            return false;
        }
    }
    ///////////////// TOPOLOGICAL SORTING//////////
    public static void dfsfortopo(int s,boolean[] vis,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st){
        vis[s]=true;
        for (int i: adj.get(s)) {
            if(vis[i]==false)
                dfsfortopo(i, vis, adj, st);
        }
        st.push(s);

    }
    public static int[] toposort(int v,ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v];
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[v];
        for(int i=0;i<v;i++){
            dfsfortopo(i, vis, adj,st);
        }
        int i =0;
        while (!st.isEmpty()) {
            ans[i] =st.pop();
            i++;

        }
        return ans;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////DFS////////////////////
    static ArrayList<Integer> ans = new ArrayList<>();
    public  static void dfs(int s , boolean[] vis,ArrayList<ArrayList<Integer>> Adj){
        vis[s] = true;
        ans.add(s);
        for (int i : Adj.get(s)) {
            if(vis[i]==false)
                dfs(i, vis, Adj);
        }
    }
    public static ArrayList<Integer> dfsofGraph(int v,ArrayList<ArrayList<Integer>> Adj){
        boolean[] vis = new boolean[v];
        dfs(0,vis,Adj);
        return ans;
    }

    ////////////////////// BFS ///////////////////////
    public static ArrayList<Integer> bfs(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int x = q.remove();
            if (vis[x]==false) {
                vis[x]=true;
                ans.add(x);
                for (int i:adj.get(x)) {
                    q.add(i);
                }
            }
        }
        return ans;
    }
    ///////////////////////BUILD GRAPH/////////////////////
    public static void addEdages(ArrayList<ArrayList<Integer>> Al,int u,int v){
        // undirected graph
        Al.get(u).add(v);
        Al.get(v).add(u);
    }
    ///////////////////BUILD DIRECTED GRAPH ///////////////////
    public static void addEdagesforDirected(ArrayList<ArrayList<Integer>> Al,int u,int v){
        // directed graph
        Al.get(u).add(v);
        
    }

    public static void main(String[] args) {
        // creat adjecency list
        int v =4;
        ArrayList<ArrayList<Integer>> Al = new ArrayList<>(v);
        // initialy array list is empty so it cant work for get(0)
        for(int i =0; i<v;i++){
            Al.add(new ArrayList<>());
        }

        // add edges(arraylist,from,to)

        addEdages(Al,0,1);
        addEdages(Al,0,2);
        addEdages(Al, 1, 3);
        addEdages(Al, 2,3 );
        System.out.println(Al);
    ////////////dfs call
        System.out.println("DFS:"+" "+dfsofGraph(4, Al));

    ////////////BFS call
        System.out.println("BFS:"+" "+bfs(v, Al));
    
    ///////////toposort call
        // System.out.println("toposort:"+toposort(v, Al));

    /////////// cycle dedection

        System.out.println("Is cycle present :"+ iscyle(v, Al));

        ///// creat new directed graph
        int v2 =5;
        ///// cause source start with 1 so we have to creat leanth 6arraylist 
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>(v2+1);
        for(int i =0; i<=v2;i++){
            adj2.add(new ArrayList<>());
        }
        addEdages(adj2,1,2);
        addEdages(adj2, 2, 3);
        addEdages(adj2, 1, 4);
        addEdages(adj2, 4, 5);
        addEdages(adj2, 5,1);

        System.out.println("Is cycle present in Directed graph :"+iscyleforD(v2, adj2));
        
    }
}
