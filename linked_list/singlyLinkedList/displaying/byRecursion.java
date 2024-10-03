

public class byRecursion {
    Node head;
    public static class Node
     {
        int data;
        Node next;
        Node (int data)
        { 
           this.data=data; 
                next=null;

        }
    }
    
    //this recursive method display ll

    public  void displayll(Node head)
    {  
         if(head==null){
          return;
        }
        System.out.print(head.data+" ");
        displayll(head.next);
        return;
    }

    //This recursive function shows reverse linked list 

    public  void displayllreverse(Node head)
    {  
         if(head==null){
          return;
        }
        displayllreverse(head.next);
        System.out.print(head.data+" ");
     
        return;
    }
    public static void main(String[] args) {
        
    }
}
