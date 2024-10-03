public class recarsively { 
  Node head; 

  public static class Node { 
      int data; 
      Node next; 

      Node(int data) { 
          this.data = data; 
          next = null; 
      } 
  } 

  public void reverse(Node current, Node previous) { 
      if (current.next == null) { 
          head = current; 
          current.next = previous; 
          return; 
      } 
      Node nextPtr = current.next; 
      current.next = previous; 
      reverse(nextPtr, current); 
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
      recarsively obj = new recarsively(); 
      obj.insertAtBeginning(5); 
      obj.insertAtBeginning(7); 
      obj.insertAtBeginning(8); 
      obj.insertAtBeginning(76); 
      obj.displayList(); 
      obj.reverse(obj.head, null); 
      System.out.println(); 
      obj.displayList(); 
  } 
}