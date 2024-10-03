

public class byloopj {
    Node head;
public static class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
  
public void displayLinkedList()
{
    // Traverse the linked list and print the data of each node
    Node current = head;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
    
}
