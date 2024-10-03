// there are considar two pointer 1. move ove step 
//                                2. move two step

public class twoPointerApproch {
    Node head; 

    public static class Node { 
        int data; 
        Node next; 
  
        Node(int data) { 
            this.data = data; 
            next = null; 
        } 
    } 
  
    public void middle(Node current) { 
        current=head;
        Node slow=head;
        Node fast = head;
         while (fast!=null&&fast.next!=null) {
           slow=slow.next;
           fast=fast.next.next;
         }
         System.out.println("MiddleofLL"+slow.data);
         
         return;
        
  
    } 
  
    void insertAtBeginning(int key) { 
        // Create new node 
        Node newNode = new Node(key); 
        newNode.next = head; 
        head = newNode; 
        return; 
    } 
  
    void displayList() { 
        Node current = head; 
        while (current != null) { 
            System.out.print(current.data + " "); 
            current = current.next; 
        } 
        return; 
    } 
  
    public static void main(String[] args) { 
        twoPointerApproch obj = new twoPointerApproch(); 
        obj.insertAtBeginning(5); 
        obj.insertAtBeginning(7); 
        obj.insertAtBeginning(8); 
        obj.insertAtBeginning(76); 
        obj.insertAtBeginning(13);
        obj.displayList(); 
        System.out.println();
        obj.middle(obj.head); 
       
    } 
}
