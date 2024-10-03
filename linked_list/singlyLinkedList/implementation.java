
public class implementation {
    public static class Node {
      int value;
      Node next;
      Node (int value){
        this.value=value;
        this.next=next;
      }
        
    }

     public static void main(String[] args) {
        Node A = new Node(5);
        Node B = new  Node( 6);
        Node C = new Node(7);
        A.next=B;
        B.next=C;
        System.out.println(A);
        System.out.println(A.next);
        System.out.println(B);
        System.out.println(B.next);
        System.out.println(C);
        System.out.println(C.next);
        

    
    }
    
}