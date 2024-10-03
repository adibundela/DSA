

public class deletion_ll {
    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertAtEnd(int newData) {
        // Create a new node
        Node newNode = new Node(newData);

        // Check if the linked list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // If the linked list is not empty, traverse to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Insert the new node at the end of the linked list
        temp.next = newNode;
    }

    public void displayLinkedList() {
        // Traverse the linked list and print the data of each node
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    // implementation of deletion inLL
    public void deletion(int position){
        if(head==null){
            return;
        }
        Node temp = head;
        // declaration for deletion at begenaning
        if(position==0){

            head=temp.next;
            return;
        }
        // for rather then starting
        for(int i=0;temp!=null&&i<position-1;i++ ){
            temp=temp.next;
        }
        if (temp==null&&temp.next==null) {
            return;
        }
        temp.next=temp.next.next;
    }

    public static void main(String[] args) {
        // Create an object of the at_end class
        deletion_ll obj =new deletion_ll();

        // Insert elements into the linked list
        obj.insertAtEnd(6);
        obj.insertAtEnd(7);
        obj.insertAtEnd(45);
        obj.insertAtEnd(32);

        // Display the linked list
        obj.displayLinkedList();
        // delateion
        obj.deletion(2);
        obj.displayLinkedList();
    }
}
