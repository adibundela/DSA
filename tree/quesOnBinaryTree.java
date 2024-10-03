public class quesOnBinaryTree {
    static class Node{
        int data;
        Node left;  // left pointer
        Node right; // right pointer
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class binaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
             newNode.left = buildTree(nodes);
             newNode.right= buildTree(nodes);

             return newNode;

        }
    }
    ///////////    COUNT NODES   //////////////
        static int counNodes(Node root){
            if(root==null){
                return 0;
            }
            int countOfleft = counNodes(root.left);
            int countOfright = counNodes(root.right);
            return countOfleft+countOfright+1;
        }
    /////////  SUM OF NODES /////////////////
        static int sumNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftsum = counNodes(root.left);
            int rightsum = counNodes(root.right);
            return leftsum+rightsum+root.data;
        }


    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree =new binaryTree();
        Node root= tree.buildTree(nodes);
        System.out.println("no of Nodes :"+ counNodes(root));
        System.out.println();
        System.out.println("sum of Nodes :"+ sumNodes(root));
       
    }
}
