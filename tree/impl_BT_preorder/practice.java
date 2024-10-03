public class practice {
    static class Node {
        int data;
        Node left ;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static class btree {
      
        
        static int idx=-1;
        public static Node buildBT(int[] val){
            idx++;
            if(val[idx]==-1){
                return null;
            }
           Node newNode =new Node(val[idx]);
           newNode.left = buildBT(val);
           newNode.right = buildBT(val);
          

           return newNode;
         
        }
    }
    public static void main(String[] args) {
        int[] val ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        btree tree = new btree();
        Node root = tree.buildBT(val);
        System.out.println(root.data);

    }
}
