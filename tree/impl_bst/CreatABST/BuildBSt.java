

public class BuildBSt {
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
    //  Inorder Traversal
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
        return;
    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root =insert(root,values[i]);
        }
        Inorder(root);

    }
}
