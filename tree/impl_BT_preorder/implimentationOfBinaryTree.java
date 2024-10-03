
public class implimentationOfBinaryTree{

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
    /////////////////////// ########### PRE ORDRER  #######//////////////////////////////////
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        return;
    }

    ////////////////////  ############## IN ORDER ####### ///////////////////////////////////

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        preorder(root.left);
        System.out.print(root.data+" ");
        preorder(root.right);
        return;
    }
    /////////////////###############3 POST ORDER #####//////////////////////////////////

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data+" ");
        return;
    }


    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree =new binaryTree();
        Node root= tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }
}