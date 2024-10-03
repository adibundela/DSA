

public class end {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }


    }
    /////////////////////////////////////////////////////////
    // implementation of insertation at any node
    public void insrtAtAnyNode(){};
    ////////////////////////////////////////////////
    // implimentation of insertation ar begening

    public void insrtbegening(int data){
        Node newnode = new Node(data);
        // check if ll is empty
        newnode.next=head;
        head =newnode;
    }
    //////////////////////////////////////////////////////////////
    // implimentation of intertion at aend
    public void insrtend(int data){
        Node newnode =new Node(data);
        // check ll is empty or not 
        if(head==null){
            head = newnode;
            return;
        }
        // ll is not empty
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next=newnode;
        return;

    }
    ///  displaying the ll
    public void disp(){
        Node curr =head;
        while (curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();

        return;
    }
    public static void main(String[] args) {
        end ll =new end();
        ll.insrtend(5);
        ll.insrtend(6);
        ll.insrtend(7);
        ll.disp();
        ll.insrtbegening(3);
        ll.disp();
    }
}
