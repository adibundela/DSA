

public class delete {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
        
    }
    
    public static Node insert(Node root ,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    // delete  a  node
    public static Node delNode(Node root , int val){
        if (root.data>val){
            root.left=delNode(root.left, val);
        }
        else if(root.data<val){
            root.right = delNode(root.right, val);
        }
        else{// root.data == val
            // case 1 --> 0 child
            if(root.left==null&&root.right==null)
            {
                // update by null (delete the node)
                return null;
            }
            // case 1 ----> 1 child
            if(root.left==null)
            {
                return root.right;
            }
            
        }
    }
    
   public static void main(String[] args) {
    int[] values = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root =insert(root,values[i]);
        }
        //   check key is found or not 
        if(search(root, 5)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
        
   }
}
