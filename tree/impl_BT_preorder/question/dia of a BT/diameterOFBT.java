package question;

public class diameterOFBT {
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
    public static int height(Node root){
        if(root == null)
        {
         return 0;
        }
        int leftHeight = height(root.left);
        int  rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
    public static dia(Node root){
        
    }
    


    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree =new binaryTree();
        Node root= tree.buildTree(nodes);
       
      
    }
    
}
