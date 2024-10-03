public class itratly {
    Node head; 

  public static class Node { 
      int data; 
      Node next; 

      Node(int data) { 
          this.data = data; 
          next = null; 
      } 
  } 

  public void reverse(Node current) { 
      current=head;
      Node nextptr = null;
      Node previous=null;
       while (current!=null) {
          nextptr=current.next;
          current.next=previous;
          previous = current;
          current=nextptr;
       }
       head=previous;
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
      itratly obj = new itratly(); 
      obj.insertAtBeginning(5); 
      obj.insertAtBeginning(7); 
      obj.insertAtBeginning(8); 
      obj.insertAtBeginning(76); 
      obj.displayList(); 
      obj.reverse(obj.head); 
      System.out.println("and"); 
      obj.displayList(); 
  } 
}
